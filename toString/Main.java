// Whenever you see and arrays see it as a reference to a set of value not as a set of values  !!!!!
// Arrays should not be assigned or printed directly                                           !!!!!
// Arrays should be copied using the copyOf function and printed using the toString function   !!!!!

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] parts = {"keys" , "tires"};
        Car nissan = new Car("Nissan",5000,2020,"red",parts);
        Car dodge = new Car("Dodge",10000,2019,"brown",parts);
        Car nissan2 = new Car(nissan);  //copy constructor. public Car(Car source)

        nissan2.setmake("Ford"); 
        System.out.println("The car is of the make " + nissan.getMake() + " in the year " + nissan.getYear() + " .It is " + nissan.getColor() +" in color , and it costs $"+ nissan.getPrice() );
        System.out.println("The car is of the make " + dodge.getMake() + " in the year " + dodge.getYear() + " .It is " + dodge.getColor() +" in color , and it costs $"+ dodge.getPrice() );
        System.out.println("The car is of the make " + nissan2.getMake() + " in the year " + nissan2.getYear() + " .It is " + nissan2.getColor() +" in color , and it costs $"+ nissan2.getPrice() );
        System.out.println();
        String[] outsideVariable = nissan.getParts();
        System.out.println(Arrays.toString(outsideVariable));
        outsideVariable[1] = "Hello";
        System.out.println(Arrays.toString(outsideVariable));

        System.out.println();
        System.out.println(Arrays.toString(nissan.getParts()) );
        nissan2.setParts(new String[] {"tires","filter"});         // this is how to return string without having to store in a variable      --  new String[] {1,2,3....}
        System.out.println("Copy constructor" + Arrays.toString(nissan2.getParts()));

        System.out.println("Doing object print");
        System.out.println(nissan);
        System.out.println(nissan2);
        System.out.println(dodge);
}
}
