import java.sql.Array;
import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] spareParts;

    public Car(String make,double price,int year,String color,String[] spareParts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color=color;
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);
    }

    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.spareParts = Arrays.copyOf(source.spareParts, source.spareParts.length);
    }


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String[] getSpareParts() {  
        return Arrays.copyOf(this.spareParts, this.spareParts.length);
    }

    public void setSpareParts(String[] spareParts) {
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);
    }

    
    public void drive(){
        System.out.println("\nThis car is of the make "+this.getMake()+" and was made in the year "+this.getYear()+". Its " + this.getColor() + " in color and it costs $"+ this.getPrice());
        System.out.println("Please drive to the nearest exit");
    }

    public String toString(){     //Overwritting java's buildin toString with a custom function
        return "Make : "+this.make+"\nYear : " + this.year+"\nColor : "+this.color+"\nPrice : "+this.price+"\nParts : "+Arrays.toString(spareParts);
    }

}
