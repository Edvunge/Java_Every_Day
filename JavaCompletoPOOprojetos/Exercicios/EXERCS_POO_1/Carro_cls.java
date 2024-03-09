package JavaCompletoPOOprojetos.Exercicios;

public class Carro_cls {
    /*
    6. Crie uma classe `Carro` com atributos modelo, cor e ano.
    Adicione um método para exibir as informações do carro.
    */
    public String modelo;
    public String cor;
    public int ano;

    void informacoesCarro(String modelo, String cor, int ano){
        System.out.println("=====================| INFORMACOES SOBRE O CARRO |======================\n");
        System.out.format("O Modelo: %s \n",modelo);
        System.out.format("O cor: %s\n",cor);
        System.out.format("O ano: %d\n",ano);
        System.out.println("\n=====================|  |===============================================");
    }
}
