public class PrintSum {
    public static int sumNum(int n){
        if (n == 0){
            return 1;
        }
        int snm1 = sumNum(n-1);
        int Sn = n + snm1;
        return Sn;

    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sumNum(6));

    }
}
