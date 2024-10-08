package geeksForGeeks.JavaCourse.Parte_5_Array;

class StudentNominal {
    public String name;
    StudentNominal(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}

public class IllustrateCreatingArray {
    public static void main(String[] args) {
        // declares an Array and initializing the elements
        StudentNominal[] myStudents = new StudentNominal[]{
                new StudentNominal("Dharma"), new StudentNominal("sanvi"), new StudentNominal("Rupa"), new StudentNominal("Ajay")
        };

        // accessing the elements of specified array
        for (StudentNominal m:myStudents){
            System.out.println(m);
        }
    }
}
