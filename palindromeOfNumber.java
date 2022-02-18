import java.util.Scanner;

public class palindromeOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m=n;
        int r,rev=0;
        while (n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }

         if (rev==m){
             System.out.println("Its a palindrome number");
         }
         else{
             System.out.println("Its not ");
         }

    }
}
