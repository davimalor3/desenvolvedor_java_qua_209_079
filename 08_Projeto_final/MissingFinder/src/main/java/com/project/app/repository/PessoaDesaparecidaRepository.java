package com.project.app.repository;

import com.project.app.entities.PessoaDesaparecida;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PessoaDesaparecidaRepository extends JpaRepository<PessoaDesaparecida, UUID> {
    // PessoaDesaparecida findByIdPessoaDesaparecida(long idPessoaDesaparecidad);
}
