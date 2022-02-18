import java.util.Scanner;

public class Readingdata {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*int a,b,c;
        System.out.println("Enter two numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("Sum is: " +c);*/

        String g;
        System.out.println("May i know you name ?");
        g = s.nextLine();
        System.out.println("Hi, "+g);

    }
}
