import java.util.*;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int freq[] = new int[26];
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                freq[str.charAt(i)-'a']++;
            }
        }
        int f=0;
        for (int i=0;i<26;i++){
            if(freq[i]==0){
                f=1;
                break;
            }
        }
        System.out.println((f==0)?"Panagram":"Not a Panagram");
        
           
    }
}
