package day01variables;

public class Variables01 {

    //Variable nasil olusturulur?

    //1) Access Modifier 2) Data Type 3) Variable isim 4) =      5) Deger
    // Java´da ";" Ingilizce´deki "." gibidir
    // Ingilizce`de "cume" deriz, Java`da "statment" deriz

    // "=" sembolu "Assignment (Atama) Operator" olarak adlandirilir
    // " Assignment (Atama) Operator" sadaki degeri alir soldaki variableìn icine koypublic int age = 13;


    public int age = 13;
    public int height = 183;

    // Java`da Data Type´lari
    /*
                            Primitive Data Types
     1) int:     Integerín kisalmasi. Integer tam sayi demektir. 32 bit kullanir yada $ byte
                 Matematik´te tam sayilarin basi ve sonu yoktur fakat Java´da tam sayilarin basi ve sonu vardir.
                 En kucuk int = -2,147,483,648
                 En buyuk int =  2,147,483,647

     2) byte:    Tam sayilar icin kullanilir. 8 bit kullanir
                 En kucuk byte = -126
                 En büyük byte =  127

     3) short:   Tam sayilar icin. 16 bit kullanir
                 En kucuk short = 32768
                 En buyuk short = 32767

     4) long:    Tam sayilar icin int yetmedigi yerde kullanilir. 64 bit kullanir
                 En kucuk long: -9,233,372,036,854,755,808
                 En buyuk long:  9,233,372,036,854,755,807

     5) float:   Ondaliki sayilar icindir. 32 bit kullanir.
                 "float" virgülden sonra 7 basamak icerebilir.
                 "float" degerlerinin sonu "f" veya "F" koymaniz gerekir.

     6) double:  Ondalikli sayilar icindir. 64 bit kullanir.
                 "double" virgülden sonra 16 basamak icerir.

     7) boolean: true veya false degerleri icin kullanilir. 1 bit kullanir

     8) char:    Tek karakterler icin kullanilir. 16 bit kullanir.
                 A,c,2,?,_, =
                 Note:"char" lara deger verirken, degeri tek tirnak arasina koyunuz. Yoksa hata verir.

                  Note: Java büyük ve kücük harflere duyarlidir.
                        Java icin True ile true tamamen farlidir.

      Note: Numeric Data Types: byte < short < int < long < float < double
            Numeric olmayan Data Types: boolen - char

                             Non- Priivite Data Types
      String: Isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerler kullanilir.
              String mutlaka cift tirnak arasina konulmalidir.
              String non-primitiv dir. Yani bir String olusturdugunuzda Java size bir sürü method verir.

              Primitiv ile Non- Primitive lerin farki nedir?
     */
    public byte price = 12;
    public short populationOfVillage = 23000;

    public float  priceOfShirt = 19,99F;
    public double weightOfSale =  0,000012045;

    // Siz "long" demenize ragman Java verilen sayiyi "int" kabul eder
    // Bu yüden, long bir vaiableá "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz.
    public long populationOfWorld = 7000000000L;

    // Burada "L" koymadigimiz halde problem yok cünkü "1234" int araligina uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = "Tom Hanks";

    //Note: "main method" arabanin motoru gibidir
    //      "main method" calismadan hic birsey calismaz
    public static void main(String[] args) {

    }


}
}
