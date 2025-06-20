import java.util.*;
public class  NPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                char cChar = str.charAt(i);
              
                if(i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                    int count = str.charAt(i + 1) - '0';
                    
                    for(int j = 0; j < count; j++) {
                        res.append(cChar);
                    }
                    i++; 
                }
            }
        }
        
        System.out.println(res.toString());
    }
}