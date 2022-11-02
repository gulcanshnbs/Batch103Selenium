package day07ternarystringmanipulation;

public class StringManipulation01 {

    public static void main(String[] args) {

        /*
                    String Class Methodlari
                1)equals():           i) Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                                     ii) equals() method'u "boolean return eder
                2)equalsIgnorCase():  i) Iki tane String'in ayni olup olmadigina buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                                     ii) equalsIgnorCase() method'u "boolean" return eder.
                3)tiLOwerCase():      i) Bir String'i tum harfleri kucuk harfe cevirmek icin kullanilir.
                                     ii) tiLOwerCase method'u "Stringe" return eder.
                4)toUpperCAse():      i) Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                                     ii) toUpperCase method'u "Stringe" return eder.
                5)charArt():          i) Bir String'i den belli bir index'deki caracteri almak icin kullanilir.
                                     ii) charArt method'u "char" return eder
                6)lenght():           i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir.
                                     ii) lenght() methid'u "int" return eder.
                7)contains():         i) Bir String'de belli bir characterin veya chracterlerin var olup olmadigini anlaamk icin kullanir.
                                     ii) contains() method'u "boolean" return eder.
                8)split():            i) Bir String'i istediginiz character'den parcalamaya yarar.
                                     ii) split() method'u "Array" return eder.

         */

        /*
           Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
             i) En az 8 character icerlemelidir
            ii) Space characteri icermemeli
           iii) Ilk harfi "M" veya"m" olmali
            iv) Son characteri "?" olmali.
         */

        String pwd = "Manisa12?";

        //i) En az 8 character icermeli
        boolean first = pwd.length()>7;

        //ii) Space characteri icermemeli
        boolean second = !pwd.contains(" ");

        //iii) Ilk harfi "M" veya"m" olmali
        boolean third =pwd.charAt(0)=='M'|| pwd.charAt(0)=='m';

        //iv) Son characteri "?" olmali.
       boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);




    }
}







