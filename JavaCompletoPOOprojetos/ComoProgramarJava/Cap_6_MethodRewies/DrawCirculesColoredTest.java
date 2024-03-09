package JavaCompletoPOOprojetos.ComoProgramarJava.Cap_6_MethodRewies;

import javax.swing.*;

public class DrawCirculesColoredTest {
    public static void main(String[] args) {
        DrawCirculesColored jpanel = new DrawCirculesColored();
        JFrame applicat = new JFrame();

        applicat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicat.add(jpanel);
        applicat.setSize(230, 250);
        applicat.setVisible(true);
    }
}
