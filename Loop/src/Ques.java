import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        do {
            System.out.println("Enter yuor number: " );
            int n  = sc.nextInt();
            if (n % 10 == 0)
                break;
            System.out.println(n);
        }while (true);
    }
}
