package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {

        // Example 1: Bir sayinin postif olup olmadigini  ekrana yaziniz.

        //1.Way: if-else
        int a = 12;
        if(a>0) {
            System.out.println("Positif");
        }else{
            System.out.println("Positif degil");
        }

        //2.Yol: ternary
                     // Condition   ?  Condition dogru ise uygulanacak kod   :   Condition yanlis ise uygulanacak kod
        String sonuc =     a>0      ?           "Pozitif"                    :            "Pozitif degil";
        System.out.println(sonuc);


        //Example 2: Iki sayidan kucuk olani secen kodu giriniz.
        int b = 23;
        int c = 23;

        int min = b<c ? b: c;
        System.out.println(min);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           Positif sayilarin ve sifirn mutlak degeri kendilerinidr.
        //           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.
        int d = 45;

        int abs = d<0 ? -1*d : d;

        System.out.println(abs);

        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "Islem yapamam" mesaji veriniz.
        int e = 12;
        int f = -10;

        //Not: Ternry farkli data tiplerinde sonuc return ederse sonucu data tipini "Obeject" yapiniz.

       Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem yapamam";

        System.out.println(islem);

        //Not: Java'da her class#in bir tane "parent" class'i vardir.
        //     Sadece Obeject class'in "parent" class'i yoktur.










    }
}



























