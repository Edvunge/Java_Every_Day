package JavaNotesForProfessionals.cap48_ClassesAndObjects.overloadingMethods;

public class Car {
    private int milesPerGallon;
    private String name;
    private String color;
    private int numGallonsInTank;

    public Car() {
        milesPerGallon = 0;
        name = "";
        color = "";
        numGallonsInTank = 0;
    }

    // this is where an individual object is created
    public Car (int mpg, int gallonsInTank, String carName, String carColor) {
        milesPerGallon = mpg;
        name = carName;
        color = carColor;
        numGallonsInTank = gallonsInTank;
    }

    public void drive(int distanceInMiles) {
        int miles = numGallonsInTank * milesPerGallon;

        if (miles <= distanceInMiles){
            numGallonsInTank = numGallonsInTank - (distanceInMiles / milesPerGallon);
            System.out.println("Drove " + numGallonsInTank + " miles!");
        } else {
            System.out.println("Could not drive!");
        }
    }

    public void paintCar(String newColor) {
        color = newColor;
    }

    //set new Miles Per Gallon
    public void setMPG(int newMPG){
        milesPerGallon = newMPG;
    }

    //set new number of Gallon in Tank
    public void setNumGallonsInTank(int numGallons){
        numGallonsInTank = numGallons;
    }

    public void nameCar(String newName){
        name = newName;
    }

    public String getColor(){
        return color;
    }

    public String getName(){
        return  name;
    }

    public int getGallons(){
        return numGallonsInTank;
    }




}
