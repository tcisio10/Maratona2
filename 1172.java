import java.util.Scanner;



public class Main {

    public static void main(String[] args) {



        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 10 valores");
        int[] X = new int[10];
        for (int i=0; i < X.length; i++) {
            X[i] = leitor.nextInt();
        }
        for (int i=0; i < X.length; i++) {
            if (X[i] <= 0) X[i] = 1;
        }
        for (int i=0; i < X.length; i++) {
            System.out.println("X["+ i +"] = " + X[i]);
        }



              }
}
