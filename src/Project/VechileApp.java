package Project;

class Vechile{
    public void start(){
        System.out.println("Starting the engine...");
    }
}

class Car extends Vechile {
    public void start(){
        super.start();
        System.out.println("Car engine started...");
    }
}

class Bike extends Vechile {

    public void start(){
        System.out.println("Bike engine started...");
    }
}


public class VechileApp {

    public static void main(String[] args) {
        Car carObj = new Car();
        Bike bikeObj = new Bike();
        
        carObj.start();
        bikeObj.start();
    }
}
