package ClassesConcept.polymerphsism;

class Parent {
    Parent(){
        System.out.println("Construct from parent");
    }

    Parent(int x){
        System.out.println("Constructor from parent with paramentrs");
    }

    public void show(){
        System.out.println("Show parent");
    }
}

class Child extends Parent {

    Child(){
        super(10);
        System.out.println("Construct from child");
    }

    public void show(){
        super.show();
        System.out.println("Show Child");
    }

}

public class Overriding {

    public static void main(String[] args) {
        Parent c = new Child();
        c.show();
    }
}
