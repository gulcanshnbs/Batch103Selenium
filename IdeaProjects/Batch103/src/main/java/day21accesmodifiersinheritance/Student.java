package day21accesmodifiersinheritance;

public class Student {


    /*
    1) public   2) protected   3) default (Access Modifier'i default yapmak icin accsess yazmayiz  4) private

    Note: Access Modifier'lari genisden dara dogru sayiniz
           -public > protected > default > private
    Note: Access Modifier'lari birer birer aciklayiniz
           -public olanlar her class'dan kullanilabilir
           -protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
           -default olanlar baska package'den kullanilamazlar
           -private olanlar sadece olsturulduklari Class icinde kullanilabilirler
    Note: "protected" ile "default" un farkini soyleyiniz.
           -protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
           -default olanlar baska package'den kullanilamazlar
    Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
           -public, default kullanilir ama protected ve private kullanilamaz


       */

    // public her Class'dan kullanaílabilir.
    public String stdName = "TomHanks";

    //protected olanar baska packeage'lerden kullanimaz ancak baska package'de "child class" icinden kullanilabilir
    protected String address = "Miami";

    //default olanlar baska package'den kullanilmaz
    String email = "th@gmail.com";

    //private olanlar sadece olusturulduklari Class icinde kullanilabilirler
    private String stdId = "202017004";


}
