package AulasDoYoutube.FernandaKipper.FundamentosProgramacao_OOP.ClassesAbstratasEinterface;

public class Simple {
    public static void main(String[] args) {
        Car meuCarro = new Sandero();
        Car meuCarro2 = new Mobi();

        SerVivo meuSer = new Humano();
        meuSer.respirar();

        meuCarro.acelerar();
        meuCarro2.acelerar();

    }
}
