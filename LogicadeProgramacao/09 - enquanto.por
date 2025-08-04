programa {
  funcao inicio() {

    inteiro opcao
    real x, y, result

    faca
    {
      escreva("\n\nBEM VINDO A CALCULADORA\nEscolha uma opção:\n\n")
      escreva("1 - Soma\n")
      escreva("2 - Subtração\n")
      escreva("3 - Multiplicação\n")
      escreva("4 - Divisão\n")
      escreva("5 - Sair do Programa\n")
      leia(opcao)

      se (opcao >=1 e opcao <=4)
      {
        escreva("Informe o valor de x: ")
        leia(x)
        escreva("Informe o valor de y:")
        leia(y)

      }

      escolha (opcao)
      {
        caso 1:
          result = x+y
          escreva("\nO resultado é: ", result,"\n\n")
          pare

        caso 2:
          result = x-y
          escreva("\nO resultado é: ", result,"\n\n")
          pare

        caso 3:
          result = x*y
          escreva("\nO resultado é: ", result,"\n\n")
          pare

        caso 4:
          result = x/y
          escreva("\nO resultado é: ", result,"\n\n")
          pare
        
        caso 5:
          escreva("Programa Encerrado!")
          pare

        caso contrario:
          escreva("Opção Invalida!")

      }

    } enquanto(opcao != 5)

  }
}
