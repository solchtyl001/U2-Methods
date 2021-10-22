import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangingColorsGUI {

    //Variables in a class are declared here,
    //but often not initialized

    JFrame window;
    JPanel panel;
    JButton colorClicker;

    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */

    public ChangingColorsGUI() {

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorClicker = new JButton("Change the Colors");

        //create a new Custom color

        //Set the colors of our buttons and panel
        panel.setBackground(Color.CYAN);
        colorClicker.setForeground(Color.MAGENTA);
        colorClicker.addActionListener(new ColorClickerListener());

        panel.add(colorClicker);
        window.add(panel);

        window.setVisible(true);


    }

    //Add a listener to change the color when the button is clicked

    private class ColorClickerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            panel.setBackground(Color.BLACK);
            colorClicker.setForeground(Color.CYAN);
            colorClicker.setForeground(Color.MAGENTA);

        }

    }

}

