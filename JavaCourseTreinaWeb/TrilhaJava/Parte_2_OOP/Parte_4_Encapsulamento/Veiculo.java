package JavaCourseTreinaWeb.TrilhaJava.Parte_2_OOP.Parte_4_Encapsulamento;

public class Veiculo {
    private String nome;
    private String marca;
    private String chassi;
    private int quantidadRodas;
    private float quantidadeCombustivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public int getQuantidadRodas() {
        return quantidadRodas;
    }

    public void setQuantidadRodas(int quantidadRodas) {
        this.quantidadRodas = quantidadRodas;
    }

    public void ligar() {
        System.out.println("O veiculo ligou");
    }

    public void desligar() {
        System.out.println("O veiculo desligou");
    }

    public float abastecer(float litros) {
        quantidadeCombustivel += litros;
        return quantidadeCombustivel;
    }
}
