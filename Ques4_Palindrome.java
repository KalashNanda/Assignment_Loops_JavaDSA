package Assignment_Loops;

import java.util.Scanner;

public class Ques4_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (small letters) : ");
        String s = sc.nextLine();
        int n = s.length();
        for(int i=0;i<=(n-1)/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                System.out.println("Not palindrome");
                break;
            }
        }
        System.out.println("Palindrome");
    }
}
