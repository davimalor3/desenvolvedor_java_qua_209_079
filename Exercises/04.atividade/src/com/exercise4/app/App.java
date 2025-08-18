package com.exercise4.app;

import javax.swing.JOptionPane;
import com.exercise4.model.ImcCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        ImcCalculator calc = new ImcCalculator(0, 0);
        String[] options = {"Calcular IMC", "Sair"};
        Object option;

        double imc;

        do{
            option = JOptionPane.showInputDialog(null, "Selecione uma opção:", "CALCULADORA IMC", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);

            if(option == "Calcular IMC"){
                calc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso:").replace(",", ".")));
                calc.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:").replace(",", ".")));

                imc = calc.calculoIMC();

                JOptionPane.showMessageDialog(null, "O resultado do seu IMC é "+String.format("%.2f", imc)+"\n"+calc.diagnostic(imc), "CALCULADORA DE IMC", JOptionPane.INFORMATION_MESSAGE);

            }


        }while(option != "Sair");
    }
}
