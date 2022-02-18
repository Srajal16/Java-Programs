public class maxElementOfArrayMethod {

    static int max(int A[]){
        int max = A[0];
        for (int i=0;i<A.length;i++)
            if (A[i]>max)
                max = A[i];


        return max;


    }

    public static void main(String[] args) {

        System.out.println("Max element in the array: " +max(new int[]{2, 205, 41, 21, 95}));

    }
}
