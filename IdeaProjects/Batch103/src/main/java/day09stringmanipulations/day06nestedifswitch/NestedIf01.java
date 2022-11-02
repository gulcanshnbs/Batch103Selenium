package day09stringmanipulations.day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /* Password'un ilk harfi buyuk ise
            'A' olursa gecerli password aksi halde gecersiz password
           Pasword'un ilk harfi kucuk ise
           'z' olursa gecerli password aksi halde gecersiz password

           Note: Java "netsed" kodlari calistirinca cok vakit harcar, buna "Time Comlexity" denir.
                 Bu yuzden mumkunse "nested"  kod yazmamaya calisiriz.
        */

        String pwd = "5xy12!";

        char ilkHarf = pwd.charAt(0);


        if(ilkHarf>='A' && ilkHarf<'Z'){

            if(ilkHarf=='A') {
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }
        }else if  (ilkHarf>= 'a' &&  ilkHarf<='z') {

            if (ilkHarf== 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }

        }else{
            System.out.println("ilk karakter harf olmalifir...");

        }

    }
}
