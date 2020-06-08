import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int primo;
        int divisor = 0;
        
        System.out.println("Digite um nùmero.");
        primo = sc.nextInt();
        
        for(int i = 1; i <= primo; i++){
            if(primo % i ==0){
            divisor++;
            
        }
     }
    
    if(divisor ==2){
        System.out.println("o número digitado é primo");
    }else {
        System.out.println("o número digitado não é primo");
    }
    
}
}
