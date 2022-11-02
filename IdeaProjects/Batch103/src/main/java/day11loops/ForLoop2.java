package day11loops;

public class ForLoop2 {

    public static void main(String[] args) {

        //Bir String'deki "m" karakterleri haric tum karakterleri yazdiriniz.
        //Andromeda ==> Androeda

        String str = "Andromeda";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm') {
                System.out.println(c);

                }
            }
            //2.Yol:
            for (int i = 0; i < str.length(); i++ ) {

                char c = str.charAt(i);

                if (c == 'm') {
                    continue;//Bosverrr! ==> Loop'un icinde bazi degerler icin Loop'un calismamasini isterseniz "continue" kullaniniz

                }
                System.out.println(c);
            }


            //Example 2: 1'den 100 e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz.
        for(int i=1; i<101;i++){
            if(i%6==0){
                continue;
            }
            System.out.println();
        }

        //Example 3: Size verilen bir String'deki 'm' den onceki karakterleri yazdiriniz.
        //           Luxemburg ==> luxe

        String s = "Luxemburg";

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);

            if(c=='m'){
                break;
            }
            System.out.print(c);
        }

        }
    }
