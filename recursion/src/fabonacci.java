public class fabonacci {
    public static int SumFibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int fnm1 = SumFibonacci(n-1);
        int fnm2 = SumFibonacci(n-2);
                int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 200;
        System.out.println(SumFibonacci(n));

    }
}
