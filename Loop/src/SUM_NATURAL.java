import java.util.Scanner;

public class SUM_NATURAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n){
            sum = sum +i;
            System.out.println(sum);
            i++;
        }
    }
}
