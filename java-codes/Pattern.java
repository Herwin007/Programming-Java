import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int count = 2;  // Start counting from 1

        for (int i = 0; i < n; i++) {          // Row loop
            for (int j = 0; j < n; j++) {      // Column loop
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();  // Move to next line
        }
    }
}
