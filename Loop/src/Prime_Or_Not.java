import java.util.Scanner;

public class Prime_Or_Not {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2){
            System.out.println("n is Prime");
        }
        boolean isPrime = true;

        for (int i=2; i<=n-1; i++){
            if (n % i ==0){
                isPrime = false;
            }

        }
        if (isPrime == true){
            System.out.println("n is prime");
        }else {
            System.out.println("n is not prime");
        }
    }
}
