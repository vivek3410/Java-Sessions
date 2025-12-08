package ClassesConcept.Inheritance;

class Vechile {

    String brand = "Tesla";

    public void start(){
        System.out.println("Vechile started...");
    }
}

class Car extends Vechile {

    int wheels = 4;

    public void Engine(){
        System.out.println("Engine Started...");
    }
}

class ElectricCar extends Car {

    boolean isCharged = true;


    public void charge(){
        System.out.println(isCharged ? "charged" : "Not charged");
    }
}




public class Multi_level {
    
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();

        System.out.println(tesla.brand);
        tesla.start();
        tesla.Engine();
        tesla.charge();
    }
}
