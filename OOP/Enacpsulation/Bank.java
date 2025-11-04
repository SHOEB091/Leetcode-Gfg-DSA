package OOP.Enacpsulation;

public class Bank {
    public static void main(String[] args) {
        
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(210102265); // its mandatory to access the private insance membder
        bankAccount.deposit(-10);// deposit and withdraw can be calculated but cannoted be accessible directly by creatign objects
        bankAccount.withdraw(10);
        bankAccount.deposit(100);
        bankAccount.withdraw(50);
        System.out.println(bankAccount.getBalance());
    }

}
