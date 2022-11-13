import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan",5000,2020,"red");
        Car dodge = new Car("Dodge",10000,2019,"brown");
        Car ford = new Car("Ford",15000,2018,"white");

        ford.setPrice(ford.getPrice()/2);
        ford.setColor("Pearl_White");
        System.out.println("The car is of the make " + nissan.getMake() + " in the year " + nissan.getYear() + " .It is " + nissan.getColor() +" in color , and it costs $"+ nissan.getPrice() );
        System.out.println("The car is of the make " + dodge.getMake() + " in the year " + dodge.getYear() + " .It is " + dodge.getColor() +" in color , and it costs $"+ dodge.getPrice() );
        System.out.println("The car is of the make " + ford.getMake() + " in the year " + ford.getYear() + " .It is " + ford.getColor() +" in color , and it costs $"+ ford.getPrice() );

    }
}
