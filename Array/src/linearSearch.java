public class linearSearch {
    public static int lnrSach(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,5,8,7,9,4,10};
        int key = 10;
        int index = lnrSach(number, key);
        if (index == -1) {
            System.out.println("Not found");
        }else {
            System.out.println("key is at index:" +index);
        }

    }
}
