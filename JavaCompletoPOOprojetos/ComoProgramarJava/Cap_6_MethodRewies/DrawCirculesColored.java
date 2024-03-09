package JavaCompletoPOOprojetos.ComoProgramarJava.Cap_6_MethodRewies;

import javax.swing.*;
import java.awt.*;

public class DrawCirculesColored extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // desenha o rosto
        g.setColor(Color.GREEN);
        g.fillOval(10, 10, 200, 200);

        // desenho de circulo interno -1
        g.setColor(Color.CYAN);
        g.fillOval(8, 8, 100, 100);

        // desenho de circulo interno -2
        g.setColor(Color.GREEN);
        g.fillOval(6, 6, 50, 50);

        // desenho de circulo interno
        g.setColor(Color.CYAN);
        g.fillOval(4, 4, 25, 25);

        // desenho de circulo interno
        g.setColor(Color.GREEN);
        g.fillOval(2, 2, 13, 13);
    }
}
