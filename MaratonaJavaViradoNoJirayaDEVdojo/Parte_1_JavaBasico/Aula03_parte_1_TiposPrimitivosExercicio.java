package MaratonaJavaViradoNoJirayaDEVdojo.Parte_1_JavaBasico;
/*
Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario de <salario>, na data <data>
*/
public class Aula03_parte_1_TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "edvaldo";
        String endereco = "rua almada negreiros";
        double salario = 5000;
        String data = "19/fev/2024";

        System.out.format("Eu %s, morando no endereço %s,\n" +
                "confirmo que recebi o salario de %.2f , na data %s",nome ,endereco ,salario ,data);

    }
}
