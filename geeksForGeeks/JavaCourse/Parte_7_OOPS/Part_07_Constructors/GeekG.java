package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_07_Constructors;

public class GeekG {
    GeekG(String name) {
        System.out.println("Constructor with one " + "argument - String : " + name);
    }

    GeekG(String name, int age) {
        System.out.println(
                "Constructor with two arguments : "
                + " String and Integer : " + name + " " + age
        );

        //GeekG(long id) {
          //  System.out.println(
            //        "Constroctor with one argument : "
              //      + "long : " + id
            //);
        //}
    }
}
