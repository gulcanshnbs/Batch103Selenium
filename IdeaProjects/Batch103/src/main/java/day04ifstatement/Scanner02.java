package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
      Not: char variable'leri matematiksel islemlerde kullanirsaniz, Java onlari ASCII degerinde kullanir.
           Örnegin; System.out.println('A' + 'C') ekrana ac yerine 132 yazdirir.
      Not: Java'da "+" sembolunun iki anlami vardir. i) Toplama islemi ii) Birlestirme islemi (Concatenation).
            Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
     */

    public static void main(String[] args) {

        //Example 1: Kullancidan ilk  ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz.
        //           Ali Can = AC

        Scanner input = new Scanner(System.in);

        //1.Yol:
        System.out.println("Ilk isminizi giriniz");
        char ilk = input.next().charAt(0);

        System.out.println("Soy isiminizi giriniz");
        char son = input.next().charAt(0);

        System.out.println("" + ilk + son);

        //2:Yol:

        System.out.println("Tam isminizi girin");
        String tamIsim = input.nextLine();

        char ilkHarf = tamIsim.charAt(0);
        System.out.println(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split( " ")[1].charAt(0);

        System.out.println(soyIsminIlkHarfi);






    }
}
