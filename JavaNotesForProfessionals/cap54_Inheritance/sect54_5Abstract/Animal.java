package JavaNotesForProfessionals.cap54_Inheritance.sect54_5Abstract;

abstract class Animal {
    String name;
    int lifeExpentency;

    public Animal(String name, int lifeExpentency) {
        this.name = name;
        this.lifeExpentency = lifeExpentency;
    }

    public abstract void remember();
    public abstract void protectOwner();

    public String toString(){
        return this.getClass().getSimpleName() + ":" + name + ":" + lifeExpentency;
    }
}
