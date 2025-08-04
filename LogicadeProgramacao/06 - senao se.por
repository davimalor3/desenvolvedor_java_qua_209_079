programa {
  funcao inicio() {
    cadeia nome
    real nota1

    escreva("Insira o nome do aluno: ")
    leia(nome)
    escreva("Insira a nota do aluno: ")
    leia(nota1)

    se (nota1 >= 0 e nota1 <= 10)
    {
      se (nota1 >= 7){
        escreva(nome, " teve nota: ", nota1, "\n")
        escreva("ALUNO APROVADO!!!")
      }
      senao se (nota1 >= 5){
        escreva(nome, " teve nota: ", nota1, "\n")
        escreva("ALluno em recuperação")
      }
      senao {
        escreva("Aluno Reprovado")
      }
    }
    senao
    {
      escreva("Nota Inválida!")
    }  

  }
}
