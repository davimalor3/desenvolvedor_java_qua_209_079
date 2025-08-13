package com.polimorfism.app;

final public class PessoaFisica extends Person {
    public String name;
    public String cpf;
    public String dataNascimento;

    public PessoaFisica(String name, String cpf, String dataNascimento, String email, String tel, String address) {
        
        super(email, tel, address);
        this.name = name;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

    }

    public String hello(){
        return "Olá meu nome é "+this.name+", nasci no dia "+this.dataNascimento+", moro no endereço "+this.address+",  meu telefone é "+this.tel+", meu email é "+this.email+" e meu CPF é "+this.cpf;
    }

}
