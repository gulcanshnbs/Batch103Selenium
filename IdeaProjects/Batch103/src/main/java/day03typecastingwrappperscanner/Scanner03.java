package day03typecastingwrappperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanicidan bir dikdörtgenin en ve boyunu alan ve cevresini hesaplayan kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenari giriniz...");

        int en = input.nextInt();


        System.out.println("Dikdorrtgenin uzun kenarini giriniz...");

        int boy = input.nextInt();

        System.out.println("alan" + en*boy);

        System.out.println("Cevre" + 2*(en+boy));



    }
}
