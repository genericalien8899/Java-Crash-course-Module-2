import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan",5000,2020,"red");
        Car dodge = new Car("Dodge",10000,2019,"brown");
        Car nissan2 = new Car(nissan);  //copy constructor. public Car(Car source)

        nissan2.setmake("Ford");
        System.out.println("The car is of the make " + nissan.getMake() + " in the year " + nissan.getYear() + " .It is " + nissan.getColor() +" in color , and it costs $"+ nissan.getPrice() );
        System.out.println("The car is of the make " + dodge.getMake() + " in the year " + dodge.getYear() + " .It is " + dodge.getColor() +" in color , and it costs $"+ dodge.getPrice() );
        System.out.println("The car is of the make " + nissan2.getMake() + " in the year " + nissan2.getYear() + " .It is " + nissan2.getColor() +" in color , and it costs $"+ nissan2.getPrice() );

    }
}
