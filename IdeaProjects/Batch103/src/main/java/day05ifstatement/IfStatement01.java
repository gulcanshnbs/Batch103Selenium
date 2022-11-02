package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu giriniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int s = input.nextInt();

        //1.Yol:
        if(s%2==0){
            System.out.println("Cift sayi...");

        }

        if(s%2!=0){
            System.out.println("Tek sayi giriniz...");
        }

        //2.Yol:
        if(s%2==0){
            System.out.println("Cift sayi...");
        }else{ //else demek diger bütün ihtimaller
            System.out.println("Tek sayi giriniz...");
        }

        //Example 2: Bir sayinin negatif, positif veya notr oldugunu soyleyen kodu yaziniz.
        System.out.println("bir sayi giriniz...");
        double d = input.nextDouble();

        if(d>0) {
            System.out.println("Positif");
        }else if(d==0) {
            System.out.println("Notr");
        }else{
            System.out.println("Negatif");
        }

    }
}
