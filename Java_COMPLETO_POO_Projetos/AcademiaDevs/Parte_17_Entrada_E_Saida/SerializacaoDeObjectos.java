package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_17_Entrada_E_Saida;
import java.io.*;

class Pessoa implements Serializable {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class SerializacaoDeObjectos {
    public static void main(String[] args) {
        // Escrever objeto em arquivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.ser"))) {
            Pessoa pessoa = new Pessoa("João", 25);
            oos.writeObject(pessoa);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ler objeto de arquivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.ser"))) {
            Pessoa pessoaLida = (Pessoa) ois.readObject();
            System.out.println("Nome: " + pessoaLida.nome + ", Idade: " + pessoaLida.idade);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
