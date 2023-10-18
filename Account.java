import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private  static double annualInterestRate;
    private Date dateCreated;


//    constructor
    public Account(){
        this.id = 0;
        this.balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }


// constructor with id and balance
    public Account(int id, double balance, double annualInterestRate1) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = annualInterestRate1;
        dateCreated = new Date();
    }


//    accessor/getter
    public int getId() {
        return id;
    }
    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public Date dateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return getBalance() * getMonthlyInterestRate();
    }

    public void withdraw(int amount){
        if (amount > getBalance()){
            System.out.println("Not enough balance");
        }
        this.balance -= amount;

    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public static void main(String[] args) {
        Account Test = new Account(1122, 20000,4.5);
        Test.withdraw(2000);
        Test.deposit(3000);
        System.out.println("Balance is $" + Test.getBalance() +
                " Monthly interest is $" + Test.getMonthlyInterest() +
                " This account was created on " + Test.dateCreated());

    }

}
