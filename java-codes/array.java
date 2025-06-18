import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        char z= sc.next().charAt(0);
        int a[] = new int[n];
        for (int i=0 ; i<n ; a[i++]=sc.nextInt());

        boolean found = false;
        switch (z){
            case 'f':
            case 'F':
                for(int i=0 ; i<a.length ; i++){
                    if(a[i] == val){
                        System.out.println(i+1);
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println(-1);
                break;
            case 'r':
            case 'R':
                for(int i=n-1 ; i>=0; i--){
                    if(a[i] == val){
                        System.out.println(i+1);
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println(-1);
                break;
            default:
                System.out.println("INVALID CHARACTER");
                break;  
        }
        
    }
}