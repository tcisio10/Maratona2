
package fatorial;

import java.util.Scanner;


public class Fatorial {

   
    public static void main(String[] args){
     int fat,n,i;
        
     Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para saber o fatorial: ");
     n = sc.nextInt();
     
        fat =1;
        for (i = 1; i<= n; i++){
              fat = fat * i;
            
        
    }
    System.out.println("O fatorial de " + n + " é: " + fat);    
}
    
}
