package lab.pkg4;
public class Client {
    private int id;
    private String name;
    private String phone;
    private Account[] accounts;
    private int counter=0;
    public  Client(int id ,String name, String phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.accounts=new Account[3];
    }
      public  Client(int id ,String name, String phone,int n){
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.accounts=new Account[n];
    }
       public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    
    public int getAccountId(int index){
        return accounts[index].getId();
    }
    public double getAccountBalance(int index){
        return accounts[index].getBalance();
    }
    public boolean getAccountWithdraw(int index,double amount){
        return accounts[index].withdraw(amount);
    }
    public void AccountDesposit(int index,double amount){
         accounts[index].deposit(amount);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public boolean addAccount(Account c){
        if(counter==this.accounts.length){
            return false;
        }
        else{
            accounts[counter]=c;
            counter++;
            return true;
        }
    }  
   public boolean closeAccount(int accountId){
       if(counter==0)
           return false;
       else
       {
           int index=-1;
           for(int i=0;i<this.accounts.length;i++){
               if(accounts[i].getId()==accountId){
                   index=i;
                   break;
               }
           }
           if(index==-1)
               return false;
           for(int i=index;i<this.accounts.length;i++){
               if(index==accounts.length-1){
                   this.accounts[i]=null;
                   counter=i;
               }
               else{
                   this.accounts[i]=this.accounts[i+1];
                   counter--;
               }
           }
           return true;
       }
   }
    @Override
   public String toString(){
       return "Client : \tId: "+this.id+" \tName: "+this.name+" \tPhone:"+this.phone;
   }
   public String getAccountToString(int index){
       return accounts[index].toString();
   }
}
