package secondpro;

public class Account {
	
	//instance variable
	String acc_name;
	String acc_num;
	double balance;
	
	//constructor
	  public Account(String acc_name, String acc_num, double balance) {
		  this.acc_name = acc_name;
		  this.acc_num = acc_num;
		  this.balance = balance;
		  
	  }
	  
	  public double balanceEnquiry() {
		  return this.balance;
	  }
	  
	  public void deposite(double amt) {
		  this.balance+=amt;
		System.out.println("deposite successfull:New Balance:"+balanceEnquiry());
	  }
	  
	  public void withdraw(double amt) {
		  if(amt>this.balance) {
			  System.out.println("Sorry! Insufficient amount");
		  }else {
			  this.balance-=amt;
			  System.out.println("Withdraw Successfull: New Balance:" +balanceEnquiry());
		  }
	  }
}
