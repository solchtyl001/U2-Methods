import javax.swing.*;
import java.text.DecimalFormat;
public class CircleCalc {


    public static void main(String[] args) {
    area();
    }
        //call the area method
        public static void area () {
        DecimalFormat round = new DecimalFormat("#.##");
            double radius = Double.parseDouble(JOptionPane.showInputDialog("what is the radius?"));
            double area =  Math.PI*(Math.pow(radius, 2));
            JOptionPane.showMessageDialog(null,  "area is " + area);
        }

        public static void circum(){
            double radius = Double.parseDouble(JOptionPane.showInputDialog("what is the radius?"));
            double circum = 2* Math.PI *radius;
            JOptionPane.showMessageDialog(null, "the C is " + circum);


        }



}