import javax.sound.midi.spi.SoundbankReader;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void printLetters(String str){
        for (int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }

    // String is Immutable in JAVA
    public static void main(String[] args) {
//        String name = "Deepak Kushwaha";
//        System.out.println(name);

//        Scanner sc = new Scanner(System.in);
//        String obj;
//        obj = sc.nextLine();
//        System.out.println(obj);

        // Calculate length in String
        // System.out.println(name.length());

        //String Concatenation

        String firstname = "Deepak";
        String lastname = "Kushawaha";
        String fullName = firstname+ " " + lastname;
        System.out.println(fullName);

        // Function in String:- .charAt is a function that help to print a particular index in String
        System.out.println(fullName.charAt(3));
        printLetters(fullName);



    }
}