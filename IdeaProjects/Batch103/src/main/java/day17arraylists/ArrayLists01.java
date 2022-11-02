package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Taksin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names);

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Tacettin");




        names.removeAll(cities);
        System.out.println(names);
        System.out.println(cities);



        List<String> myNames =new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Taksine");
        names.containsAll(myNames);

        boolean sonuc1= names.containsAll(myNames);
        System.out.println(sonuc1);



        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

    }
}
