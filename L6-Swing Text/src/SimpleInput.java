import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleInput {

    static  int ClickerCount = 0;
    static JLabel clickerCountLabel ;
    static JTextField textInputField;

    public static void main(String[] args) {

        JFrame window = new JFrame("clicker game");
        JPanel panel = new JPanel();
        textInputField = new JTextField(10);
       clickerCountLabel = new JLabel("BALANCE: $");
       JLabel textFieldInput = new JLabel(" enter multplyer");
        JButton clicker = new JButton("click fo a dolla");

        window.setSize(150, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        clicker.addActionListener(new ClickerListener());

        panel.add(textFieldInput);
        panel.add(textInputField);
        panel.add(clickerCountLabel);
        panel.add(clicker);
        window.add(panel);

        window.setVisible(true);


    }


    private static class ClickerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            int multiplyer = Integer.parseInt(textInputField.getText());

            ClickerCount+= multiplyer;
        clickerCountLabel.setText("balance: $" + ClickerCount);
        }
    }





























}
