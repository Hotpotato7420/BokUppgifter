package Kapitel_8;
import javax.swing.*;

public class Uppgift8_12 {

    // INTE KLAR!!!!
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Hur mycket vann du?");
        int vinst = Integer.parseInt(s);

        s = JOptionPane.showInputDialog("Hur mycket ar rantan? (%)");
        double ranta = Double.parseDouble(s);

        s = JOptionPane.showInputDialog("Hur mycket vill du ta ut varje ar?");
        int uttag = Integer.parseInt(s);



      //  int ar = arSur(vinst, ranta, uttag);
 //       System.out.println(ar);


    }
    public static void arSur (int n, double d, int i) {

        double efterR = 0;
        double vinster = 0;

        /*if (i < n * (d / 100)) {
            return Integer.MAX_VALUE;
        } else if (i == n * (d / 100)) {
            return Integer.MAX_VALUE;
        }
  */
            for (int j = 0; vinster > i; j++) {
                efterR = (n + (n * (d / 100)));
                vinster = efterR - i;
                System.out.println(j);
                if (vinster < i){
                    System.out.println(j);
                }
            }

        return;
    }
}

