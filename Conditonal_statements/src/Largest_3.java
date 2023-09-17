import java.util.Scanner;

public class Largest_3 {
    public static void main(String[] args) {
//        int A = 81 , B = 13, C = 6;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if ((A >= B) && (A >= C)){
            System.out.println("Largest is A ");
        } else if (B >= C) {
            System.out.println("Largest is B ");
        }
        else{
            System.out.println("Largest is C");
        }
    }
}
