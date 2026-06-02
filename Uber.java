import java.util.*;
class Riding{
	public void BookVehical(){
		System.out.println("Welcome to Uber platform !!!");
	}
}
class Auto extends Riding{
	Auto(String name,int km){
		System.out.println("Customer name "+name);
		System.out.println("Km the customer want to travel "+km+" KM");
	}
	public void BookVehical(){
		super.BookVehical();
		System.out.println("The customer Choosen Auto to travel ");
	}
}
class Car extends Riding{
	Car(String name,int km){
		System.out.println("Customer name "+name);
		System.out.println("Km the customer want to travel "+km+" KM");
	}
	public void BookVehical(){
		super.BookVehical();
		System.out.println("The customer Choosen Car to travel ");
	}
}
class Bike extends Riding{
	Bike(String name,int km){
		System.out.println("Customer name "+name);
		System.out.println("Km the customer want to travel "+km+" KM");
	}
	public void BookVehical(){
		super.BookVehical();
		System.out.println("The customer Choosen Bike to travel ");
	}
}
class Uber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the price of the Auto per km : ");
		int autoprice=sc.nextInt();
		System.out.print("Enter the price of the car per km : ");
		int carprice=sc.nextInt();
		System.out.print("Enter the price of the Bike per km : ");
		int bikeprice=sc.nextInt();
		if(autoprice<=carprice && autoprice<=bikeprice){
			Auto at=new Auto("Pooji",10);
			at.BookVehical();
			System.out.println("The total cost is "+10*autoprice);
		}
		else if(carprice<=autoprice && carprice<=bikeprice){
			Car cr=new Car("Reddy",10);
			cr.BookVehical();
			System.out.println("The total cost is "+10*carprice);
		}
		else{
			Bike bk=new Bike("Reddy",10);
			bk.BookVehical();
			System.out.println("The total cost is "+10*bikeprice);
		}
		
	}
}