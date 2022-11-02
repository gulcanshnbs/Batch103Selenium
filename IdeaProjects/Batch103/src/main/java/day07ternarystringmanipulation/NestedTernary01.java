package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Verilen yilin " Leap Year"(Artik yil) olup olmadigini kontrol eden kodu yaziniz.
        i) Yil 100 e bolunurse 400e de bolunmelidir. ==> 1600+   1800-
        ii) Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ 2001-
         */

        int year = 2001;

       String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Lear year degildir") : (year%4==0 ? "Leap year" : "Leap year degildir");

        System.out.println(leap);

        /*
        Asagidaki kurallara gore passwordùn gecerli olup olmadigini kontrol eden kodu yaziniz.
        i) sekiz karakterden fazla karakter varsa ilk harfi 'i' olmalidir.
        ii) Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir
         */

        String pwd = "K2a3";

        char ilkHarf =pwd.charAt(0);

        String gecerli = pwd.length()<8 ? (pwd.charAt(0)== 'K' ? "Gecerli" : "Gecersiz") : (ilkHarf=='i' ? "Gecerli" : "Gecersiz");



    }
}
