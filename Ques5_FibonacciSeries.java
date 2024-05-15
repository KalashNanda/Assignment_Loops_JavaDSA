package Assignment_Loops;

import java.util.Scanner;

public class Ques5_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n-2;i++){
            int sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
