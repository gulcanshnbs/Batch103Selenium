package day15arraysmultidimensionalarraya;

import java.util.Arrays;

public class Arrayas01 {
    public static void main(String[] args) {

        //binarySearch() Method: Bu method'u kullanarak bir elemanin Array'de olup olmadigini anlariz.
        //                       binary Search() Method'unu kullanmadan mutlaka "Arrays.sort()" kullanilmalidir
        //                       binary Search() Method'u aradiginiz eleman Array'de varsa o elamanin indexini return eder.
        //                       binary Search() Method'u aradiginiz eleman Array'de yoksa "-a" seklinde bir negatif sayi alirsini
        //                                       bu sayidaki "-" isaretinin anlami bu elemanin Array'de yok demektir, "a" nin anlami olsaydi kacinci sirada olurdu demektir.
        // Not :                 binary Search() Method'u tekrarlayan elemanlar icin kullanilmaz.

        int arr[] = {12,31,43,14};

        int sayi = 43;
        Arrays.sort(arr);
       int idx1 = Arrays.binarySearch(arr,sayi);
        System.out.println(idx1);

        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc);


    }
}
