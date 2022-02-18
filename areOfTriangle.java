import java.util.Scanner;

public class areOfTriangle {
    public static void main(String[] args) {
        float b,h,area;
        Scanner s  = new Scanner(System.in);
        System.out.println("Please enter base:");
        b = s.nextFloat();
        System.out.println("Please enter height: ");
        h = s.nextFloat();
        area = (b*h/2);
        System.out.println("Area of the triangle is:" +area);
    }
}
