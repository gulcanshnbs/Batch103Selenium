package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {
/*
        //Example 1: Bir String'deki space haric tane character kullanildigini gosteren kodu yaziniz.
        //           "Ali okula gitti." ==> 14

        String str = "Ali okula gitti.";

        //replace() method'u bir String'de herhangi bir karacteri veya karakterleri degistrimek icin kullanilir.
        int num = str.replace(" ", "").length();
        System.out.println(num);

        //Example 2: Bir String'deki tum 'a' harflerini buyuk 'A' ya ceviriniz.


        String s = "Ankara'nin tasina gozlerimin yasina bak";

        String yeniS =s.replace("a", "A");
        System.out.println(yeniS);
        */

        //Example 3: Bir String'deki "kara" kelimesini yerine "*" koyunuz

        String t = "Kara kara dusunme Ankara";

        String yeniT = t.replace("kara", "*");

        System.out.println(yeniT);


        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz.
        //           "AC20217004" ==> AC******
        String stdId = "AC20217004";

       String yeniStdId = stdId.replaceAll("[0-9]", "*");

        System.out.println(yeniStdId);

        /*
            Bir grup data'yi ifade eden kod'lara "Regex" denir
            "Regex" Regular Expressions in kisaltilmis halidir.

            1)Tum rakamlar             ==> [0-9]
            2)Tum kucuk harfler        ==> [a-z]
            3)Tum buyuj harfler        ==> [A-Z]
            4)Tum harfler              ==> [a-zA-Z]
            5)Sesli harfler            ==> [aeiouAEIOU]
            6)Space                    ==> [ ]
            7)Tum harfler ve rakamlar  ==> [0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}

            1) Rakamlar haric tum karakterler      ==> [^0-9]
            2) Kucuk harfler haric tum karakterler ==> [^a-z]
            3) Buyuk harfler haric tum karakterler ==> [^A-Z]
            4) Tum harfler ve karakterler haric    ==> [^a-zA-Z]
            5) Tum Space haric                      ==> [^ ]

            */

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ce space karakteri haric
        //           tum karakterlerin sayisini bulan kodu yaziniz.

        String u = "Ali 13 yasinda, dersem inanma!...";
        int sonuc = u.
                   replaceAll("[0-9]","").
                   replace(" ","").
                   replaceAll("\\p{Punct}", "").
                   length();
        System.out.println(sonuc);


        //Example 6: Bir password'un gecerli olmadigini kurallara gore test eden kodu giriniz.
        //           i) Space haric en az sekiz karakter olmali
        //          ii) En ay bir sembol icermeli
        //         iii) En az bir rakam icermeli
        //          iv) En az bir buyuk harf icermeli
        //           v) En az bir kucuk harf icermeli

        String pwd = "B78c? K!m";
        //i:
        boolean first = pwd.replace(" ", "").length()>7;
        //ii:
        boolean second = pwd.replaceAll("[0-9a-zA-Z]","").length()>0;
        //iii:
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;
        //iv:
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;
        //v:
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if(pwdGecerli) {
            System.out.println("Password'unuz gecerlidir");
        }else{
            System.out.println("Password'unuz gecerli degildir");
        }


        //Example 7: Bir String'deki nokalama isaretleri haric karakter sayisni gosteren kode yaziniz.
        String cumle = "Sen yapmazsan , ben yapmazsam kim yapacak?...";

        int number = cumle.replaceAll("^\\p{Punct}","").length();

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin.

        String v = "Alex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);


    }


}
