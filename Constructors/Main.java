import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan",5000,2020,"red");
        Car dodge = new Car("Dodge",10000,2019,"brown");

        System.out.println("The car is of the make " + nissan.make + " in the year " + nissan.year + " .It is " + nissan.color +" in color , and it costs $"+ nissan.price );
        System.out.println("The car is of the make " + dodge.make + " in the year " + dodge.year + " .It is " + dodge.color +" in color , and it costs $"+ dodge.price );
    }
}
