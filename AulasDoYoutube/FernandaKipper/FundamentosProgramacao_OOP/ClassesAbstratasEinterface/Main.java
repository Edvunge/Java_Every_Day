package AulasDoYoutube.FernandaKipper.FundamentosProgramacao_OOP.ClassesAbstratasEinterface;

public class Main {
    public static void main(String[] args) {
        Car meuCarro = new Sandero();
        Car meuCarro2 = new Mobi();

        meuCarro.acelerar();
        meuCarro2.acelerar();
    }
}
