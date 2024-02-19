package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_1_JavaBasico;

public class Aula05_parte_3_EstruturasCondicionais_OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro devDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicçoes , mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
