import java.util.Scanner;
public class MyClass {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int [] x = new int[N];
        int menor = 0, posMenor = 0;
        
        for(int i=0; i < N; i++){
            x[i] = sc.nextInt();
            
            if (i == 0){
                menor = x[i];
                posMenor = i;
            }else if (x[i] < menor){
                menor = x[i];
                posMenor = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posição: " + posMenor);
    }
}
