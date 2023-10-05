// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void oddEven(int n){
         int bitMask = 1;
         if ((n & bitMask) == 0){
             //even number
            System.out.println("Even number");
        } else {
            System.out.println("odd number");
        }


        }

        public static boolean getIthBit(int n, int i) {
            int bitMask = 1 << i;
            if ((n & bitMask) == 0) {
                System.out.println('0');
            } else {
                //1  return 0;
            }
            // return 1;
            return false;
        }

    public static void main(String[] args) {
        // AND Bitwise Operator
        System.out.println(5&6);

        // OR Bitwise Operator
        System.out.println(5|6);

        // OR Bitwise Operator
        System.out.println(5^6);

        // 1's  Bitwise Operator
        System.out.println(~1);

        // Left shift Bitwise Operator
        System.out.println(5<<6);

        // Right shift Bitwise Operator
        System.out.println(5>>6);

        // find given number is Even or Odd
//        oddEven(2);
//        oddEven(3);

        System.out.println(getIthBit(10,3));


    }
}