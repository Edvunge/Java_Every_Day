package geeksForGeeks.JavaCourse.Parte_1_Basics_of_java;

public class OperatorsSecondPart {
    public static void main(String[] args) {
        // 4. Relational Operators
        // variable relation_operator value

        /*
        == Igual a
        != Diferente de
        <  Menor do que
        <= Menor ou igual a
        >  Maior que
        >= Maior ou igual a
        */

        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b: " +   (a > b));
        System.out.println("a < b: " +   (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == b));
        System.out.println("a != c: " + (a != b));



        /*
        5. Logical Operators

        && logical And
        || logical OR
        !  logical Not
        */

        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x  && y));
        System.out.println("x || y: " + (x  || y));
        System.out.println("!x: " + (!x));


        // 6. Ternary Operator
        // condition ? if true : if false
        int a2 = 20, b2 = 10, c2 = 30, result;
        result = ( (a2 > b2) ? (a2 > c2) ? a2 : c2 : (b2 < c2) ? b2 : c2 );
        System.out.println("Max of three numbers = " + result);

        // 7. Bitwise Operators
        /*
        & Bitwise AND operator
        | Bitwise OR operator
        ^ Bitwise XOR operator
        ~ Bitwise Complement Operator
        */

        int d = 0b1010;
        int e = 0b1100;
        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));
        System.out.println("~d: " + (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));

        // 8. Shift Operators
        /*
        number shift_op number_of__places_to_shift;

        << Left shift Operator
        >> Signed Right Shift Operator
        >>> Unsigned Right shift Operator
        */

        int a1 = 10;

        // using left shift
        System.out.println("a1 << 1 : " + (a1 << 1));

        // using right shift
        System.out.println("a1 >> 1 : " + (a1 >> 1));


        //9. Operador de Instancia
        // object instance of class/subclass/interface
        /*Person obj1 = new Person();
        Person obj2 = new Boy();*/


        /*System.out.println("obj1 instanceof Person: " + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: " + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));


        System.out.println("obj2 instanceof Person: " + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: " + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));*/

    }

    class Person{
    }

    class Boy extends Person implements MyInterface {
    }

    interface MyInterface {
    }
}
