package books.Introd_oop_rafaelSantos.part_I_introdOOP.chapter02_criandoClassesJava;

public class Data {

    private byte dia,mes;
    private short ano;

    public void inicializaData(byte d,byte m, short a) {
        if (dataEValida(d,m,a)) {
            dia = d; mes = m; ano = a;
        } else {
            dia = 0; mes = 0; ano = 0;
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

    public boolean dataEValida(byte d, byte m, short a) {
        if ((d >= 1) &&
                (d <= 31) &&
                (m >= 1) &&
                (m <= 12))
            return true;
        else
            return false;
    }

    public boolean eIgual(Data outraData) {
        if ((dia == outraData.dia) &&
                (mes == outraData.mes) &&
                (ano == outraData.ano))
            return true;
        else
            return false;
    }

    public void mostraData(){
        System.out.println(dia);
        System.out.println("/");
        System.out.println(mes);
        System.out.println("/");
        System.out.println(ano);
    }
}
