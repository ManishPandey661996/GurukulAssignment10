

class BankAccount{
    private String name;
    private long accountNumber;
    private String accountType;
    private double balanceAmount;
    
    public BankAccount(){

    }

    public void setAccountNumber(long l){
        accountNumber = l;
    }
    public void setName(String s){
        name=s;
    }

   public String getName(){
    return name;
   }

    public void setAccountType(String s){
        accountType = s;
    }
    public void setBalanceAmount(double d){
        balanceAmount = d ;
    }

    public void deposit(double amount){
        balanceAmount += amount ;
    }

    public double checkBalance(){
        return balanceAmount;
    }

    public void withdraw(double amount){
        double balance = this.checkBalance();
        balanceAmount = balance - amount;
    }

    public void display(){
        System.out.println(" name : "+ this.getName());
        System.out.println(" balance : "+ this.checkBalance());
    }



}

class BankAccountTest{
    public static void main(String[] args){
       BankAccount b1 = new BankAccount();
       b1.setName("Manish");
       b1.setAccountNumber(123456789l);
       b1.setAccountType("Saving");
       b1.setBalanceAmount(52000.65);
       b1.deposit(2000.35);
       b1.withdraw(1000.65);
       b1.display(); 
    } 
}