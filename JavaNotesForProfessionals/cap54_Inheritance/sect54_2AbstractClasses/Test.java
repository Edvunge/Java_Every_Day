package JavaNotesForProfessionals.cap54_Inheritance.sect54_2AbstractClasses;

public class Test {
    public static void main(String[] args) {
        Component myButton = new Button();
        Component myTextBox = new TexBox();

        myButton.render(); // render a button
        myTextBox.render(); // render a text box
        
    }
}
