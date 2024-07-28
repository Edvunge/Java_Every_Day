package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula35_recursividade;

public class Fatorial {
    public int fat(int num) {
        if (num == 0){
            return 1;
        }
        return num * fat(num-1);
    }
}
