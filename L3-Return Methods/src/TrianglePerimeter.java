import javax.swing.*;
import java.text.DecimalFormat;

public class TrianglePerimeter {

    /*
    Create a program which when given three coordinates of a triangle, calculates the perimeter.
    1. Get points
    2. do math
    3. give answer
    4.
    5.
    6.




    (2,3) , (5, 7) , (-2, 8) -> 18.47

    Program should round to 2 decimals and include two methods,
    one for returning the distance between two points and another
    for calculating the perimeter of a triangle.
     */

    public static void main(String[] args) {

        int x1 = input("point 1 x=");
        int y1 = input("point 1 y=");

        int x2 = input("point 2 x=");
        int y2 = input("point 2 y=");

        int x3 = input("point 3 x=");
        int y3 = input("point 3 y=");

        double distance1 = distance(x1, y1, x2, y2);
        double distance2 = distance(x2, y2, x2, y3);
        double distance3 = distance(x1, y1, x3, y3);

        double perimeter = perimeter(distance1, distance2, distance3);

        output(perimeter);

    }





    public static int input(String prompt){

    return Integer.parseInt(JOptionPane.showInputDialog(prompt));






    }

   public static double distance(int x1, int y1, int x2, int y2){

   return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));



   }

    public static double perimeter(double side1, double side2, double side3){
        return side1 + side2 + side3;

    }

    public static void output(double perimeter){
        DecimalFormat round = new DecimalFormat("#,###.00");
JOptionPane.showMessageDialog(null, "the thing is " + perimeter);



    }


}


























