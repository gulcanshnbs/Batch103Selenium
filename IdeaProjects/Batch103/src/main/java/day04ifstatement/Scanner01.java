package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        /* Kullanicidan ilk, orta ve soy ismini aliniz ve asagidaki formata yazdiriniz.
           Ali Mert Can
           123456789

          */
        Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz...");
        String ilkIsim = input.next();// next() methodu kullanicidan String datasi almak icin kullanilir.#

        System.out.println("Orta isinizi giriniz");
        String ortaIsim = input.next();

        System.out.println("Soy ismini giriniz...");
        String soyIsim = input.next();

        System.out.println("Kimlik numarasi giriniz");
        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);

        //2:Yol:
        System.out.println("Ilk, orta, soyismini ve kimlik numaranizi giriniz");
        String ilk  = input.next();
        String orta = input.next();
        String soy  = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soyIsim);
        System.out.println(kimlik);


        /*
           next() ile nextLine() in farki nedir?
           next() methodu kullanicidan gelen String'in sadece ilk kelimesini alir.
           nextLine() methodu kullancidan gelen String'i tamamini alir.
         */

        //3.Yol:
        System.out.println("ilk, orta ve soy isminizi giriniz");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);

        System.out.println("Kimlik numarasini giriniz");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);


        //Mac ==> command+/
        //Windows ==> crtl+/




    }
}
