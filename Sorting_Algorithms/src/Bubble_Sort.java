public class Bubble_Sort {

    public static void Sorting(int num[]){
        for (int turn=0; turn<num.length-1; turn++){
            for (int j=0; j<num.length-1-turn; j++){
                if (num[j] > num[j+1]) {
                    //swap
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                  }
            }
        }
    }
    public static void printNum(int num[]){
        for (int i=0; i<num.length; i++){
            System.out.println(num[i]+ " ");
        }
        System.out.println(  );
    }

    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //Sorting
        int j = 0;
        for (int i=0; i<count.length; i++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {5, 4, 1, 3, 2,7,5,9,10,8};
        CountingSort(num);
        printNum(num );
    }
}
