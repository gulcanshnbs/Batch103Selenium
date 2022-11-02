package day17arraylists.day20stringbuilderstringbuffer;

public class StringBuilder01 {


    /*
          1) "StringBuilder" Java'da bir Class'dir.
          2) "StringBuiler", String olusturmaya yarar
          3) "String" Class Varken nicin "Stringbuilder" a ihtiyac duyariz?
             Cunku "String" Class "Immutable Class"dir, ama biy bazen "Mutable" String'lere ihtiyac duyarz,
             StringBuiler bize "Mutable" String verir.
          4) "Immutable Class" larda varolan deger degistirilemez. Siz varolan bir degeri degistirmek istediginizde
               i) Memry'de yeni bir variable yeni degerle olusturulur.
              ii) Eski variable'in pointer'i yeni variable'a dondurulur.
             iii) Eger bir variable'i hic bir pointer gostermiyorsa o variable "Garabage Collector" tarafindan silinir.

             "Mutable Class" larda var olan deger degistirilebilir. Orjinal deger korunmaz.

          5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
              Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
              kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
              etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
              degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
              yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.
     */

    public static void main(String[] args) {

        String str = "Java";
        str = "Super Java";

        System.out.println(str);


        // StringBuiler nasil olusturulur?
        //1.Yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2.Yol:
        StringBuilder strb2 = new StringBuilder();
        //Yol a:
        strb2.append("Java");
        strb2.append("is easy");
        strb2.append("!!!");
        System.out.println(strb2);

        //Yol b:
        strb2.append("learn").append("Java earn").append(" money");
        System.out.println(strb2);

        //StrinBuiler'larda character sayisi nasil bulunur?

        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);

        int capacity = strb3.capacity();
        System.out.println(capacity);

        //setCharAt(2, 'r'); ==> Index 2'deki character'i "r" ye cevirir
        strb3.setCharAt(2,'r');
        System.out.println(strb3);

        //delete(3,18);==> Index 3 (dahil) den index 18(haric) e kadar tum caracterleri siler
        strb3.delete(3,18);
        System.out.println(strb3);

        // deleteCharAt(2);==> Index'deki caracteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);

        // reverse method'u StringBuileri ters cevirir. Ali==> ilA
        // "mutable" larda sadece method kullnamak orjinal degeri degistirnek icin yeterlidir.
        strb3.reverse();
        System.out.println(strb3);

        // "Immutable" larda orjinal degeri degistirmek icin method'u kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz.
        String abc = "Java";
        abc.replace("a", "i");
        System.out.println(abc);

        //toString() mezhod'u StringBuilder'lari String'e cevirir
        String stringStrbs3 = strb3.toString();
        System.out.println(stringStrbs3);

        //String'den de StringBuilder'a asagidaki gibi donebilirsiniz
        StringBuilder strb4 = new StringBuilder(stringStrbs3);
        System.out.println(strb4);

        // insert (3, "XXXX") 3. charcter den sonra "XXXX" leri koyar
        strb4.insert(3,"XXXX");
        System.out.println(strb4);

        //insert(3, "KLMOPQRSTU", 5,8); ==> 3. character'den sonra, "KLMOPQRSTU" String'inin index 5,6,7 deki character'lerini yerlestirir
        strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4);

        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        //a.compareTo(b) method'u i) StringBuiler'lar tamamiyla ayni ise 0 verir.
        //                       ii) "a" alfabetik sirada "b" den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                      iii) "a" alfabetik sirada "b" den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
        int sonuc = a.compareTo(b) ;

        System.out.println(sonuc);







    }
}
