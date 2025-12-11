package ClassesConcept.Abstract;

abstract class Bank {

    private String bankName;

    Bank(String bankName){
        this.bankName = bankName;
    }

    abstract void bankPolicy();

    void deposit(int amount){
        // deposit logic
    }

    void withdraw(int amount){
        // withdraw logic
    }
}

class SBIBank extends Bank{
    SBIBank(String name){
        super(name);
    }

    void bankPolicy(){
        System.out.println("This is a SBI policy");
    }
}

class IDFCBank extends Bank{

    IDFCBank(String name){
        super(name);
    }
    void bankPolicy(){
        System.out.println("Policy for IDFC");
    }
}


public class BankSystem{

    public static void main(String[] args) {
        
    }
}