package day18arraylistspassbyvalue;

public class PessByValue01 {

    /*
      1) Java variable'larin orginal degerlerini korumak ister.
      2) Variable method'lar icinde kullanildiginda, Java method'un icine orginal degeri koymaz, o degerin kopyasini
         uretir ve method'a o kopyayi yollar. Method kopya ustune degisiklik yapar dolayisiyla variable'in orginal deger
         korunmus olur. Bu sisteme "Pass By Value" denir.
         Note: Java "Pass By Value" kullanır.
         Note: Bazı programlama dilleri orijinal değeri koruma altına almamıştır. Bu işi developer'lara bırakmıştır.
               Bu tarz diller "Pass By Reference" kullanır.

     */

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);

        //static method olan "main method" un icindeki hersey static olmalidir
        change(x);
        System.out.println(x);
    }

    public static void change(int a){
        System.out.println(a*3);

    }
    //void disindaki " return" type'larda method body'si icinde "return" keyword kullanilmailidir.
    public static int indirim(int gomlekUcreti){
      return gomlekUcreti -10;


  }
          }


