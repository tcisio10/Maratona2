
package growingsequences;

import java.util.Scanner;


public class GrowingSequences {

    
    public static void main(String[] args) {
       int A =1, i;
       
       Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma numero:");
       A = sc.nextInt();
       
       for(i = 1; i <= A; i++)
           
            System.out.print( i + "\t" );
    }
    
}
