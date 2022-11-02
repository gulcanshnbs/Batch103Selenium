package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        //indexOf() method'u verilen karakter veya karakter'lerin gorunumunu index'ini verir.
        int idxA = str.indexOf("kara");
        System.out.println(idxA);

        //lastIndexOf() Merhod'u verilen karakter veya karakter'lerin "son gorunumunun" index'ini verir.
       int idxA2 = str.lastIndexOf("a");

        System.out.println(idxA2);//9

        String s = "Mississippi";

        int idxI = s.indexOf('i');//indexOf() hem String hem de char ile kullanabilir.

        System.out.println(idxI);


        int idxIss1 =s.indexOf("iss");// Ilk gorunumun "Ilk" karakterinin indexini verir.
        System.out.println(idxIss1);

        int idxIss2 = s.lastIndexOf("iss");//Son gorunumun "ilk" karakterinin indexini verir.
        System.out.println(idxIss2);

        //Example 1: Bir String'deki bir karakter'in tekrrali veya tekrarsiz olup olmadiginin kodu yaziniz.
        //           "Helloooo" ==> H-> Tekrarsiz  e-> Tekrarsiz l-> Tekrarli o-> Tekrarli

        String t = "Helloooo";

        if(t.indexOf('H')==t.lastIndexOf('H')) {
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        // indexOf() iki paramentre ile kullanilirsa ikinci parametre verilen sayi kadar karakter'i gectikten sonra istenen karakter'in
        // ilk gorunumunun idexini return eder.

        u.indexOf("a",3);
        System.out.println("sonuc");

        // lastIndexOf() iki paramentre ile kullanilirsa ikinci parametre verilen saiyi index olarak kabul edip en bastan
        // bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'u sadece bu kutu icindeki String icin kullaniniz
        String m= "Hello everone";
        int e = m.indexOf("e", 5);
        System.out.println(e);

        String v = "";
        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic karakter yoksa isEmpty() "true" return eder, her hangi bir karakter varsa "false" return eder.
        //lenght()==0 demek isEmpty() true verir demektir.
        // Bir String'in bos olup olmadigini anlamak icin "lenght()=0" kullanmayin, "isEmpty()" kullanin.
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = "";
        //isBlank() hem"bos String" icin hemde"sadece space" iceren String'ler icin true return eder.
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);

        //Example 2: Kullanicidan alinan isim  mutlaka space'den farkli en az bir karakter icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()) {
            System.out.println("sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
        }

    }
}





