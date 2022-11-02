package day23inheritancepolymorphism;

public class Cat extends Mammal {

    public void meow(){
        System.out.println("Cat meow");
    }

    @Override //@Override annotation'ini kullanarak, Java'nin yaptigimiz Override islemini kontrol etmesni saglariz
    public void eat(){
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b){
        return a+b+1;
    }

    //Asagidaki method "Overriding Method"
    @Override
    public Mammal create(){
        return new Mammal();
    }


    /*
       1) Override yaparken "method'un body" si degistirilir.
       2) Override yaparken ASLA method signatur'a dokunulmaz.
       3) Override yaparken "inheritance" olmak zorundadir.1
       4) Override yaparken "access modifier" lar belli kurallara gore farklilastirilabilirler.
                i) "Private" method'lar override edilemez
               ii) chil Class'daki "override edilen" method'un acess modifier'i Parent class'daki
                   method'un acess modifier'i ile ayni veya genis olmalidir.
                   Note: Child Class daki method'un access modifier'i daha dar olamaz.
              iii) default method'lar ayni package icindeyse override edilebilirler.
                   farkli package'den override edilemezler.
      5) Parent Class'daki method'un "return type"i void ise "retrun type"degistirilimez.
      6) Parent Class'daki method'un "return type"i primitive ise "return type" degistirilmez.
      7) Parent Class'daki method'un "return type" i Wrapper Class ise "return Type" degistirilmez.
      8) Parent Class'daki method'un "return type" i Child Class ise "return type" child'lardan biri olabilir.
          Note: Child Class'daki return type Parent Class'dakiinden genis olamaz.
          Note: Aralarnda "Parent Child" iliskisi olmayan Class'lar Overriding'de Return TYpe degisiminde
                kullanilamazlar. Mesela "Short", "Integer"dan kucuktur, fakat aralarinda "Parent Child" iliskisi
                olmadigindan "Integer" yerine "Short" kullanamazsin.
          Note: Child daki method'un Return Type'indan Parent'taki method'un Return Type'ina gidiste
                "IS-A" Relationship olmali.
          Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
      9) Child<Prent ==> IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
              HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
      10) "final" method'lar Override edilemez, cunku "Overriding"de method body degistirilebilir fakat
          "final" method body degistirilmesine musaade etmez.
      11) Polymorphism = Overloading + Overridingg
           Note: Polymorphism nedir? derlerse Overloading ve Overrinding anlatin.
      12) Overloading ve Overriding arasindaki farklar nelerdir?
             i) Overloading icin "inheritance" gerekmez fakat Overring icin gerekir.
            ii) "private" method'lar Overload edilebilir, Override edilemezler.
           iii) "final" method'lar Overload edilebilir, Override edilemezler.
            iv) "Overloading" "static polymorphism" olarak, "Overriding" "dynamic polymorphism" olarak adlandirilir
                Cunku "static" method'lar Overload edilebilir, Override edilemez.
             v) "Overloading" de method signature degisir ama "Overriding" method signatur a dokunulmaz.

     */

}
