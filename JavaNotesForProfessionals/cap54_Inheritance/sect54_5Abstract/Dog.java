package JavaNotesForProfessionals.cap54_Inheritance.sect54_5Abstract;

public class Dog extends Animal implements Learn {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void remember() {
        System.out.println(this.getClass().getSimpleName() + " can remember for 5 minutes");
    }

    public void protectOwner() {
        System.out.println(this.getClass().getSimpleName() + " will protect");
    }

    public void learn() {
        System.out.println(this.getClass().getSimpleName() + " can learn:");
    }
}

