package day02methodcreation;

public class MethodCreation {

      // main icinde kullandiginiz hersey "statik" olmalidir.
      public static void main(String[] args){

            System.out.println(toplamaYap(1.2, 5));

            System.out.println(ucSayiyiCarp(2,1.5,6));

            System.out.println(ilkIkiyiToplaUcunucuyuCarp(2,8,3.2));

            // sout yazip "Enter" a basinca System.out.println() otomatik olarak yazilir.
            // Ekrana bir sey yazdirmak icin iki tane kod var i) System.out.printl() ==> satir basi yapar ii) System.out.print() ==> satir basi yapmaz

            MethodCreation obj = new MethodCreation();

      }

      //Example 1: Toplama islemi yapan bir method olusturunuz.
      public static double toplamaYap(double a, double b){
          return a + b;
      }
      //Example 2: Uc sayiyi birbiri ile carpip bir method olustunuruz.
       public static double ucSayiyiCarp(double a, double b, double c){
           return a*b*c;

       }

     //Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carp method olusturup, sonucu ekrana yazdiriniz

       public static double ilkIkiyiToplaUcunucuyuCarp(double a, double b, double c){

          return (a+b) * c;
    }




}

