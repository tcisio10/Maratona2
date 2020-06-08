
package age;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Age {

    
    public static void main(String[] args) {
        
        double somaP = 0, somaN = 0, cont = 0;

      double num;

        do {
           
           Scanner sc = new Scanner(System.in);
            System.out.println("Digite as idades:");
            num = sc.nextDouble();
            

            if(num > 0) {
                somaP += num;
                cont++;
            } else if(num < 0) {
                somaN += num;
            }

        } while(num >= 0);
           
        double Media;
        Media = somaP/cont;
        
        System.out.println(Media);
    }
        
