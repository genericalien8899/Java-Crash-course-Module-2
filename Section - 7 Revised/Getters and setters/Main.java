
public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2019, "brown");
        Car dodge = new Car("Dodge",11000,2019,"Neon");

        nissan.setColor("Neon");
        dodge.setColor("Jet Black");

        nissan.setPrice(nissan.getPrice()/2);
        dodge.setPrice(dodge.getPrice()/2);

        System.out.println("This car is of the make "+nissan.getMake()+" and was made in the year "+nissan.getYear()+". Its " + nissan.getColor() + " in color and it costs $"+ nissan.getPrice() );
        System.out.println("This car is of the make "+dodge.getMake()+" and was made in the year "+dodge.getYear()+". Its " + dodge.getColor() + " in color and it costs $"+ dodge.getPrice() );

                
    }
}
        
    
