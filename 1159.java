import java.io.IOException;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Insira um número:");
        int X = sc.nextInt();
        
        int soma=0, cont=0;
       
        while (X != 0) {
        	cont = 0;
        	soma = 0;
        	while (cont < 5) {
        		if (X % 2 == 0) {
        			soma += X;
        			cont++;
        		}
        		X++;
        	}
        	System.out.println(soma);
        	X = sc.nextInt();
        }
    }
	
}
