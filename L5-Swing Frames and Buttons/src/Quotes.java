import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */

    public static void main(String[] args) {
        JFrame window = new JFrame("dont click the buttons");
        JPanel panel = new JPanel();
        JButton button = new JButton("first quote");
        JButton buton = new JButton("also a quote");
        JButton buon = new JButton("other quote");
        window.setSize(150, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ButtonListener());
        buon.addActionListener(new buonListener());
        buton.addActionListener(new ButonListener());
        panel.add(button);
        window.add(panel);
        window.setVisible(true);
        panel.add(buton);
        panel.add(buon);



    }
    private static class buonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "I Do Think That We Suffer More If We Resist The Flow Of The River");


        }
    }








    private static class ButonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "It is not enough that I shall succeed, others shall fail");
        }
    }





     private static class ButtonListener implements ActionListener{

         @Override
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "where ever there is light, shadows are also to be found");



         }
     }



}
