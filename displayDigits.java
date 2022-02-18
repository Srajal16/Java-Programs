import java.util.Scanner;

public class displayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter any number: ");
        while (n>0){

            int r = n%10;
            n = n/10;

            System.out.println(r);


        }
    }
}
