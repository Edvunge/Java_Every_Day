package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section05_classesMetodos.classe;

public class Data {
    // dia, mes , ano
    int dia;
    int mes;
    int ano;

    // 1 1 1970
    Data () {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data (int day, int month, int year) {
        this.dia = day;
        this.mes = month;
        this.ano = year;
    }

    String obterDataFormatada() {
        return  String.format(" %d / %s / %d ", dia ,mes ,ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
