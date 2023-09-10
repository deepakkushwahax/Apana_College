import java.util.Scanner;

public class Find_Max_Num {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int c = 15;
        int max;
        if(a>b){
            if(a>c)max =a;
            else max =c;
        }
        else{
            if(b>c)max=b;
            else max=c;
            System.out.println(max);
        }

    }
}
