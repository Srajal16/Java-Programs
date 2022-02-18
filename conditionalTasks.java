import java.util.Scanner;

public class conditionalTasks {
    public static void main(String[] args) {
        float a;
        System.out.println("Enter a number.");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        if (a%2==0){
            System.out.println("Even number.");

        }
        else{
            System.out.println("Odd number.");
        }
    }
}
