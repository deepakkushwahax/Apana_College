import java.util.Scanner;

public class area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextInt();
        float area = 3.14f * rad * rad;
        System.out.println(area);

    }
}
