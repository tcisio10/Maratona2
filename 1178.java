import java.util.Scanner;
public class MyClass{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        double[] N = new double [100];
        double X, aux;
        X = sc.nextDouble();
        aux = X;
        
        for(int i=0; i<100; i++){
            N[i] = aux;
            aux = aux/2;
        }
        for (int Y = 0; Y <100; Y++ ){
            System.out.printf("N[%d] = %.4f\n", Y, N[Y]);
        }
        
    }
}
