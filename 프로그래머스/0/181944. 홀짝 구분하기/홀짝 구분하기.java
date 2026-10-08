import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        int n = sc.nextInt();
        b = n%2;
        if (b == 1) {
            System.out.print(n + " is odd");
        }
        if (b == 0) {
            System.out.print(n + " is even");
        }
        
    }
}