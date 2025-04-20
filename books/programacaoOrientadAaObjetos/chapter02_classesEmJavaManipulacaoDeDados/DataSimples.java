package books.programacaoOrientadAaObjetos.chapter02_classesEmJavaManipulacaoDeDados;

public class DataSimples {
    byte dia, mes;
    short ano;

    void inicializaDataSimples(byte d, byte m, short a) {
        if (dataEvalida(d, m, a)) {
            dia = d;
            mes = m;
            ano = a;
        } else {
            dia = 0;
            mes = 0;
            ano = 0;
        }
    }

    boolean dataEvalida(byte d, byte m, short a) {
        if ((d >= 1) &&
            (d <= 31) &&
                (m >= 1) &&
                (m <= 12))
            return true;
        else
            return false;
    }

    boolean eIgual(DataSimples outraDataSimples) {
        if ((dia == outraDataSimples.dia) &&
                (mes == outraDataSimples.mes) &&
                (ano == outraDataSimples.ano))
            return true;
        else
            return false;
    }

    void mostrarDataSimples() {
        System.out.println(dia);
        System.out.println("/");
        System.out.println(mes);
        System.out.println("/");
        System.out.println(ano);
    }
}
