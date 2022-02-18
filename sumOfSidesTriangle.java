import java.util.Scanner;

public class sumOfSidesTriangle {
    public static void main(String[] args) {
        int a,b,c;
        float s;
        double Area;

        System.out.println("Please enter three sides of triangles:");
        Scanner z = new Scanner(System.in);
        a = z.nextInt();
        b = z.nextInt();
        c = z.nextInt();

        s = (a+b+c)/2f;

        Area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println(Area);


    }
}
