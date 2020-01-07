public class Account {
    private float balance;

    public void setBalance(float balance){
	if(balance>0)
	  this.balance = balance;
    }

    public float getBalance(){
	return balance;
    }

    public void deposite(float newAmount{
	//this.balance = this.balance + newAmount;
	if(newAmount>0)
	balance += newAmount;//augment sign
    }

    public void withdraw(float newAmount{
	if(newAmount>0)
	balance -= newAmount;
    }

}

//another class create and use Encapsulated above class where user getter and setter
public class Main {

    public static void main(String[] args){
	Account account = new Account();
	account.deposite(200);
	account.withdraw(100);
	System.out.println("Account balance: " + account.getBalance();
    }
}
