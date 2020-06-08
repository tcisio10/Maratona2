import java.io.IOException;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de teste:");
        int N = sc.nextInt();
        
        int X, Y;
        int soma=0, cont=0;
    
        for (int i = 0; i < N; i++) {
        	cont = 0;
        	soma = 0;
        	X = sc.nextInt();
        	Y = sc.nextInt();
        	
        	while (cont < Y) {
        		if (X % 2 != 0) {
        			soma += X;
        			cont++;
        		}
        		X++;
        	}
        	System.out.println(soma);
        }
    }
	
}
