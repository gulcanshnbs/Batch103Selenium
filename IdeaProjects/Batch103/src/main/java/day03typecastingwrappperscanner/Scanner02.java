package day03typecastingwrappperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1: Sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz.

        // Adim 1: Scanner Class'indan object olustur
        Scanner input = new Scanner(System.in);

        // Adim 2: Kullaniciya ne yapacagini söyle
        System.out.println("Ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble();

        System.out.println("Ikinciyi sayiyi giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);
    }
}
