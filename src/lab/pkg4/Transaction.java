
package lab.pkg4;
import java.util.Date;
public class Transaction {
   private Date date = new Date();
   private char type;
   private double amount;
   private double balance;
   private String description;

   public Transaction(char t,double a,double b,String d){
       this.type=t;
       this.balance=b;
       this.description=d;
       this.amount=a;
   }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
