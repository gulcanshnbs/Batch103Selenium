package day12loops;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example 1: 3den 10a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz.

        //1.Yol
        for(int i=3; i<11;i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //2Yol:
        int i=3;

        while (i<11){
            System.out.print(i + " ");

            i++;

        }

        //Example 2: 17 den 4e kadar tum cift sayialri ekrana ayni satirda yazdiran kodu yaziniz.

        int k =17;

        while (k>3){

            if (k%2==0){
                System.out.println(k +" ");
            }
            k--;
        }

        //Example 3: 12 den 67 e kadar sayilarin toplamini veren kodu yaziniz.
        int sum = 0;
        int m = 12;

        while (m<15){
            sum = sum +m;

            m++;
        }
        System.out.println(sum);

        //Example 4: Size verilen bir tamsayinin rakamlari toplamina ekrana yazdiran kodu yaziniz.

        int sonuc = 0;

        int sayi = 385;

        while (sayi>0){

            sayi = sayi/10;
        }
        System.out.println(sonuc);


       // Example 5: Kullanicidan aldigimiz bir sayinin carpim tablosunu ekrana yazdiriniz
       //            3==> 3*1=3    3*2=6   3*3=9  ....    3*10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int s = input.nextInt();
        int n = 1;
        while (n<11){
            System.out.println(s + "x" + n + "=" + s*n);

            n++;
        }
    }
}























