import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int  count=0;
       /*for (int i=0;i<str.length();i++){
        if(str.charAt(i)==' '){
            count+=1;
        }
       }
       System.out.println(count+1);*/
       String[] a = str.split("\\s+");
       for (int i=0;i<a.length;i++){
        count++;
       }
       System.out.println(count);
    }
}