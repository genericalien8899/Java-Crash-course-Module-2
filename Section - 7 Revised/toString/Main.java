import java.sql.Array;

public class Main{
    public static void main(String[] args) {
        String[] spareParts = new String[] {"Tires","Keys"};
        Car nissan = new Car("Nissan", 10000, 2019, "brown",spareParts);

        Car nissan2 = new Car(nissan);

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        Car dodge = new Car("Dodge",11000,2019,"Jet Black",spareParts);

        spareParts[0] = "Filter";

        dodge.setColor("Neon");

        nissan.drive();
        dodge.drive();
                
        System.out.println(dodge);   // Printing a objects calls toString function the built-in toString function is overwritten by our funtion in Car.java class
        System.out.println(nissan);
    
    }
}
        
    
