import java.util.*;
public class Main
{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n =  sc.nextInt();
    //method 1
    System.out.println( ( n%9 ==0 )?9: n%9);
    
   }
}
   /* method 2
   while(n>9){
    int sum  = 0 ;
   
    while(n!=0){
     int last =  n % 10 ;
     sum = sum + last;
     n/=10;
    } 
   n = sum;
    
    }
    */
   /* method 3
    while(n>9){
       n = ( n%10)+ (n/10);
    }
    System.out.println(n);
   */ 
    /*method 4
  static int sum (int n){
    int sum =0;
    while(n!=0){
      int last = n%10 ;
      sum = sum + last;
      n/=10;
    }
    return sum;
  
  }
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n =  sc.nextInt();
    while(n>9){
      n = sum(n);
    }
    
    System.out.println(n);
    */
