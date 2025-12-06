package ClassesConcept;

class Payment {
    int balance = 0;
    String name;
    String branch;
    double accountNo;
    long mobile;
    String status;


    Payment(String name,String branch,long mobile,String status){
        this.name = name;
        this.branch = branch;
        this.mobile = mobile;
        this.status = status;
        this.accountNo = Math.random();
        System.out.println("You have successfully created the account");
    }

    public void getDetails(){

        System.out.println("====== Details ======");
        System.out.println("Customer Name: "+name);
        System.out.println("Branch Name: " + branch);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Status: "+status);
        System.out.println("Account Number: "+accountNo);
        System.out.println("====== Details ======");
    }

    public void getBalance(){
        System.out.println();
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }

    public void deposit(int amount){
        this.balance = this.balance + amount;
        System.out.println("Amount credited successfully");
    }

    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("Insuffecient balance");
        }else{
            this.balance = this.balance - amount;
            System.out.println("Amount debited successfully");
        }
    }
}

public class Banking {
    public static void main(String[] args) {
        Payment customer1 = new Payment("Vivek","Chennai",1234567890,"Single");

        customer1.getDetails();

        customer1.deposit(200);

        customer1.getBalance();

        customer1.withdraw(100);

        customer1.getBalance();

    }

}   
