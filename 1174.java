import java.util.Scanner;
import java.io.IOException;



public class Main {


        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
                System.out.println("Digite os valores");
            double[] A = new double[100];
            for (int i=0; i < A.length; i++) {
                A[i] = leitor.nextDouble();
            }
            for (int i=0; i < A.length; i++) {
                if (A[i] <= 10) System.out.println(String.format("A["+ i +"] = %.1f" , A[i]));
        }
    }
}
