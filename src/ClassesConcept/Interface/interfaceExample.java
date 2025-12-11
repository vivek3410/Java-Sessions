package ClassesConcept.Interface;

interface Bank{
    // Allows Static constant variable
    static int name = 100;
    // Allows abstract methods
    void display();
}

interface Display{
    void print();
}



class SBIBank implements Bank,Display{

    // SBIBank(){
    //     super();
    // }

    public void display(){
        System.out.println("Display");
    }

    public void print(){
        System.out.println("Print coming from Display interface");
    }
}

public class interfaceExample {
    public static void main(String[] args) {
        SBIBank sbi = new SBIBank();
        sbi.display();
    }
}
