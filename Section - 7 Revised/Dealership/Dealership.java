//import java.util.Arrays;

public class Dealership {
    
    private Car[] cars;

    public Dealership (Car[] cars){
        this.cars = new Car[cars.length];          // new Car[cars] wont work as the copy constructor will accept only of Car type but we would be passing an Array of Car by giving Car[cars]
        for (int i = 0; i < this.cars.length; i++){
            this.cars[i] = new Car(cars[i]);    //copy constructor of Car class
        }
    }

    public void sell(int index){
        this.cars[index].drive();   //drive action from Car class
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
}
