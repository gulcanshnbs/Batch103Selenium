package day22inheritancepolymorphism;

public class CatRunner {
/*
            1)Java da Object olustururken Constructor'lar Parent'dan Child'a dogru calistirilir.
            2)Java en ust parent constructor'a cikabilmek icin "super()" kodunu kullanir.
            3)"super()" kodu her constructor'in "ilk satirinda" "gizli" olarak bulunur.
            4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, Java kizmaz.
            5)"super()" kodunu gorunur sekilde de yazarsaniz sakin haaa ilk satir disinda bir satira koymayiniz, hata verir.
            6)"super()" kodu Parent Class'dan constructor cagirmaya yarar.
           */


    public static void main(String[] args) {

        Cat cat1 = new Cat();

    }
}
        // Note :  Object olusturken Java Constructer kontrol eder ve onlari calistirir.
        // Note : Her Constructer ilk satirinda gorunmeyen super(); ==>kodu vardir.
        // super(); ==> Parent'taki Constructer'i cagirmak icin kullanilir.
        // Java ya göre bir Child Class'in olusturulmus olmasi icin bir Parent Class olmasi lazim