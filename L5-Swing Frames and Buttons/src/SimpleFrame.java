import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame
{

    public static void main(String[] args) {

        JFrame windoe = new JFrame("this is a lame window");
        JPanel panel = new JPanel();
        JButton button = new JButton("click for free robux");

        windoe.setSize(400, 200);
        windoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ButtonListener());


        panel.add(button);
        windoe.add(panel);
        windoe.setVisible(true);





    }

 private static class ButtonListener implements ActionListener{


     public void actionPerformed(ActionEvent e) {
       JOptionPane.showInputDialog("enter credit card number");
        JOptionPane.showInputDialog("enter three numbers on the back");
         JOptionPane.showInputDialog("enter expiration date");
     }
 }


}
