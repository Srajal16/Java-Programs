import java.util.Scanner;

public class rootsOfQuadraticEquations {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        System.out.println("Enter the values of a,b and c:");
        Scanner s  =  new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("Roots are:");
        System.out.println(r1);
        System.out.println(r2);
    }
}
