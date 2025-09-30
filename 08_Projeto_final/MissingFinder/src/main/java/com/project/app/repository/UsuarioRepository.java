package com.project.app.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.app.entities.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, UUID> {
    
    // Spring Data já cria métodos prontos, mas você pode adicionar extras:
    Optional<Usuarios> findByUsername(String username);

    boolean existsByUsername(String username);

}