package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1.people_cls;

import javax.swing.*;

public class AppPersonagem {
    public static void main(String[] args) {
            String nome = JOptionPane.showInputDialog(null, "Nome do personagem: ");
            String classe = JOptionPane.showInputDialog(null, "Classe do personagem: ");


        Personagem guerreiro = new Personagem(nome, classe);
            guerreiro.mostrarStatus();
    }
}
