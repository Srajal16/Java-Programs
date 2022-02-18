import java.util.Scanner;

public class radicOfNumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("Enter a Number:");
        num = sc.nextLine();
        if (num.matches("[01]+")){
            System.out.println("Binary Radix");
        }

        else if (num.matches(("[0-7]+"))){
            System.out.println("Octal Radix");
        }

        else if (num.matches(("[0-9]+"))){
            System.out.println("Decimal Radix");
        }


        else if (num.matches("[0-9A-F]+")){
            System.out.println("Hexa Radix");
        }

        else{
            System.out.println("Not a number!");
        }





    }
}
