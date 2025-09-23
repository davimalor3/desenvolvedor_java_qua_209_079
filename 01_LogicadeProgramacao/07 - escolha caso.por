programa {
  funcao inicio() {
  inteiro opcao
  real x, y, result

  escreva("Informe o valor de x: ")
  leia(x)
  escreva("Informe o valor de y: ")
  leia(y)

  escreva("1 - Soma\n")
  escreva("2 - Subtração\n")
  escreva("3 - Multiplicação\n")
  escreva("4 - Divisão\n\n")
  escreva("Informe a opção desejada: \n")
  leia(opcao)

  escolha(opcao){
    caso 1:
      result = x+y
      escreva("O resultado é: \n\n", result)
      pare

    caso 2:
      result = x-y
      escreva("O resultado é: \n\n", result)
      pare

    caso 3:
      result = x*y
      escreva("O resultado é: \n\n", result)
      pare

    caso 4:
      result = x/y
      escreva("O resultado é: \n\n", result)
      pare

    caso contrario:
      escreva("Opção Invalida!")


  }
    }
  }
}
