import java.util.Scanner;

public class Palindrome {
    public static boolean Plndm(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n- 1 - i)) {
                // not a palindrome
                return false;

            }

        }
        return true;

    }
    //Palindrome word is word tha read forward or backward it's same call palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
       // String str = "noon";
        System.out.println(Plndm(str));
    }
}
