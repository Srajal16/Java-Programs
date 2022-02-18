import java.util.Scanner;

public class conditionalTask2 {
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age >14 && age<55){
            System.out.println("Person is Young!");
        }
        else{
            System.out.println("Person is not Young!");
        }
    }
}
