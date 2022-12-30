
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

        spareParts[0] = "Filter";             // when the array spareParts was changed it would affect the object's spareParts arrays also as they are sharing same reference

        dodge.setColor("Neon");

        nissan.drive();
        dodge.drive();
                
    }
}
        
    
