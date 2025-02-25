package JavaComplT_Profissional_leonardoLeitao.section05_classesMetodos.classe;

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
        final String formato = "%d/%d/%d";
        return  String.format(formato, dia ,mes ,ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
