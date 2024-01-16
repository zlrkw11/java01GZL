package Encapsulation;

public class Car {
    
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter method
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }


}
