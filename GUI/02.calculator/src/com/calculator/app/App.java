package com.calculator.app;

import javax.swing.JOptionPane;
import com.calculator.controller.CalculatorClass;

public class App {
    public static void main(String[] args) throws Exception {
        CalculatorClass calc = new CalculatorClass(0, 0);

        String[] options = {"Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"};
        Object option;

        do{
            option = JOptionPane.showInputDialog(null, "Selecione uma opção:", "CALCULADORA", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);

            // VERIFICAÇÃO DE SAIDA
            if(option != "Sair"){
                calc.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de X:")));
                calc.setY(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de Y:")));
            }


            // ======== SOMAR 
            if(option == "Somar"){
                JOptionPane.showMessageDialog(null, "O resultado da soma é "+calc.somar(calc.getX(), calc.getY()), "Soma", JOptionPane.INFORMATION_MESSAGE);
            }
            // ======== SUBTRAIR
            else if(option == "Subtrair"){
                JOptionPane.showMessageDialog(null, "O resultado da Subtração é "+calc.subtrair(calc.getX(), calc.getY()), "Subtrair", JOptionPane.INFORMATION_MESSAGE);
            }
            // ======== MULTIPLICAR
            else if(option == "Multiplicar"){
                JOptionPane.showMessageDialog(null, "O resultado da Multiplicação é "+calc.multiplicar(calc.getX(), calc.getY()), "Multiplicar", JOptionPane.INFORMATION_MESSAGE);
            }
            // ======== DIVIDIR
            else if(option == "Dividir"){
                JOptionPane.showMessageDialog(null, "O resultado da Divisão é "+calc.dividir(calc.getX(), calc.getY()), "Dividir", JOptionPane.INFORMATION_MESSAGE);
            }
        } while(option != "Sair");

    }
}
