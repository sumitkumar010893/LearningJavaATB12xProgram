package oopsConcept_Challenges;

public class BankAccount {
//    Create a BankAccount class with private balance field. Implement deposit(), withdraw(), and getBalance() methods with proper validation.
//    i/p - Initial balance: 1000, deposit: 500, withdraw: 200
//    o/p - Balance after deposit: 1500.0 Balance after withdrawal: 1300.0
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }
     public void deposit(double amount, boolean isCashier){
        if(isCashier){
            balance += amount;
            System.out.println("Balance after deposit: "+ balance);
        }else {
            System.out.println("Not allowed to deposit the amount");
        }
     }

     public void withdraw(double amount, boolean isCashier){
        if (isCashier){
            if(balance> 0){
                balance -= amount;
                System.out.println("Balance after withdrawal: "+balance);
            } else if(amount > balance) {
                System.out.println("Insufficient balance.");
            }
        }
     }

     public double getBalance(){
        return balance;
     }

}

class Account{
    public static void main(String[] args) {
        BankAccount sumit = new BankAccount(1000);
        sumit.deposit(500, true);
        sumit.withdraw(200, true);
    }
}
