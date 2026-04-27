public class bankaccount {
    public String owner;
    public double balance;

    public double deposit(double amount) {
       balance+=amount;
       return balance;
    }


    public double withdraw(double amount){
        if(balance>amount){
             balance-=amount;
        }
        else {
            System.out.println("no");
        }

        return balance;
    }
    public String toString(){
        return "bank= " + balance;
    }

}
