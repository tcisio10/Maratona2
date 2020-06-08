import java.io.IOException;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Insira um número inteiro:");
        int T = sc.nextInt();
        
        int PA, PB, anos;
        double G1, G2;
        
        for (int i = 1; i <= T; i++) {
        	anos = 0;
        	
        	System.out.println("População A:");
        	PA = sc.nextInt();
        	
        	System.out.println("População B:");
        	PB = sc.nextInt();
        	
        	System.out.println("Crecimento da população A:");
        	G1 = sc.nextDouble();
        	
        	System.out.println("Crecimento da população B:");
        	G2 = sc.nextDouble();
        	
        	while (PB >= PA) {
        		PA += (PA * G1) / 100;
        		PB += (PB * G2) / 100;
        		anos++;
        		if (anos > 100) {
        			break;
        		}
        	}
        	if (anos > 100) {
        		System.out.println("Mais de 1 seculo.");
        	} else {
        		System.out.println(anos + " anos");
        	}
        }
    }
	
}
