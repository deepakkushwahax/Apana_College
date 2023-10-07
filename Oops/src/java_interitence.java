public class java_interitence {
    public static void main(String[] args) {
    fish shark = new fish();
    shark.eat();
    }
}
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }

}
class fish extends Animals{
    int fins;
    void swin(){
        System.out.println("swin");
    }
}