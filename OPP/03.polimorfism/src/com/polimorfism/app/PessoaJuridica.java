package com.polimorfism.app;

final public class PessoaJuridica extends Person {
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;

    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String tel, String address) {
        super(email, tel, address);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String hello(){
        return "Olá somos da empresa "+this.nomeFantasia+", nossa razão social "+this.razaoSocial+" cujo o cnpj é "+this.cnpj+" nosso telefone é "+this.tel+", nosso email é "+this.email+" com endereço em "+this.address;
    }

}
