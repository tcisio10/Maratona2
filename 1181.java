import java.io.IOException;
import java.util.Scanner;

public class MyClass {
 public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double m[][] = new double[12][12];

        int linha = sc.nextInt();
        String operacao = sc.next();
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        for (int j = 0; j < 12; j++) {
            soma = soma + m[linha][j];
        }
    }
}
