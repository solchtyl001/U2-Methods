import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("converter");
        JPanel panel = new JPanel();
        JButton button = new JButton("meters to feet");
        JButton buton = new JButton("feet to meters");

        window.setSize(150, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ButtonListener());
        buton.addActionListener(new ButonListener());
        panel.add(button);
        window.add(panel);
        window.setVisible(true);
        panel.add(buton);

    }

        private static class ButonListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

              double feet = Double.parseDouble(JOptionPane.showInputDialog("enter feet"));
              double meters = feet/3.28;
              JOptionPane.showMessageDialog(null, feet + " feet equals " + meters + " meters.");


            }
        }





   private static class ButtonListener implements ActionListener{

       @Override
       public void actionPerformed(ActionEvent actionEvent) {
        double meters = Double.parseDouble(JOptionPane.showInputDialog("enter meters"));
        double feet = meters * 3.28;
        JOptionPane.showMessageDialog(null, meters + " meters equals " + feet + " feet");





       }
   }

}




