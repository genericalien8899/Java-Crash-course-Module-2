public class Main{
    public static void main(String[] args){
        
        Car nissan = new Car();
        
        nissan.make = "Nissan";
        nissan.price = 5000;
        nissan.year = 2020;
        nissan.color = "grey";

        Car dodge = new Car();

        dodge.make = "Dodge";
        dodge.price = 10000;
        dodge.year = 2019;
        dodge.color = "Brown";

        System.out.println(nissan.make);
        System.out.println(nissan.year);
        System.out.println(nissan.color);
        System.out.println(nissan.price);
        System.out.println();
        System.out.println(dodge.make);
        System.out.println(dodge.year);
        System.out.println(dodge.color);
        System.out.println(dodge.price);

        System.out.println("The car is of the make " + nissan.make + " in the year " + nissan.year + " .It is " + nissan.color +" in color , and it costs $"+ nissan.price );
        System.out.println("The car is of the make " + dodge.make + " in the year " + dodge.year + " .It is " + dodge.color +" in color , and it costs $"+ dodge.price );

    }
}
