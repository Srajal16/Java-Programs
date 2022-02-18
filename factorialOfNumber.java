import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int sum=1;
        for (int i=1;i<=n;i++){
            sum = sum*i;

        }
        System.out.println("factorial is: "+sum);
    }
}
