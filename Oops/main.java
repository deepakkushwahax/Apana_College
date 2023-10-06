public class main {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color("Blue");
        System.out.println(p1.color);
    }
}
    class pen {
        String color;
        int tip;

        void setColor(String newcolor) {
            color = newcolor;
        }

        void setTip(int newTip) {
            tip = newTip;
        }


    }
    class student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
    }