package day21accesmodifiersinheritance;

public class AnimalRunner {

    /*
        1) "Inheritance" sayesinde
              i) Code tekrarlarindan kurtuluruz
             ii) Code tamiri (maintenance) kolay olur
            iii) Child Class'lari daha atomic yapmis oluruz
         2) Bir Class'i baska bir Class'in Child Class'i yapmak icin "extends" keyword kullanilir. Ilk yazilan
            Class Child, ikinci yazilan Class parent olir
         3) Child Class Object'leri Parent Class'dan method ve variable'lari kullanabilirler.
         4) Parent Class object'leri Child Class'dan methodv e variable'ları kullanamazlar
         5) Object Class her Class'ın Parent'ıdır.
            Java'da Object Class hariç her class'ın parent'ı vardır
            Java'da parent'ı olmayan tek class Object Class'dır.
         6) "private"  method ve variable'lar child class'lar tarafindan kullanilamaz
            "protected"  method ve variable'lar child class'lar tarafindan kullanilabilir.
            "default"  method ve variable'lar ayni package'teki child class'lar tarafindan kullanilabilir.
            "public"  method ve variable'lar child class'lar tarafindan kullanilabilir.
            Note: child class'lar tarafinda kullanilabilir olmak inherit edilebilir demektir.
         7) Dort tip inheritance vardir
              i) Multilevel Inheritance:   Java bunu kabul eder
             ii) Hierarchical Inheritance: Bir parent icin coklu child; Java bunu kabul eder.
            iii) Multiple Inheritance:     Bir Child'a coklu parent, Java bunu desteklemez- ( JAva doas not support Multiple Inheritance)
             iv) Singel Inheritance:       Bir Child Class icin bir Parent Class demektir, Java bunu destekler
     */

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();

    }
}
