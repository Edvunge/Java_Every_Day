package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1;

public class PrincipalCelular {
    public static void main(String[] args) {
        // Iphone 12, tela de 6.1, 256gb
        // galaxy Note 20 ultra, tela de 6.9, 2565gb
        // xiami MI 11 pro, tela de 6.81, 128gb

        // declarando um objeto do tipo celular = instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.sistemaOperacional = "IOS";
        celularA.espacoArmazenamento = 256;

        // objeto celular B
        Celular celularB = new Celular();
        celularB.nome = "Galaxy note 20 ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.sistemaOperacional = "ANDROID";
        celularB.espacoArmazenamento = 130;

        // objeto celular C
        Celular celularC = new Celular();
        celularC.nome = "XIAMI MI 11 pro";
        celularC.tamanhoTela = 6.81f;
        celularC.sistemaOperacional = "ANDROID";
        celularC.espacoArmazenamento = 128;

        System.out.format("Celular %s com tela de %.1f, com %d e SO %s\n",celularA.nome , celularA.tamanhoTela , celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %d e SO %s\n",celularB.nome , celularB.tamanhoTela , celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %d e SO %s\n",celularC.nome , celularC.tamanhoTela , celularC.espacoArmazenamento, celularC.sistemaOperacional);
    }
}
