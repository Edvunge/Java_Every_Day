package geeksForGeeks.JavaCourse.Parte_7_OOPS.ModificadoresDeAcessos.ModificadoresDeAcessoPrivado;

public class P1 {
    class A {
        private void display() {
            System.out.println("GeeksForGeeks");
        }
    }

    class B {
        public static void main(String[] args) {
            //A obj = new A();
            //obj.display();
        }
    }
}
