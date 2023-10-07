public class method_overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(5,5));
        System.out.println(cal.sum(5,5,5));

    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(float a, float b){
        return (int) (a+b);
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

