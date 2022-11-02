package day03typecastingwrappperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
    //                byte < short < int <long < float < double

    // Note: kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
    // Note: buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        //Example 1: short'u double ceviren kodu yaziniz.
        short numOfStudents = 235;
        double newOfStudents = numOfStudents;

        //Example 2:floati byte yapan kodu yaziniz.
        float price = 12.99F;
        byte newPrice =  (byte) price;

        System.out.println(newPrice);//==> Java ondalik sayiyi, tam sayiya cevirirken yuvarlama islemi yapmaz.
                                     //    Java ondalik sayiyi, tam sayiya cevirirken ondalik kismini siler.

        int number = 515;

        byte newNumber = (byte)number;

        System.out.println(newNumber);//3 ==> Java 515'i 256(byte daki sayilarin sayisi) 'ya boldu kalani return etti.

        int num = 510;
        byte newNum = (byte)num;

        System.out.println(newNum);
    }
}



























