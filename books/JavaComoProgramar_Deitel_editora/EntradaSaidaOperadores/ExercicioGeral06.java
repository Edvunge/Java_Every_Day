package books.JavaComoProgramar_Deitel_editora.EntradaSaidaOperadores;

import java.util.Scanner;

public class ExercicioGeral06 {
    public static void main(String[] args){
        /*
        crie um programa que vai receber do usuario o valor do produto e a quantidade do produto que se deseja.
        com essas informacoes encontre o subtotal que sera o valor do produto multiplicado pela quantidade.

        Depois voce vai precisar usar uma estratura de decisao, se a quantidade desejada do produto for maior que 10 unidades,
        vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, voce nao aplica desconto algum.


            algoritmo do desconto.
            //////////////////////////
         desconto 10% =======  desconsto = valorProduto * 10% / 100      valorProduto - desconto



        para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade)
        voce multiplica o subtotal pelo proprio percentual e divide tudo por 100.

        tendo o valor referente ao percentual de desconto, voce vai retirar esse valor do subtotal.
        o que sobrar sera o valor total final  e devera ser apresentado console
        */

        Double valorProduto;
        Double quantidadeProduto;
        Double  desconto = 10.0;
        Double referentePercentual;
        Double valorTotalFinal;

        Scanner input = new Scanner(System.in);

        System.out.print("introduza o valor do produto: ");
        valorProduto = input.nextDouble();

        System.out.print("introduza a quantidade do produto: ");
        quantidadeProduto = input.nextDouble();

        Double subtotal = valorProduto * quantidadeProduto;

        if(quantidadeProduto > 10){
            desconto = ( valorProduto * 10 ) / 100;

            subtotal = subtotal - desconto;
            System.out.println("subtotal " + subtotal);
        } else {
            System.out.println(" nenhum desconto foi aplicado. ");
        }

        valorTotalFinal = subtotal - desconto;

        System.out.println("valor final sera : " + valorTotalFinal );
    }
}
