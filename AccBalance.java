import java.util.*;
class AccBalance{
	private int pin;
	private int balance;
	public void setPin(int pin){
		this.pin=pin;
	}
	public void setBalance(int balance){
		this.balance=balance;
	}
	public int getBalance(){
		return balance;
	}
	int getPin(){
		return pin;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		AccBalance acbalance=new AccBalance();
		acbalance.setPin(12345);
		acbalance.setBalance(5000);
		System.out.println("Insert our card");
		System.out.println("Enter your option");
		String input=sc.nextLine();
		int secpin=sc.nextInt();
		int pingetting=acbalance.getPin();
		if(secpin==pingetting){
			System.out.println("Blance is "+acbalance.getBalance());
		}
		else{
			System.out.println("Security pin is incorrect");
		}
	}
}