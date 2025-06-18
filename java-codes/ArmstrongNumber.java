import java.util.*;
public class ArmstrongNumber {
    public static boolean check(int x, int y){
        int temp=x;
        int sum=0;
        while(temp>0){
            int digit = temp%10;
            sum+=Math.pow(digit,y);
            temp/=10;
        }
        if (sum==x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp=a;
        int n=0;
        while(temp>0){
            temp/=10;
            n++;
        }
        System.out.println((check(a,n))?"Armstrong Number":"Not a Armstrong Number");
    }
 
}
