package Tests;

public class PassWord {
    public static void main(String[] args) {
        String username = "User123";
        String password = "MySecretPass";

        // Entradas do usuário
        String inputUsername = "user123";
        String inputPassword = "mysecretpass";

        // Comparação de nome de usuário
        boolean isUsernameValid = username.equalsIgnoreCase(inputUsername); // true, pois ignora o caso

        // Comparação de senha
        boolean isPasswordValid = password.equals(inputPassword); // false, pois é sensível ao caso

        if (isUsernameValid && isPasswordValid) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }
    }
}
