package com.project.app.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.app.entities.PessoaDesaparecida;

@Repository
public interface PessoaDesaparecidaRepository extends JpaRepository<PessoaDesaparecida, UUID>  {
    //PessoaDesaparecida findByName(String nome);
}
