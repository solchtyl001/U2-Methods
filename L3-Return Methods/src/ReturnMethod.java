import javax.swing.*;

public class ReturnMethod {

    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("what is length"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("what is width"));
double area = area(length, width);
JOptionPane.showMessageDialog(null, "the thing is "+area+" and the other thing is "+ perimeter(length, width));

    }
    public static double area(double length, double width){

        return length * width;


    }

    public static double perimeter(double length, double width){

        return (length * 2) + (width * 2);


    }




}
