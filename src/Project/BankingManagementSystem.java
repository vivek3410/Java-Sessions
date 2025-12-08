package Project;

class Bank {
    private double accountNo = 230000;
    private String holderName;
    private double balance;
    private static int accountsCount = 0;

    Bank(String holderName,double balance){
        this.accountNo = accountNo++;
        this.holderName = holderName;
        this.balance = balance;
        Bank.accountsCount++;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getHolderName(){
        return this.holderName;
    }

    public double getAccountsCount(){
        return Bank.accountsCount;
    }

    public double getAccountNumber(){
        return this.accountNo;
    }

    public void deposit(double amount){
        // this.balance = this.balance + balance;
        this.balance += amount;
        System.out.println("Credited");
    }

    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("Insuffecent Balance");
        }else{
            this.balance -= amount;
            System.out.println("Debited");
        }
    }

}

public class BankingManagementSystem {
    
    public static void main(String[] args) {
        Bank holder1 = new Bank("Vivek", 5000);

        double accountNUmber1 = holder1.getAccountNumber();
        System.out.println("Account Number: " + accountNUmber1);

        double balance1 = holder1.getBalance();
        System.out.println("Balance: "+ balance1);

        holder1.deposit(1000);

        balance1 = holder1.getBalance();
        System.out.println("Current Balance: "+ balance1);

        holder1.withdraw(7000);
        balance1 = holder1.getBalance();
        System.out.println("Current Balance: "+ balance1);
    
    }
}
