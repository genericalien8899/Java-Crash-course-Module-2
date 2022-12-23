
public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2019, "brown");
        Car dodge = new Car("Dodge",11000,2019,"Neon");

        System.out.println("This car is of the make "+nissan.make+" and was made in the year "+nissan.year+". Its " + nissan.color + " in color and it costs $"+ nissan.price );
        System.out.println("This car is of the make "+dodge.make+" and was made in the year "+dodge.year+". Its " + dodge.color + " in color and it costs $"+ dodge.price );

                
    }
}
        
    
