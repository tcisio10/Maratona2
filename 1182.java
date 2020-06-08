import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double T [][] = new double [12][12];
        int l = sc.nextInt();
        String s = sc.next();
        double sum = 0;
        
        if(l <=0 &&  l <= 11){
            for(int i = 0; i < T.length; i++){
                for(int j = 0; j < T.length; j++){
                    T[i][j] = sc.nextDouble();
                    if (l == j){
                        sum += T[i][j];
                    }
                }
            }
            if ("S".equals(s)){
                System.out.printf("%.1f\n", sum);
            }else if ("M".equals(s)){
                System.out.printf("%.1f\n", (sum / 12));
            }
        }
    }
}
