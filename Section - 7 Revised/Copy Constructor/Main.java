
public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2019, "brown");

        Car nissan2 = new Car(nissan);  // Copy constructor

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        Car dodge = new Car("Dodge",11000,2019,"Jet Black");

        dodge.setColor("Neon");

        System.out.println("This car is of the make "+nissan.getMake()+" and was made in the year "+nissan.getYear()+". Its " + nissan.getColor() + " in color and it costs $"+ nissan.getPrice() );
        System.out.println("This car is of the make "+dodge.getMake()+" and was made in the year "+dodge.getYear()+". Its " + dodge.getColor() + " in color and it costs $"+ dodge.getPrice() );

                
    }
}
        
    
