package JavaNotesForProfessionals.cap48_ClassesAndObjects.overloadingMethods;

public class Shappe {
    // It could be a circle or rectangule or square
    private String type;

    // To calculate area of rectangule
    //public Double area(Long length, Long breadth) {
      //  return (Double) length * breadth;
    //}

    // To calculate area of a circle
    public Double area(Long radius) {
        return (Double) 3.14 * radius * radius;
    }
}
