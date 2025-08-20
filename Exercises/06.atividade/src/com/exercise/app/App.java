package com.exercise.app;

import javax.swing.JOptionPane;

import com.exercise.model.Carro;
import com.exercise.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa(null, null, null, null, null);
        Carro car1 = new Carro(null, null, null, null, null, usuario);

        String[] options = {"Info Usuario", "Info Veiculo", "Sair"};
        Object option;

        //INPUT INFO USUÁRIO
        usuario.setNome(JOptionPane.showInputDialog("INFORMAÇÕES DO USUÁRIO\n\nInforme seu nome:"));
        usuario.setCpf(JOptionPane.showInputDialog("Informe seu CPF:"));
        usuario.setEmail(JOptionPane.showInputDialog("Informe seu e-mail:"));
        usuario.setTel(JOptionPane.showInputDialog("Informe seu telefone:"));
        usuario.setEndereco(JOptionPane.showInputDialog("Informe seu endereço:"));

        // INPUT INFO VEICULO
        car1.setFabricante(JOptionPane.showInputDialog("INFORMAÇÕES DO VEÍCULO\n\nInforme o fabricante do veículo:"));
        car1.setMarca(JOptionPane.showInputDialog("Informe a marca:"));
        car1.setPlaca(JOptionPane.showInputDialog("Informe a placa:"));
        car1.setAno(JOptionPane.showInputDialog("Informe o ano do veiculo:"));
        car1.setCor(JOptionPane.showInputDialog("Informe a cor:"));


        do{
            option = JOptionPane.showInputDialog(null, "Escolha uma opção", "INFO", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch(option.toString()){
                case "Info Usuario" :
                    JOptionPane.showMessageDialog(null, usuario.showInfoUser(),"INFO CARRO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Info Veiculo" :
                    JOptionPane.showMessageDialog(null, car1.showInfo(),"INFO CARRO", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while(option != "Sair");
    }
}
