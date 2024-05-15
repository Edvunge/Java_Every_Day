package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.Lista02;

import java.util.Scanner;

public class Exercs01 {
    /*
2. leia dois números inteiros e efetue a adição; caso o resultado seja maior que 10,
imprima-o.
3. Leia um número e imprima a raiz quadrada do número caso ele seja positivo e o
quadrado do número caso seja negativo.
4. Entre com um número e imprima uma das mensagens: É MULTIPLO DE 3 ou NÃO
É MULTIPLO DE 3.
5. leia um número e informe se ele é ou não múltiplo de 5.
6. leia um número e informe se ele é divisível por 3 e por 7.
7. leia um número e indique se ele está compreendido entre 20 e 90.
8. leia o ano de nascimento de uma pessoa e o ano atual e imprimir a idade da
pessoa. Não esqueça de verificar se o ano de nascimento é um ano válido.
9. Leia a sigla do estado de uma pessoa e imprimir a mensagem(carioca, paulista,
mineiro, outro estado) .
10. leia dois números e imprima uma mensagem dizendo se são iguais ou diferentes .
11. leia dois números e imprima o maior(suponha números diferentes).
12. entre com a altura e o sexo de uma pessoa e calcule e imprima o peso ideal,
utilizando as seguintes fórmulas: Homens(72,7*altura)-58; Mulheres (62,1*altura)-
44.
     */
    public static void main(String[] args) {
        // 1. leia um número e imprima caso seja maior que 20.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        if (num > 20) {
            System.out.println("valor: " + num + " eh maior que 20 ");
        } else {
            System.out.println("numero menor que " + num);
        }
    }
}
