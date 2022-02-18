public class searchingAnElement {
    public static void main(String[] args) {
        //no duplicates in arrays.
        int B[] = {3,9,7,8,12,6,15,5,4,10};
        int Key = 8;
        for (int x:B){
            if (B[x]==Key){
                System.out.println("Found at: "+x);
                System.exit(0);//very imp to use
            }
        }
        System.out.println("Not Found Key.");
    }
}
