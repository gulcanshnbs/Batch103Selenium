package day22inheritancepolymorphism;

public class Runner {

    public static void main(String[] args) {

        //Inheritance'da variable'lar secilirken Java Object'in data type'ina bakar
        //Oncelikli istediginiz variable'i Object'in data type'i olan Class'da arar.
        //O Class'da bulunamazsa Parent Class'lara bakar.
        //Hic bir Parent Class'da bulamazsa hata verir.


        Cat cat1 = new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);


        Mammal cat2 = new Cat();
        System.out.println(cat2.a);

        Animal cat3 = new Cat();
        System.out.println(cat3.a);

        //Object olustururken Object'in data type'i Child Class'lardab secilmez

        //Inheritance'da variable'lar secilirken Java Constructar'a bakar
        //Oncelikle istediginiz method'u Constructori kullanilan Class'dan alir
        //O  Class'da bulamazsa Parent Class'lara bakar.
        //Hicbir yerde o method'u bulamazsa hata verir

        Cat cat4 = new Cat();
        cat4.eat();//Cat eat
        cat4.drink();

        Mammal cat5 = new Mammal();
        cat5.eat();// Mammal eat

        Animal catt6 = new Animal();
        catt6.eat();//Animal eat








    }
}
