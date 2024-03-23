package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.M_interfaces.test;

import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.M_interfaces.dominio.DatabaseLoader;
import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.M_interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();
    }
}
