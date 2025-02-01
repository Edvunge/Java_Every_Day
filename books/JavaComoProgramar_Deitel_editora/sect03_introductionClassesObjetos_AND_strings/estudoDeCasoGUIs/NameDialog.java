package books.JavaComoProgramar_Deitel_editora.sect03_introductionClassesObjetos_AND_strings.estudoDeCasoGUIs;

import javax.swing.*;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");

        String message = String.format("Welcome, %s, to Java Programming!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
