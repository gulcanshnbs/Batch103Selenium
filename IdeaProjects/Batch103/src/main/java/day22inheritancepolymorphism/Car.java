package day22inheritancepolymorphism;

public class Car {

    public String color;
    int km;
    public Car(){

    }

    public Car(String color, int km){
        this.color = color;
        this.km= km;
        System.out.println("Car Constructor");

    }
}
