import java.util.Scanner;

public class conditionalTask3 {
    public static void main(String[] args) {
        float m1,m2,m3,total,avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks 1: ");
        m1 = sc.nextFloat();
        System.out.println("Enter Marks 2: ");
        m2 = sc.nextFloat();
        System.out.println("Enter Marks 3: ");
        m3 = sc.nextFloat();

        total = m1+m2+m3;
        avg = (m1+m2+m3)/3;
        System.out.println(total);
        System.out.println(avg);
        if (avg >= 70 ){
            System.out.println("Grade:A");
        }

        else if (avg>=60 && avg<70){
            System.out.println("Grade:B");
        }
        else  if (avg>=50 && avg<60){
            System.out.println("Grade:C");
        }



    }
}
