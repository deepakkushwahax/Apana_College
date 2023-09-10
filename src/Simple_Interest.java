import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float P = sc.nextFloat();
        float R = sc.nextFloat();
        float T = sc.nextFloat();;
        float Interest = (P*R*T)/100;
        System.out.println(Interest);
    }


}
