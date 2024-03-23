package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.M_interfaces.dominio;

public interface DataLoader {
    void load();

   default void checkPermission() {
       System.out.println("fazendo checagem de premissoes");
   }
}
