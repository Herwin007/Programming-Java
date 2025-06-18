import java.util.*;
public class TwistedPrime {
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
        boolean n = isPrime(a);
        int reverse=0;
        for (int i=0;i<a;i++){
            int digit = a%10;
            reverse = reverse*10 + digit;
            a/=10;
        }
        System.out.println(reverse);
        boolean m = isPrime(reverse);
        if (n==true && m==true){
            System.out.println("Twisted Prime");

        }
        else{
            System.out.println("Not a Twisted Prime");
        }
    }
}
