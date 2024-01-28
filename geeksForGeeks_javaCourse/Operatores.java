package geeksForGeeks_javaCourse;

public class Operatores {
    public static void main(String[] args) {
        // Operadores Em Java

        /* 1. Arithmetic Operators

         * : multiplication
         / : division
         % : modulo
         + : addition
         - : subtraction
        */
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        /* 2. Unary Operators
        ++
        -
        +
        */

        int x = 2;
        int y = 7;

        System.out.println("Post-increment : " + (x++));
        System.out.println("Pre-increment : "  + (++x));

        System.out.println("Post-decrement : " + (b--));
        System.out.println("Post-decrement : " + (--b));

        // 3. Operador de Igualdade
        // variable = value;
        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 3: " + (f += 3));
        System.out.println("f *= 3: " + (f += 3));
        System.out.println("f /= 3: " + (f += 3));
        System.out.println("f %= 3: " + (f += 3));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " +    (f <<= 2));
        System.out.println("f >>= 1: " +    (f >>= 1));
        System.out.println("f >>>= 1: " +  (f >>>= 1));






    }
}
