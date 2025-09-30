package com.project.app.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class Usuarios {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_usuario;

    @Column(unique = true)
    private String username;
    private String password;
 
 
    //TODO
    // CRIAR "ROLES" PARA DEFINIR O NIVEL DE ACESSO DE CERTAS INFORMAÇÕES E FAZER RELAÇÃO ENRTE USUARIO E SISTEMA
    // CRIAR  CLASSE USUARIO DE PARENTES ONDE USUARIOS PODEM SE ASSOCIAR COM PESSOAS DESAPARECIDAS
    // private String nome;
    // private String cpf;
    // private String data_nasc;
    // private String tel;
    // private String email;
    // private String cep;
    // private String estado;
    // private String cidade;
    // private String bairro;
    // private String logradouro;
    // private String complemento;
    // private String numero;
    // private String ;
    // private String ;
    // private String ;
    // private String ;
    // private String ;
    // private String ;
        
}
