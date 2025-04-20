package books.programacaoOrientadAaObjetos.chapter02_classesEmJavaManipulacaoDeDados;

public class Data {
    private byte dia;
    byte mes;
    private short ano;

    public void inicializaData(byte d, byte m, short a) {
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

    public byte retornaDia() {
        return dia;
    }

    public byte retornaMes() {
        return mes;
    }

    public short retornaAno() {
        return ano;
    }


    public boolean dataEvalida(byte d, byte m, short a) {
        if ((d >= 1) &&
                (d <= 31) &&
                (m >= 1) &&
                (m <= 12))
            return true;
        else
            return false;
    }

    public boolean eIgual(Data outraData) {
        if ((dia == outraData.dia) && (mes == outraData.mes) && (ano == outraData.ano))
            return true;
        else
            return false;
    }


    public void mostraData() {
        System.out.println(dia);
        System.out.println("/");
        System.out.println(mes);
        System.out.println("/");
        System.out.println(ano);
    }


    void duplicaData(Data dat) {
        dat.dia = 12;
        dat.mes = 3;
        dat.ano = 199;
    }
}
