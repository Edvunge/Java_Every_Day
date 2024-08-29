package JavaNotesForProfessionals.cap54_Inheritance.sect54_2AbstractClasses;

public abstract class Component {
    private int x, y;

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void render();
}
