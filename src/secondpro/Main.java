package secondpro;
import java.util.Scanner; 

public class Main {
  public static void main(String args[]) {
	  
	  char repeat;
	  Scanner sc= new Scanner(System.in);
	  //taking input for name
	  System.out.println("enter your name:");
	  String name = sc.nextLine();
	  //taking input for account number 
	  System.out.println("enter your account number:");
	  String acc_no=sc.next();
	  //taking input for balance
	  System.out.println("enter your balance amount:");
	  double bal= sc.nextDouble();
	  
	 Account a1=new Account(name,acc_no,bal);
	 do {
			 System.out.println("Welcome to Deerwalk Bank");
	         System.out.println("*************************");
             System.out.println("1.Balance enquiry\n 2. Deposit\n 3.Withdraw");
             
             System.out.println("Enter your choice(1-3):");
             int ch=sc.nextInt();
             
             switch(ch) {
             case 1: 
            	 System.out.println("Your balance is:"+a1.balanceEnquiry());
            	 break;
            	 
             case 2:
            	 System.out.println("enter the amoutn for deposit");
            	double amt1=sc.nextDouble();
            	a1.deposite(amt1);
            	break;
            	
             case 3:
            	 System.out.println("enter the amount deposit");
            	 double amt2 =sc.nextDouble();
            	 a1.withdraw(amt2);
            	 break;
            	 default:
            		 System.out.println("Invalid Option");	
             }
             
             System.out.println("Do you want to continue: (yes->y/no->n):");
             repeat=sc.next().charAt(0);
  
  }while(repeat=='y');
  System.out.println("thank your for using Application");
  System.out.println("bye bye");
             

}

}