import javax.swing.*;
import java.awt.*;

public class SimpleDrawingGUI {

    JFrame frame;

    public SimpleDrawingGUI(){
        frame = new JFrame("Simple Drawing");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME
        JPanel panel = new DrawingPanel();

        frame.add(panel);

        frame.setVisible(true);
    }

    public static class DrawingPanel extends JPanel{

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
