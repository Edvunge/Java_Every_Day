package AulasDoYoutube.FernandaKipper.FundamentosProgramacao_OOP.ClassesAbstratasEinterface;

public class Humano extends SerVivo {
    public Humano() {
        super(42);
    }
    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Inalando e exalando CO2 e Oxigénio");
    }
}
