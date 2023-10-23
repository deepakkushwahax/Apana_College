public class Increasing_num {
    public static void PrintIncrease(int n){
        if (n == 1){
            System.out.println(n+" ");
            return;
        }
        PrintIncrease(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        PrintIncrease(n);
    }
}
