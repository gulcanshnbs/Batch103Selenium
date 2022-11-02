package day12loops;

import java.util.Scanner;

public class NestedFordLoop01 {

    public static void main(String[] args) {

        //Example 1:Asagidaki sekli yazdiran kodu yaziniz.

        //  ****
        //  ****
        //  ****
        Scanner input =new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();

        System.out.println("Karakter seciniz");
        char ch = input.next().charAt(0);

        for(int i=0; i<satir; i++){

            for(int k=0; k<sutun; k++){
                System.out.print("ch");
            }
            System.out.println();
        }
        /*
        Example 2: Asagidaki sekil cizen kodu yaziniz.
                1
                12
                123
                1234
                12345
        */

        for(int i=1; i<6; i++){

            for(int k=1; k<=i; k++) {
                System.out.println(k + " ");
            }
            System.out.println();
            }
        /*
        Example 3: Asagidaki sekli cisen kodu giriniz

               * * * *
               * * *
               * *
               *
         */
        int row = 4;

        for(int i=1; i<row; i++){

            for(int k=row; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }







    }

}
