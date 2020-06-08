import java.util.Scanner;

public class Fibonacci {
  
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
  
  
    public static void main(String[] args) {
     int A = 1, i;
     
     Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
     A = sc.nextInt();
     
        for (i = 0; i < A; i++) {
            System.out.print( + Fibonacci.fibo(i) + "\t");
        }
  
    }
  
}
