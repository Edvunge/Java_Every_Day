package UdemyCourses.javaComOOP_MatheusBattisti.section04_condicionais;

import java.util.Scanner;

public class Exercicio01_verificacaoDeCategoriaDePreco {
    /*
    Exercicio 1: Verificacao de categoria de preço

    Peça ao usuario para inserir o preço de um produto.
    Se o preço for menor que 50, categorize-o como "Barato".
    Se estiver entre 50 e 100, categorize como "Medio".
    Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um valor do produto: ");
        double valorProduto = input.nextDouble();

        if (valorProduto < 50) {
            System.out.println("Produto BARATO!");
        } else if (valorProduto > 50 && valorProduto < 100) {
            System.out.println("Produto MEDIO");
        } else if (valorProduto > 100) {
            System.out.println("Produto CARO");
        }
    }
}
