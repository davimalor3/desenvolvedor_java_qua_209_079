programa {
  funcao inicio() {
    // declaração de variavel
    inteiro idade
    cadeia nome

    escreva("Insira seu nome: ")
    leia(nome)
    escreva("Insira sua idade: ")
    leia(idade)
  


    se (idade >= 18){
      escreva("\n\nSeu nome é: ", nome, "\nSua idade é: ", idade,"\n")
      escreva("É maior de 18!")
    }
    senao {
      escreva("\n\nSeu nome é: ", nome, "\nSua idade é: ", idade,"\n")
      escreva("É menor de idade!")

    }

    



  }
}
