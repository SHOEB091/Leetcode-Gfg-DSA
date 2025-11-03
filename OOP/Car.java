package OOP;

public class Car {
    // String color;
    // String brand;
    // String model;
    // int manufYear;
    // int speed;
    private String color;
    private String brand;
    private String model;
    private int manufYear;
    private int speed;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getManufYear() {
        return manufYear;
    }
    public void setManufYear(int manufYear) {
        this.manufYear = manufYear;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void accelerate(int increment){
        speed+= increment;
    }
    public void brake(int decrement){
        speed -= decrement;
    }

    //this is encapsulation as well binding data and methods in same class

    //If all feilds are private then how can we access it we can access it by using getters and setters.
}
