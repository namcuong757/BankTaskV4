package CoreJava5;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankV4
{
	public String[] ids;
	public String[] passWords ;
	public long[] balances;
	public int size;
	public String names[];
	public String addresses[];
	public String phone_nums[];	
	
	public BankV4() {
		
	}
	public BankV4(String[] ids, String[] passWords, long[] balances, int size) {
		this.ids = ids;
		this.passWords = passWords;
		this.balances = balances;
		this.size = size;
	}
	public BankV4(String[] ids, String[] passWords, long[] balances, int size, String[] names, String[] addresses, String[] phone_nums)
	{
		this.ids = ids;
		this.passWords = passWords;
		this.balances = balances;
		this.size = size;
		this.names = names;
		this.addresses = addresses;
		this.phone_nums = phone_nums;
	}
	public void intro()
	{
		System.out.println("Online Banking Application");
		System.out.println("====================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello...What is your name?");
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name + "! How are you today?" );
	}
	public void log_in(BankV4_Personal person, BankV4_Business business)
	{
		int cont = -1;
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("What account do you choose?");
			System.out.println("1. Personal Account");
			System.out.println("2. Business Account");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice)
			{
				case 1:
					person.user_check();
					break;
				case 2:
					business.user_check();
			}
			System.out.println("Want to continue? ");
			System.out.println("1. Yes ");
			System.out.println("2. No ");
			System.out.println("Enter your choice: ");
			cont = scanner.nextInt();
			scanner.nextLine();
		}while(cont != 2);
	}
	public void sayBye(BankV4_Personal person, BankV4_Business business)
	{
		log_in(person, business);
		System.out.println("Thank you for using Online Banking");
	}
	
}
