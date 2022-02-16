package lab.pkg4;
import java.util.Date;
public class Account {
    Date date = new Date();
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client client;
    private Transaction transactions[];
    private int counter=0;
    public Account(){
    }
    public Account(int ID,double b,double AIR){
        this.id=ID;
        this.balance=b;
        this.annualInterestRate=AIR;
        this.dateCreated=new Date();
        
    }
    public Account(int ID,double b,double AIR,Client cl){
        this.id=ID;
        this.balance=b;
        this.annualInterestRate=AIR;
        this.client=cl;
        this.transactions=new Transaction[100];
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId(int i){
        id=i;
    }
    public void setBalance(double b){
        balance=b;
    }
    public void setAnnualInterestRate(double AIR){
        annualInterestRate=AIR;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestAmount(){
        return (annualInterestRate/100)*balance;
    }
    public boolean withdraw(double amount){
        if(amount <=this.balance){
            this.balance=balance-amount;
            this.transactions[counter++]=new Transaction('W',amount,this.balance,"you withdraw "+amount+" from your account and your balance is "+this.balance+" .");
            return true;
        }
        else{
            return false;
        }
    }
    public void deposit(double amount){
        balance=balance+amount;
        this.transactions[counter++]=new Transaction('D',amount,this.balance,"you deposit "+amount+" to your account and your balance is "+this.balance+" .");
    }
    public String getTransaction(int index){
        return this.transactions[index].getDescription();
    }
    public int getCounter(){
        return this.counter;
    }
    @Override
    public String toString(){
        return "Account : \tId: "+this.id+" \tBalance: "+this.balance+" \tAIR:"+this.annualInterestRate;
    }
            }
