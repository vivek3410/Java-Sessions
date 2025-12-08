package ClassesConcept.Inheritance;



class Abc{
    Abc(){
        System.out.println("his is a constructor from AbcT class");
    }
               
    public void  method1(){
        System.out.println("This is a method 1 from Abc Class");
    }
}

class Child extends Abc {

    Child(){
        System.out.println("This is a constructor from child class");
    }

    public void ChildMethod1(){
        System.out.println("This is a method 1 from child class");
    }

}




public class AbcExample {
    public static void main(String[] args) {
        Child obj1 = new Child();
        
        obj1.method1();

        obj1.ChildMethod1();
    }
}
