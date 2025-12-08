package ClassesConcept.polymerphsism;

class Person{

    Person(){
        System.out.println("Non Argument constructor");
    }

    Person(int a){
        System.out.println("Parametrsized constructor");
    }

    Person(int a,int b){
        System.out.println(a + b);
    }

    public void behaviour(){
        System.out.println("Decent");
    }

    public void behaviour(String situation){
        System.out.println(situation);
    }

    public void behaviour(String situation1,String situation2){
        System.out.println(situation1 + " " + situation2);
    }
}

public class Overloading {

    public static void main(int a){

    }
    
    public static void main(String[] args) {
        Person std = new Person(3,2);

        std.behaviour();
        std.behaviour("perticular situation");
        std.behaviour("situation1","situation2");
        main(1);
    }
}
