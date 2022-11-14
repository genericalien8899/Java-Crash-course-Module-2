public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

    public Car(String make,double price,int year, String color)
    {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public Car(Car source){                 //copy constructor
        this.make = source.make;
        this.year = source.year;
        this.color = source.color;
        this.price = source.price;
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

}
