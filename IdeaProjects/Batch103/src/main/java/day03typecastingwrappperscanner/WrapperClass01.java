package day03typecastingwrappperscanner;

public class WrapperClass01 {

    public static void main(String[] args){

        /*
            Java primitive'lere method'lar ekleyerek yeni bir yapi olusturdu, yapiya "Wrapper Class" denir.

            Primitive             Wrapper
              byte            ==> Byte
              short           ==> Short
              ** int          ==> Integer
              long            ==> Long
              float           ==> Float
              double          ==> Double
              boolean         ==> Boolean
              ** char         ==> Character
         */

        byte primitiveByte = 12;//primitiveByte yazip nokta koydugunuz da hic method göremeysiniz, cünkü primitiv'ler method icermez sadece degericerir

        Byte wrapperByte   = 12;//wrapperByte yazip nokta koydugnuyda bir cok method görürsünüz, cunku "wrapper" lar method icerir.

        //Example 1: byte data type'inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.
        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE); // 127

        //Example 2: short, int, long data typl'larinin en buyuk ve en kucuk degerlrini ekrana yazin.
        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);// 2144783647

        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        System.out.println(Long.MAX_VALUE);//9223372036854775807


        //"primitive"ler nasil "wrapper"lara cevrilir(Autoboxing)
        float f1 = 13.99F;

        Float wrapperF1 = f1;

        //"wrappel" lar nasil "primitive"lere cevrilir (Unboxing)
        Character w1 = 's';
        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing Java tarafindan otomatik olarak yapilir.

    }


}
