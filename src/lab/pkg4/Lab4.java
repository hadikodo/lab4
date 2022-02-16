package lab.pkg4;
import java.util.Scanner;
public class Lab4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Client c=new Client(222,"Ahmad","03333333");
       Account a=new Account(1222,1000,1.5,c);
       a.deposit(30);
       a.deposit(40);
       a.deposit(50);
       a.withdraw(5);
       a.withdraw(4);
       a.withdraw(2);
       System.out.println(" Name :"+c.getName()+"\tInterest Rate:  "+a.getAnnualInterestRate()+"\tBalance: "+a.getBalance());
       for(int i=0;i<a.getCounter();i++){
           System.out.println(a.getTransaction(i));
       }
    }
    
}
