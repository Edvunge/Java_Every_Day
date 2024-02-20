package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_1_JavaBasico;

public class Aula08_parte_3_ArraysMultidimensionaisInicializacoes {
    public static void main(String[] args) {
         int[][] arrayInt = new int[3][];

         arrayInt[0] = new int[2];
         arrayInt[1] = new int[]{1, 2, 3};
         arrayInt[2] = new int[]{2, 3, 4, 5, 6, 7};

       //  int[][] arr = {{1, 1},{1, 2, 3},{1, 2, 3, 4, 5, 6}};

         for (int[] arrayBase : arrayInt) {
             System.out.println("\n-----");
             for (int num : arrayBase) {
                 System.out.print(num + " ");
             }
         }
    }
}
