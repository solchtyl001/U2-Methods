import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
    step one: get input
    step two: learn how to do everything because I missed a day
    step three: find out why Mr.Laws screen isnt showing on mine
    step four: find the first P and three letters after
    step five: output results
     */

    public static void main(String[] args) {
      String word = JOptionPane.showInputDialog("enter P word with a p in it");

       JOptionPane.showMessageDialog(null, theP(word));

    }


    public static String theP(String word){
       int pindex =  word.indexOf('p');

       return word.substring(pindex,pindex+4);



    }







}
