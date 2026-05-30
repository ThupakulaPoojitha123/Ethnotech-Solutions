//method overriding
class ReserveBank{
	String  name;
	int acNumber;
	int balance;
	ReserveBank(String name,int acNumber,int balance){
		this.name=name;
		this.acNumber=acNumber;
		this.balance=balance;
	}
	public void display(){
		System.out.println("Bank :"+this.name);
		System.out.println("Account number :"+acNumber);
		System.out.println("Balance Having :"+balance);
	}
	public void deposite(int amount){
		balance+=amount;
		System.out.println("Deposited amount of "+amount+" rupees");
	}
	public void withdraw(int amount){
		balance-=amount;
		System.out.println("Amount withdrawn is "+amount+" ruppes");
	}
	public void balanceCheck(){
		System.out.println("Balance is "+balance);
	}
}

class IndianBank extends ReserveBank{
	String customerName;
	public IndianBank(String name,int acNumber,int balance){
		super(name,acNumber,balance);
	}
	public void display(String customerName){
		super.display();
		System.out.println("Account Holder Name "+customerName);
	}
	public void deposite(int amount){
		super.deposite(1000);
	}
	public void withdraw(int amount){
		super.withdraw(2000);
	}
	 public void balanceCheck(){
		super.balanceCheck();
	}
}
class StateBank extends ReserveBank{
	String customerName;
	public StateBank(String name,int acNumber,int balance){
		super(name,acNumber,balance);
	}
	public void display(String customerName){
		super.display();
		System.out.println("Account Holder Name "+customerName);
	}
	public void deposite(int amount){
		System.out.println("Maintain 3000 in account");
		super.deposite(3000);
	}
	public void withdraw(int amount){
		super.withdraw(2000);
	}
	 public void balanceCheck(){
		super.balanceCheck();
	}
}
class Bank{
	public static void main(String[] args){
		IndianBank ib=new IndianBank("Indian",123,1000);
		ib.display("Pooji");
		ib.deposite(1000);
		ib.withdraw(1000);
		ib.balanceCheck();
		StateBank sb=new StateBank("State",1234,10000);
		sb.display("Poojitha");
		sb.deposite(1000);
		sb.withdraw(5000);
		sb.balanceCheck();
	}
}
