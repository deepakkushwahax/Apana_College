// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void update(int marks[]){
        for (int i = 0; i< marks.length; i++){
             marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {51,52,53};
        update(marks);
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
        }
    }
