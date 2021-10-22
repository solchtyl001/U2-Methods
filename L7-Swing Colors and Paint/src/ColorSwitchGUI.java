import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window;
    JPanel panel;
    JButton colorClicker1;
    JButton colorClicker2;
    JButton colorClicker3;

    public ColorSwitchGUI(){
        //create your GUI
        window = new JFrame("color Switcher");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(350, 130);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorClicker1 = new JButton("setting 1");
        colorClicker2 = new JButton("setting 2");
        colorClicker3 = new JButton("setting 3");
        colorClicker1.addActionListener(new ColorClickerListener());
        colorClicker2.addActionListener(new ColorClickerListener2());
        colorClicker3.addActionListener(new ColorClickerListener3());




        panel.setBackground(Color.CYAN);
        colorClicker1.setForeground(Color.MAGENTA);
        colorClicker2.setForeground(Color.CYAN);
        colorClicker3.setForeground(Color.BLACK);

        panel.add(colorClicker1);
        panel.add(colorClicker2);
        panel.add(colorClicker3);
        window.add(panel);
        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.


    private class ColorClickerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            panel.setBackground(Color.BLACK);
            colorClicker1.setForeground(Color.red);
            colorClicker1.setForeground(Color.red);
            colorClicker1.setForeground(Color.red);
        }

    }

    private class ColorClickerListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            panel.setBackground(Color.BLUE);
            colorClicker2.setForeground(Color.cyan);
            colorClicker3.setForeground(Color.cyan);
            colorClicker1.setForeground(Color.cyan);
        }

    }

    private class ColorClickerListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            panel.setBackground(Color.BLACK);
            colorClicker3.setForeground(Color.MAGENTA);
            colorClicker2.setForeground(Color.MAGENTA);
            colorClicker1.setForeground(Color.MAGENTA);
        }

    }
}



