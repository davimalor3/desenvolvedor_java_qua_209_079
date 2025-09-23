package com.dialog.app;

import javax.swing.JOptionPane;

import com.dialog.model.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // stance Person class
        Person user = new Person(null, 0);

        // Input DIALOG
        user.setName(JOptionPane.showInputDialog("Informe seu nome:"));

        user.setAge(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));


        // OUTPUT DIALOG
        JOptionPane.showMessageDialog(
            null,
            "Nome: "+user.getName()+ "\nIDADE: "+user.getAge(),
            "Saida", JOptionPane.INFORMATION_MESSAGE);
    }
}
