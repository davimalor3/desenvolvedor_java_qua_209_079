programa {
  funcao inicio() {
    real altura 
    inteiro idade
    cadeia nome

    //entrada de dados
    escreva("Informe eu nome: ")
    leia(nome)
    escreva("Informe sua idade: ")
    leia(idade)
    escreva("Informe sua altura em metros: ")
    leia(altura)
    
    se (idade >= 12 e altura >= 1.15){
      escreva(nome, " está autirizado a entrar no trem fantasma.")
    }
    senao{
      escreva(nome, " não está autirizado a entrar no trem fantasma.")
    } 




  }
}
