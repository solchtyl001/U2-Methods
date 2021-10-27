/*
Use the ArtworkGUI to create a simple drawing of your choice.

KEEP IT SIMPLE, like a house, car, train, bike, stick figures
 or other simple drawing.

 Create the GUI and drawing in the ArtworkGUI class.
 */

import javax.swing.*;
import java.awt.*;

public class Artwork {

    JFrame frame;

    public static void main(String[] args) {
        new SimpleDrawingGUI();
    }

    public void SimpleDrawingGUI(){
        frame = new JFrame("Simple Drawing");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME
        JPanel panel = new SimpleDrawingGUI.DrawingPanel();

        frame.add(panel);

        frame.setVisible(true);
    }

    private class DrawingPanel extends JPanel{

        //Constructor for the class
        public DrawingPanel(){
            //set the Background color
            setBackground(Color.black);
        }

        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            g.setColor(Color.white);
            g.fillRect(50, 100, 100, 150);
            g.fillRect(250, 100, 100, 150);
            g.fillOval(80, 400, 250, 100 );
            g.fillRect(200, 300, 40, 50);
            g.setColor(Color.black);
            g.fillRect(110, 170, 20, 30);
            g.fillRect(310, 170, 20, 30);
            g.setColor(Color.RED);
            g.fillRect(190, 0, 20, 100);
        }

    }
}
