import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    static JLabel answerLabel;
    static JLabel answerLabel2;
    static JTextField textInputField2;
    static JTextField textInputField;
    static JLabel result;
    public static void main(String[] args) {

        JFrame window = new JFrame("calclature");
        JPanel panel = new JPanel();
        JButton multiply = new JButton("multiply");
        JButton divide = new JButton("divide");
        JButton add = new JButton("add");
        JButton subtract = new JButton("subtract");

        textInputField = new JTextField(10);
        textInputField2= new JTextField(10);
        answerLabel = new JLabel("enter a number");
        answerLabel2 = new JLabel("enter a number");
        result = new JLabel("0.00");
        window.setSize(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(answerLabel);
        panel.add(textInputField);
        panel.add(answerLabel2);
        panel.add(textInputField2);

        panel.add(result);

        window.add(panel);
        panel.add(multiply);
        panel.add(divide);
        panel.add(add);
        panel.add(subtract);

        window.setVisible(true);

        multiply.addActionListener(new Multiplyer());
        add.addActionListener(new adder());
        subtract.addActionListener(new subtractor());
        divide.addActionListener(new divider());
    }

        public static class Multiplyer implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double numberOne = Double.parseDouble(textInputField.getText());
                double numberTwo = Double.parseDouble(textInputField2.getText());

                result.setText(String.valueOf(numberOne*numberTwo));
            }
        }


    public static class divider implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            double numberOne = Double.parseDouble(textInputField.getText());
            double numberTwo = Double.parseDouble(textInputField2.getText());

            result.setText(String.valueOf(numberOne/numberTwo));

        }
    }


    public static class subtractor implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            double numberOne = Double.parseDouble(textInputField.getText());
            double numberTwo = Double.parseDouble(textInputField2.getText());

            result.setText(String.valueOf(numberOne-numberTwo));


        }
    }


    public static class adder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            double numberOne = Double.parseDouble(textInputField.getText());
            double numberTwo = Double.parseDouble(textInputField2.getText());

            result.setText(String.valueOf(numberOne+numberTwo));

        }
    }




























}
