package com.project.app.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.app.entities.PessoaDesaparecida;
import com.project.app.repository.PessoaDesaparecidaRepository;

@Controller
public class PessoaDesaparecidaController {

    @Autowired
    private PessoaDesaparecidaRepository repository;

    // Diretório onde as imagens serão salvas
    private static final String UPLOAD_DIR = "src/main/resources/static/uploads/";

    // ======= CRUD - CADASTRAR (create)
    @PostMapping("/public/salvar")
    public String salvarPessoa(
            @ModelAttribute PessoaDesaparecida pessoa,
            @RequestParam("foto") MultipartFile foto,
            RedirectAttributes redirectAttributes) {
        
        try {
            // Processar upload da imagem
            if (!foto.isEmpty()) {
                // Criar diretório se não existir
                Path uploadPath = Paths.get(UPLOAD_DIR);
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }

                // Gerar nome único para o arquivo
                String originalFilename = foto.getOriginalFilename();
                String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
                String newFilename = UUID.randomUUID().toString() + fileExtension;

                // Salvar arquivo
                Path filePath = uploadPath.resolve(newFilename);
                Files.copy(foto.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

                // Salvar URL relativa no banco
                pessoa.setFotoUrl("/uploads/" + newFilename);
            } else {
                // Se não enviou foto, usar imagem padrão
                pessoa.setFotoUrl("/img/default-photo.png");
            }

            // Salvar no banco de dados
            repository.save(pessoa);
            
            redirectAttributes.addFlashAttribute("mensagem", "Pessoa desaparecida registrada com sucesso!");
            redirectAttributes.addFlashAttribute("tipoMensagem", "success");

        } catch (IOException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("mensagem", "Erro ao salvar a imagem. Tente novamente.");
            redirectAttributes.addFlashAttribute("tipoMensagem", "danger");
            return "redirect:/cadastro/desaparecido";
        }

        return "redirect:/success";
    }

    // ======= CRUD - LISTAR (read)
    @GetMapping("/public/buscar")
    public String listarPessoas(Model model) {
        List<PessoaDesaparecida> pessoas = repository.findAll();
        model.addAttribute("pessoas", pessoas);
        return "buscar";
    }

    // ======= CRUD - EDITAR (update) - Carregar formulário
    @GetMapping("/public/editar/{id}")
    public String editarPessoa(@PathVariable UUID id, Model model, RedirectAttributes redirectAttributes) {
        Optional<PessoaDesaparecida> pessoaOpt = repository.findById(id);
        
        if (pessoaOpt.isPresent()) {
            model.addAttribute("pessoa", pessoaOpt.get());
            return "editar-desaparecido";
        } else {
            redirectAttributes.addFlashAttribute("mensagem", "Pessoa não encontrada!");
            redirectAttributes.addFlashAttribute("tipoMensagem", "danger");
            return "redirect:/public/buscar";
        }
    }

