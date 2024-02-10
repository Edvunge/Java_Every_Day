package Java_COMPLETO_POO_Projetos.EazyAlgo_POO.Aulas;

public class Cars {
    // Attributes
    private int doors;
    private int gears;
    private String ModelName;
    private String Color;

    // constructors
    public Cars(int doors, int gears, String ModelName, String Color ) {
        this.doors = doors;
        this.gears = gears;
        this.ModelName = ModelName;
        this.Color = Color;
    }


    // GETTERS AND SETTERS
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
