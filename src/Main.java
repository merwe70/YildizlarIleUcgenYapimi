import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        number = inp.nextInt();

        for (int i =0; i <=number ; i++){
           for (int k = 0; k<=(number-i); k++){
               System.out.print(" ");
           }
           for (int j = 1; j<=(2*i+1);j++){
               System.out.print("*");
           }
            System.out.println(" ");
        }

        for (int m = 0; m <= (number-1); m++) {
            for (int y =0; y <= (m+1); y++) {
                System.out.print(" ");
            }
            for (int z = (2 *number -(2 *m +1)); z >=1; z--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}