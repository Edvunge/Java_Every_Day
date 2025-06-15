package AulasDoYoutube.FernandaKipper.FundamentosProgramacao_OOP;


public class Simple {
    public static void test(){
        System.out.println("Teste!!");
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Fusca");
        Carro carro1 = new Carro("Sandero");
        Carro carro2 = new Carro("BMW");

        carro.acelerar();
        carro1.acelerar();
        carro2.acelerar();
    }
}

class Carro {
    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro...: " + this.modelo);
    }

    public String test(){
        System.out.println("Teste!!");
        return "oi";
    }
}
