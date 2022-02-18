public class methodsInJava {

    static int max(int x, int y){
        if (x>y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {

        int a = 10; int b = 15;
        System.out.println("Max is: "+max(10,15));
        //methodsInJava mp = new methodInJava(); if not using static.

    }
}
