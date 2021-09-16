import javax.swing.*;

public class CircleCalc {


    public static void main(String[] args) {

        //create and run the program

        double radius = Double.parseDouble(JOptionPane.showInputDialog("what is the radius?"));
        area(radius);
        perimeter(radius);
       double area = area(radius);
       double perimeter = perimeter(radius);
        JOptionPane.showMessageDialog(null, "the thing is: " + area  + " the other thing is :" + perimeter);
    }

    //re-write the method to calculate a circle's area using parameters and return statement
public static double area (double radius) {


        return Math.PI*Math.pow(radius, 2);





}


    //re-write the method to calculate a circle's perimeter using parameters and return statement

    public static double perimeter(double radius){
        return Math.PI*Math.pow(radius, 2);


    }



}
