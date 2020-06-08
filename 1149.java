
package sumint;

import java.util.Scanner;


public class SumInt {

    
    public static void main(String[] args) {
        int b, z = 0, x = 0, a = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();
        
         while(b <= 0) {
             System.out.print("Informe o valor de B: ");
              b = sc.nextInt();
        }
   
    if (b > 0){
            for (int i = 0; i <= b+1; i++) {
                x = a;
                z = x+a-5;
                a++;
        
        
    }
    
}
System.out.print("Soma dos numeros a partir de A: "+z);
    }
}
