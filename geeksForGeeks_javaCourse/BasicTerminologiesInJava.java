package geeksForGeeks_javaCourse;

public class BasicTerminologiesInJava {
    public static void main(String[] args) {
        // Terminologias basicas em java
        /*

        * 1. CLASSE: A classe é um modelo (plano) da instancia de uma classe (objeto)
        Pode ser definido como um modelo lógico que compartilha propriedade e metodos comuns

        exe1: A planta da casa é da classe
        exe2: No mundo real, Alice é um objeto da classe "Humano".

        * 2. OBJETO: O objeto é uma instancia de uma classe. É uma entidade que possui comportamento e estado.
        Exemplo: Cachorro, Gato, Macaco etc. são objetos da classe “Animal”.

        Comportamento: Correr na estrada.

        3. Método : O comportamento de um objeto é o método.

        Exemplo :
            O indicador de combustível indica a quantidade de combustível restante no carro.

        4. Variáveis de instância :
            cada objeto possui seu próprio conjunto exclusivo de variáveis de instância.

        O estado de um objeto geralmente é criado pelos valores atribuídos a essas variáveis de instância.

        */

        System.out.println("Hello World!");
        System.out.println("GeeksForGeeks!");

        // 1. Comments in java

        // comentario de uma unica linha

        /*
            *
            comentario de multiplas linhas
        */


        /** documentation */

        // 2. Nome Do Ficheiro De Codigos:
        // as classes em java começam com letras MAIUSCULAS

        /*
        * GFG.JAVA // valid syntax
        * gfg.java // invalid syntax
        * */

        // todos os ficheiros em java terminam com o PONTO JAVA (.java)

        // 3. Case Sensitivity
        /*
        *
        * System.out.println("GeeksforGeeks"); // valid syntax
        * system.out.println("GeeksforGeeks"); // invalid syntax because of
        * the first letter of System keyword is always uppercase.
        *
        * */

        // 4. Class Names
        /*
        i. A primeira letra da classe deve ser em maiúsculas (as minúsculas são permitidas,
        mas não são aconselhadas).
        */

        /*
        class MyJavaProgram    // valid syntax
        class 1Program         // invalid syntax
        class My1Program       // valid syntax
        class $Program         // valid syntax, but discouraged
        class My$Program       // valid syntax, but discouraged (inner class Program inside the class My)
        class myJavaProgram    // valid syntax, but discouraged
        */
    }
}