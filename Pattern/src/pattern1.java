import java.sql.SQLOutput;

public class pattern1 {
    public static void main(String[] args) {
//        for (int line=1; line<=4; line++){
//            for (int star=1; star<=line; star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
// Inverted-Star Pattern



   //     int n = 4;
// for (int i=1; i<=4; i++){
//     for (int star=1; star<=n-i+1; star++){
//         System.out.print("*");
//     }
//     System.out.println();
// }




// print half pyramid using numbers
// for(int i=1; i<=4; i++){
//     for (int j=1; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

// print chracater pattern
       for (int i=1; i<=4; i++){
           for (int j=1; j<=i; j++){
               System.out.print((char)(j+64));
           }
           System.out.println();
       }



    }
}
