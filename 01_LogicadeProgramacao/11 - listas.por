programa {
  funcao inicio() {
    cadeia nomes[3]
    inteiro idades[3]

    para (inteiro i = 0; i<3; i++)
    {
     escreva("Informe o nome do ", i+1, "º usuario:")
     leia(nomes[i])
     escreva("Informe a idade do ", i+1, "º usuario:")
     leia(idades[i])
    }


    escreva("\nTABELA DE NOMES/IDADES:\n\n")
    
    para (inteiro j = 0; j<3; j++)
     {

      escreva(nomes[j], " tem idade: ", idades[j],"\n")
     }
    

  }
}
