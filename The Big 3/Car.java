import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make,double price,int year, String color, String[] parts)
    {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source){                 //copy constructor
        this.make = source.make;
        this.year = source.year;
        this.color = source.color;
        this.price = source.price;
        this.parts = Arrays.copyOf(source.parts,source.parts.length);
    }

    public void drive(){
        System.out.println("You bought the beautiful "+this.year+" "+this.color+" "+this.make+ " for $"+this.price + ". Please drive to the nearest exit");
    }

    public String getMake(){
        return this.make;
    }
    
    public double getPrice(){
        return this.price;
    }

    public int getYear(){
        return this.year;
    }

    public String getColor(){
        return this.color;
    }

    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setmake(String make){
        this.make = make;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }

}
