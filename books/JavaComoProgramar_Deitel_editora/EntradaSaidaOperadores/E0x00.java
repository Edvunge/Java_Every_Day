package books.JavaComoProgramar_Deitel_editora.EntradaSaidaOperadores;

import javax.swing.*;

public class E0x00 {

    // Figura 3.13: NameDialog.Java
    // Obtendo a entrada de usuário a partir de um diálogo.

    public static void main(String[] args){
        // pede para o usuário inserir seu nome
        String name = JOptionPane.showInputDialog("What is your name?");


        // cria a mensagem
        String message =
                String.format("Welcome, %s, to Java Programming!", name);


        // exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, message);
    }
    // fim de main
    // termina NameDialog

}
