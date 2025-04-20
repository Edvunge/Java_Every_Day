package books.programacaoOrientadAaObjetos.chapter02_classesEmJavaManipulacaoDeDados;


import java.sql.Date;

public class AlgoritmoDeComparacao {

    public byte dia;
    public String mes;
    public byte ano;

    /*
        Uma das operações que podemos efetuar com datas é a comparação para ver se uma
        data ocorre antes de outra.
        O algoritmo para comparação é muito simples, e seus passos estão abaixo.
        Neste algoritmo, consideramos que dia1, mês1 e ano1 são os dados da primeira data, e que dia2,
        mês2 e ano2 são os dados da segunda data.

        1. Se ano1 < ano2 a primeira data vem antes da segunda.

        2. Se ano1 > ano2 a primeira data vem depois da segunda.

        3. Se ano1 == ano2 e mês1 < mês2 a primeira data vem antes da segunda.

        4. Se ano1 == ano2 e mês1 > mês2 a primeira data vem depois da segunda.

        5. Se ano1 == ano2 e mês1 == mês2 e dia1 < dia2 a primeira data vem antes da segunda.

        6. Se ano1 == ano2 e mês1 == mês2 e dia1 > dia2 a primeira data vem depois da segunda.

        7. Se nenhum destes casos ocorrer, as datas são exatamente iguais.

        Escreva um método vemAntesna classe Data que receba como argumento outra
        instância da classe Datae implemente o algoritmo acima,
        retornando truese a data encapsulada vier antes da passada como argumento e falsecaso contrário.
        Se as datas forem exatamente iguais, o método deve retornar true.
    */
}
