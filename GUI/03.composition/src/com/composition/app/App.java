package com.composition.app;

import javax.swing.JOptionPane;
import com.composition.model.Conta;
import com.composition.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa user = new Pessoa(null, null, null, null, null);
        Conta cc = new Conta("1234-5", "12345-6", 0, user);

        
        String[] options = {"Exibir dados da conta", "Fazer Deposito", "Fazer Saque", "Sair"};
        Object option;
        double valor;

        user.setNome(JOptionPane.showInputDialog("Informe o Nome do titular da conta: "));
        user.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular da conta: "));
        user.setEmail(JOptionPane.showInputDialog("Informe o Email do titular da conta: "));
        user.setTel(JOptionPane.showInputDialog("Informe o Telefone do titular da conta: "));
        user.setEndereco(JOptionPane.showInputDialog("Informe o Endereço do titular da conta: "));
        
        do{
            option = JOptionPane.showInputDialog(null, "Escolha a opção desejada", "Java", JOptionPane.QUESTION_MESSAGE, null, options, option);

            switch (option.toString()){
                case "Exibir dados da conta" :
                    JOptionPane.showMessageDialog(null, cc.showInfo(), null, JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "Fazer Deposito" :
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja depositar: R$ "));
                    JOptionPane.showMessageDialog(null, cc.fazerDeposito(valor), null, JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "Fazer Saque" :
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja sacar: R$ "));
                    JOptionPane.showMessageDialog(null, cc.fazerSaque(valor), null, JOptionPane.INFORMATION_MESSAGE);
                    break;
            }



        }while(option != "Sair");


    }
}
