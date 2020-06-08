import java.util.Scanner;
import java.io.IOException;



public class Main {


        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
           System.out.println("Digite um valor inteiro para X");
            int X = leitor.nextInt();
           System.out.println("Digite um valor inteiro para Z");
            int Z = leitor.nextInt();
            int cont = 0;
            int soma = 0;
            while (Z <= X) {
                System.out.println("Ovalor de Z tem que ser maior que o valor de X");
                Z = leitor.nextInt();
            }
            while (soma < Z) {
                soma += X;
                cont++;
                X++;
            }
            System.out.println("Z cabe " + cont + " dentro de X");

    }
}