    // ======= CRUD - ATUALIZAR (update) - Processar formulário
    @PostMapping("/public/atualizar/{id}")
    public String atualizarPessoa(
            @PathVariable UUID id,
            @ModelAttribute PessoaDesaparecida pessoaAtualizada,
            @RequestParam(value = "foto", required = false) MultipartFile foto,
            RedirectAttributes redirectAttributes) {
        
        try {
            Optional<PessoaDesaparecida> pessoaOpt = repository.findById(id);
            
            if (pessoaOpt.isPresent()) {
                PessoaDesaparecida pessoaExistente = pessoaOpt.get();
                
                // Atualizar dados
                pessoaExistente.setNome(pessoaAtualizada.getNome());
                pessoaExistente.setData_nascimento(pessoaAtualizada.getData_nascimento());
                pessoaExistente.setDataDesaparecimento(pessoaAtualizada.getDataDesaparecimento());
                pessoaExistente.setLocalDesaparecimento(pessoaAtualizada.getLocalDesaparecimento());
                
                // Processar nova foto se enviada
                if (foto != null && !foto.isEmpty()) {
                    // Deletar foto antiga se não for a padrão
                    if (pessoaExistente.getFotoUrl() != null && 
                        !pessoaExistente.getFotoUrl().equals("/img/default-photo.png")) {
                        try {
                            String oldFilename = pessoaExistente.getFotoUrl().replace("/uploads/", "");
                            Path oldFilePath = Paths.get(UPLOAD_DIR + oldFilename);
                            Files.deleteIfExists(oldFilePath);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    
                    // Salvar nova foto
                    Path uploadPath = Paths.get(UPLOAD_DIR);
                    if (!Files.exists(uploadPath)) {
                        Files.createDirectories(uploadPath);
                    }

                    String originalFilename = foto.getOriginalFilename();
                    String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
                    String newFilename = UUID.randomUUID().toString() + fileExtension;

                    Path filePath = uploadPath.resolve(newFilename);
                    Files.copy(foto.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

                    pessoaExistente.setFotoUrl("/uploads/" + newFilename);
                }
                
                repository.save(pessoaExistente);
                
                redirectAttributes.addFlashAttribute("mensagem", "Dados atualizados com sucesso!");
                redirectAttributes.addFlashAttribute("tipoMensagem", "success");
                
            } else {
                redirectAttributes.addFlashAttribute("mensagem", "Pessoa não encontrada!");
                redirectAttributes.addFlashAttribute("tipoMensagem", "danger");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("mensagem", "Erro ao atualizar. Tente novamente.");
            redirectAttributes.addFlashAttribute("tipoMensagem", "danger");
        }
        
        return "redirect:/public/buscar";
    }

    // ======= CRUD - DELETAR (delete) - Confirmar exclusão
    @GetMapping("/public/confirmar-exclusao/{id}")
    public String confirmarExclusao(@PathVariable UUID id, Model model, RedirectAttributes redirectAttributes) {
        Optional<PessoaDesaparecida> pessoaOpt = repository.findById(id);
        
        if (pessoaOpt.isPresent()) {
            model.addAttribute("pessoa", pessoaOpt.get());
            return "confirmar-exclusao";
        } else {
            redirectAttributes.addFlashAttribute("mensagem", "Pessoa não encontrada!");
            redirectAttributes.addFlashAttribute("tipoMensagem", "danger");
            return "redirect:/public/buscar";
        }
    }

    // ======= CRUD - DELETAR (delete) - Processar exclusão
    @PostMapping("/public/deletar/{id}")
    public String deletarPessoa(@PathVariable UUID id, RedirectAttributes redirectAttributes) {
        try {
            Optional<PessoaDesaparecida> pessoaOpt = repository.findById(id);
            
            if (pessoaOpt.isPresent()) {
                PessoaDesaparecida pessoa = pessoaOpt.get();
                
                // Deletar foto se não for a padrão
                if (pessoa.getFotoUrl() != null && 
                    !pessoa.getFotoUrl().equals("/img/default-photo.png")) {
                    try {
                        String filename = pessoa.getFotoUrl().replace("/uploads/", "");
                        Path filePath = Paths.get(UPLOAD_DIR + filename);
                        Files.deleteIfExists(filePath);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                
                repository.deleteById(id);
                
                redirectAttributes.addFlashAttribute("mensagem", "Pessoa removida com sucesso!");
                redirectAttributes.addFlashAttribute("tipoMensagem", "success");
                
            } else {
                redirectAttributes.addFlashAttribute("mensagem", "Pessoa não encontrada!");
                redirectAttributes.addFlashAttribute("tipoMensagem", "danger");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("mensagem", "Erro ao deletar. Tente novamente.");
            redirectAttributes.addFlashAttribute("tipoMensagem", "danger");
        }
        
        return "redirect:/public/buscar";
    }
}