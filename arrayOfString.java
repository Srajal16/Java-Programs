public class arrayOfString {
    public static void main(String[] args) {
        String arr[] = {"java","pascal","smalltalk","ada","basic"};
        java.util.Arrays.sort(arr);
        for (String x:arr)
            System.out.println(x);
    }
}
