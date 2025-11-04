package OOP.Enacpsulation;

public class BankAccount {

    private long accountNumber; // variable declared in class is a INSTANCE variable of that class
    private double balance;

    
    public void deposit(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }else{
            System.out.println("Invalid Deposi Amount");
        }
    }
    
    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew "+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
