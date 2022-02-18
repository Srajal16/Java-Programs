public class sumOfAllElementsInArray {
    public static void main(String[] args) {
        int B[] = {3,9,7,8,12,6,15,5,4,10};
        int sum = 0;
        for (int i=0;i<B.length;i++){
            sum = sum + B[i];

        }
        System.out.println("Sum is: "+sum);
    }
}
