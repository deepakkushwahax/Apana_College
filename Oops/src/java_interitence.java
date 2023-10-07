public class java_interitence {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();
        Animals Elephant = new Animals();
        Elephant.size();
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
    void size(){
        System.out.println("Sizes of the given Animals");
    }
}
class Fish extends Animals{
    int fins;
    void swim(){
        System.out.println("Fishes are swim in the water");
    }
}