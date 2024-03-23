package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.M_interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }
}
