package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section05_classesMetodos.classe;

public class Data {
    // dia, mes , ano
    int dia;
    int mes;
    int ano;

    String obterDataFormatada() {
        return  String.format(" %d / %s / %d ", dia ,mes ,ano);
    }
}
