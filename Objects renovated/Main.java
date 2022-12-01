
public class Main{
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.make = "Nissan";
        nissan.color = "White";
        nissan.year = 2020;
        nissan.price = 10000;

        Car dodge = new Car();
        dodge.make = "Dodge";
        dodge.color = "Black";
        dodge.year = 2019;
        dodge.price = 11000;

        System.out.println("This car is of the make "+nissan.make+" and was made in the year "+nissan.year+". Its" + nissan.color + " in color and it costs $"+ nissan.price );
        System.out.println("This car is of the make "+dodge.make+" and was made in the year "+dodge.year+". Its" + dodge.color + " in color and it costs $"+ dodge.price );

                
    }
}
        
    
