package OOP.InnerClass;

//Types of Inner Classes:
// 1. Member Innner Class
// 2. Static Nested Class
// 3. Local Inner Class
// 4. Anonymous Inner Class


//Member Inner Class Example
public class Car{
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model=model;
        this.isEngineOn=false;
    }

    // Member Inner Class
    public class Engine{
        public void startEngine(){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println("Engine started for car model: " + model);
            } else {
                System.out.println("Engine is already running for car model: " + model);
            }
        }

        void stopEngine(){
            if(isEngineOn){
                isEngineOn=false;
                System.out.println("Engine stopped for car model: " + model);
            } else {
                System.out.println("Engine is already stopped for car model: " + model);
            }
        }
    }

}



