import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i=1;i<10;i++){

            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}
