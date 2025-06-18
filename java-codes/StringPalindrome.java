import java.util.*;
import java.lang.String.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String.toLowerCase(str);
        int f = 0;
        for (int i=0,j=str.length()-1 ;i<=j ;i ++,j--){
            if (str.charAt(i)!= str.charAt(j)){
                f=1;
                break;
            }
        }
        System.out.println((f==0)?"Palindrome":"Not a Palindrome");
    }
}