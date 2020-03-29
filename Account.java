package bankapp;

public class Account {
    private String accountNumber;
    private String accoutHolder;
    private String openDate;
    private double blance;
    
    public Account(String accNumber, String accHolder, String date, double accBlance){
        this.accountNumber = accNumber;
        this.accoutHolder = accHolder;
        this.openDate = date;
        this.blance = accBlance;
    }   
    public void withdraw(double amount){
       this.blance = this.blance - amount;
    }
    public void deposit(double amount){
        this.blance = this.blance + amount;
    }
    public void transfar(Account a, double amount){
        this.withdraw(amount);
        a.deposit(amount);
    }
    public String getAccountHolder(){
        return this.accoutHolder;
    }
    public String getOpenDate(){
        return this.openDate;
    }
    public double getBlance(){
        return this.blance;
    }
    @Override
    public String toString(){
        return this.accountNumber;
    }
}
