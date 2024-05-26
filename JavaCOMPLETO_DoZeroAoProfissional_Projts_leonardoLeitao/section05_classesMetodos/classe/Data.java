package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section05_classesMetodos.classe;

public class Data {
    // dia, mes , ano
    int dia;
    int mes;
    int ano;

    // 1 1 1970
    Data () {

    }

    Data (int day, int month, int year) {
        dia = day;
        mes = month;
        ano = year;
    }

    String obterDataFormatada() {
        return  String.format(" %d / %s / %d ", dia ,mes ,ano);
    }
}
