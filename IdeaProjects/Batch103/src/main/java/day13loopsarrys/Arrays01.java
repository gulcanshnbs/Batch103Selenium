package day13loopsarrys;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    public static void main(String[] args) {

        /*
        1) Ayni data tipinde, coklu data'i depolamak icin Java'nin olusturdugu yapilar vardir.
           Bu yapilardan birisi de "Array" lerdir.
         */

        // Array nasil olusturulur?
        int stdAges[] = new int[7];

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Array nasil eklenir?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;

        System.out.println(Arrays.toString(stdAges));

        //Array'deki herhangi bir elemani nasil yazdirabiliriz
        System.out.println(stdAges[4]);

        //Example 1: Array'deki en kucuk ve en buyuk elemani ekrana yazdiriniz
         Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];

        //Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk + son);//24


        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        int sum = 0;

        for(int i=0; i<stdAges.length; i++){
            sum = sum + stdAges[i];
        }
        System.out.println(sum);


        //Yol: while-loop
        int i = 0;
        int toplam = 0;

        while (i<stdAges.length){
            toplam = toplam + stdAges[i];
            i++;

        }
        System.out.println(toplam);

        //3.Yol: do-while-loop
        int k=0;

        int s = 0;

        do {
            s = s + stdAges[k];
        }while (k<stdAges.length);
        System.out.println(s);


        //4.Yol: for each loop
        int t = 0;

        for(int w : stdAges){
             t = t + w;
        }
        System.out.println(t);


        // Example 3: String bir array olusturunuz
        // Bu Array'e 5 tane isim yerlestiriniz
        // Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String[] isimler = new String[5];
        isimler[0] = "Ali";
        isimler[1] = "Tom";
        isimler[2] = "Veli";
        isimler[3] = "Kemal";
        isimler[4] = "Cem";

        int karakterToplamlari = 0;

        for(String w : isimler)
        {
            karakterToplamlari += w.length();
        }

        System.out.println(karakterToplamlari);

        //Example 4: Char array olusturunuz
        //           Bu array'e 5 eleman ekleyiniz
        //           Bu array; deki sadece buyuk harfleri ekrana yazdiriniz

        char ch[] = {'A', 'c', 'D', 'k', 'm'};

        for(char w : ch){

            if(w>='A' && w<'Z'){
                System.out.println(w);
            }

        }





    }
}
