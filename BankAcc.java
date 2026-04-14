import java.util.*;

class BankAccount{
    long AccountNumber;
    double Balance;

    BankAccount(long Accno , double bal ){
        AccountNumber = Accno;
        Balance = bal;
    }
    void deposit(double Amount){
        if(Amount > 0){
            Balance += Amount;
            System.out.println(Balance);
        }
    }
    void withdraw ( double Amount){
        if( Amount > 0 && Amount <= Balance){
            Balance -= Amount;
            System.out.println(Balance);
        }
    }
    void display() {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Current Balance: " + Balance);
    }
}
public class BankAcc {
    public static void main (String [] args){
        BankAccount acc = new BankAccount(687237527, 5000.0);
        acc.display();
        acc.deposit(900);
        acc.withdraw(1900);
        acc.display();

    }
}
