package com.exercise5.app;

import javax.swing.JOptionPane;

import com.exercise5.model.Abastecimento;

public class App {
    public static void main(String[] args) throws Exception {
        Abastecimento flex = new Abastecimento(0, 0);

        String[] options = {"Verificação Combustível", "Sair"};
        Object option;
    

        do{
        
        option = JOptionPane.showInputDialog(null, "Selecione uma opção:", "VERIFICAÇÃO COMBUSTIVEL", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
        
            if(option == "Verificação Combustível"){
                flex.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Etanol:").replace(",", ".")));
                flex.setGasoline(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Gasolina:").replace(",", ".")));
                
                JOptionPane.showMessageDialog(null, "O resultado do seu calculo é"+String.format("%.2f" )+"\n"+flex.verificacao(), "Calculadora de Combustivel", JOptionPane.INFORMATION_MESSAGE);
            }

        } while(option != "Sair");
    }
}
