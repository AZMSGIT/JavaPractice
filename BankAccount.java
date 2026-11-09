class BankAccount {
    private String owner;
    private double balance = 0;
    public BankAccount(String owner){
        this.owner = owner;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Done succsefully");
        }else{
            System.out.println("Must be greater than 0");
        }
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Not enough money on balance");
        }else{
            balance -= amount;
            System.out.println("Done succsefully");
        }
    }
    public double getBalance(){
        return balance;
    }
}
