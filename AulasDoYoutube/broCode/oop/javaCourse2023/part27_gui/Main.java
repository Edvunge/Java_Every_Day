package AulasDoYoutube.broCode.oop.javaCourse2023.part27_gui;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //

        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit from application
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420, 420); //sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); //make frame visible
        ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(0x123456)); //change color of background
    }
}
