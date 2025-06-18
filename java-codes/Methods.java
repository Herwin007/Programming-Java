import java.util.*;
public class Methods {
    public static boolean isPrime(int x){
        for (int i=2;i<Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(isPrime(a));
        System.out.println(isPrime(b));

    }
}
