package geeksForGeeks.JavaCourse.Input_and_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowTakeInputFromUser {
    public static void main(String[] args) throws IOException {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        String str = bfn.readLine();

        int it = Integer.parseInt(bfn.readLine());

        System.out.println("Entered String: " + str);
        System.out.println("Entered Integer: " + it);

        /*
        Syntax of Scanner Class

        -> Scanner scn =  new Scanner(System.in)


        Importing Scanner Class

        import java.util.Scanner;

        Scanner Functions
        - int    => nextInt()
        - float  => nextFloat()
        - String => next() and nextLine()


        */
    }
}
