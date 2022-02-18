import java.util.Scanner;

public class areaOfCubiod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length,breath,height;
        int totalArea,volume;

        System.out.println("Enter Length Breath and Height:");
        length  = sc.nextInt();
        breath = sc.nextInt();
        height = sc.nextInt();
        totalArea = 2*(length*breath+height*length+breath*height);
        volume = length*breath*height;
        System.out.println("Total Area: " +totalArea);
        System.out.println("Volume: "+volume);
    }
}
