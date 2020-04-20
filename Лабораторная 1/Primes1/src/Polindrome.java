public class Polindrome {
    public static String reverseString(String s){
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--){
            rev += s.substring(i, i+1);
        }
        return rev;
    }

    public static boolean isPalindrome(String s){
        if (s.equals(reverseString(s)))
            return true;
        else return false;
    }

    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            String s = args[i];
            System.out.println(reverseString(s));
            if (isPalindrome(s))
                System.out.println("Word is palindrome");
            else
                System.out.println("Word is not palindrome");
        }
    }
}
