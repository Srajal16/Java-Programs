public class regularExpressions {
    public static void main(String[] args) {
        String str1 = "%";
        System.out.println(str1.matches("."));//. for single element
        String str2 = "b1";
        System.out.println(str2.matches("[abc]"));//within abc
        System.out.println(str2.matches("[a-z0-9]"));
        System.out.println(str2.matches("[a-z][0-9]"));
        String str3 = "5";
        System.out.println(str3.matches("\\w"));//any letter or character.
        System.out.println(str3.matches("\\d"));//any digits.
        //s for space.
        //S for not space.


    }
}
