package UdemyCourses.javaComOOP_MatheusBattisti.section04_condicionais;

import java.util.Scanner;

public class Exercicio02_validacaoDeLogin {
    /*
    Exercicio 2: Validação de login

    Peça ao usuario para inserir um nome de usuario e uma senha.
    Verifique se o nome de usuario é "Admin" e a senha é "1234".
    Se ambos forem corretos, exiba "Acesso permitido".
    caso contrario, exiba "Acesso negado".
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do usuario: ");
        String user = input.next();

        System.out.println("Digite a sua senha: ");
        int senha = input.nextInt();

        if (user.equals("Admin") && senha == 1234) {
            System.out.println("!!CONDRATULATIONS!! == Your access has been granted");
        } else {
            System.out.println("!!SORRY!! == Your access has been denied");
        }
    }
}
