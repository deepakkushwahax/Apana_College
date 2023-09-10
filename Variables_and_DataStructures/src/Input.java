import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input =  sc.next();
//        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

    }
}
