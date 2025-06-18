import java.util.*;
public class Methods1 {
    public static void change(int x[]){
        x[0]=10;   
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        change(arr);
        for(int i=0;i<arr.length;System.out.print(arr[i++]+" "));
    }
}
