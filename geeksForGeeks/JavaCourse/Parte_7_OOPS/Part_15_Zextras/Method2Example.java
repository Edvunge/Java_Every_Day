package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_15_Zextras;

public class Method2Example {
    class Test {
        public static int i = 0;

        Test() {
            i++;
        }

        public static int get(){
            return i;
        }

        public int m1() {
            System.out.println("Inside the method m1 by object of GFG class");

            this.m2();

            return 1;
        }

        public void m2() {
            System.out.println("In method m2 came from method m1");
        }
    }

    class GFG {
        public static void main(String[] args) {
           // Test obj = new Test();

           // int i = obj.m1();

            //System.out.println("control returned after method m1 : " + i);

            int no_of_objects = Test.get();

            System.out.println("No of instances created till now : ");

            System.out.println(no_of_objects);
        }
    }
}
