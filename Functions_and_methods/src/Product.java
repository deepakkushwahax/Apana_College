import java.util.Scanner;

public class Product {
    public static int multiply(int a ,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
       int prod = multiply(a, b);
       System.out.println(prod);
    }
}