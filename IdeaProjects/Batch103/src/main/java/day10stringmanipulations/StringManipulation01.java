package day10stringmanipulations;

public class StringManipulation01 {

    public static void main(String[] args) {

    String a = "Java kolaydir.";

    // starsWitch("kola,5) kodu ilk 5 karakter'deb sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
    // "kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
     boolean b= a.startsWith("kola", 5);
        System.out.println(b);

        // replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        // replace("a", "*"); kod Strind'deki tum "a" lari "*" cevirir.
       String c = a.replaceFirst("a","*");
        System.out.println(c); //J*v* kol*ydir

       // concart() method'u iki tane String'i birbirine yapistirmaya yarar.
       // concatenation islemi iki turlu yapilir; i) + ile   ii) concact() ile
       // Java bir islem icin method uretmisse o method'u kullanmak "best practice"dir.
       String d = a.concat("Anladin mi?");
        System.out.println(d); // Java kolaydir. Anladin mi?

        String e = "        ";
        System.out.println(e);

        //trim() methodu bir String#in bas ve sonundaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz.
        String f = e.trim();
        System.out.println(f);


        String h = "Java";
        String i = "Java";

        //compareTo(); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        // Buyuk harfe duyarlidir.7
        // Buyuk harf kucuk harf#e duyarli olmasini istemeyseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); koda "h" nin alpabetik sirasindan "i" alfabetik sirasini cikarrilir.
        int k = h.compareTo(i);
        System.out.println(k);

        // a.repeat(5); kodu "a" Stringini yanyana bes kere yazar.
        // Java Document'e ulasmak icin = windows= ctrl'e basili tutun   mac = command e basili tutun ve mousa ile method ismine tiklayin

        String n = a.repeat(5);
        System.out.println(n);



    }
}
