package CoreJava5;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankV4_Personal extends BankV4
{
	public String[] ids;
	public String[] passWords ;
	public long[] balances;
	public int size;
	public String names[];
	public String addresses[];
	public String phone_nums[];
	
	public BankV4_Personal() 
	{
		size = 2;
		ids = new String[] {"user001", "user002"};
		passWords = new String[] {"123456", "1234"};
		balances = new long[]{1725, 5820};
		names = new String[]{"Nam Tran","Random Bot"};
		addresses = new String[] {"123 Hi Street, San Diego, CA, 92111", "125 Nice Street, San Jose, CA, 92151"};
		phone_nums = new String[] {"504-754-1450", "858-222-1111"};
	}
	
	public BankV4_Personal(String[] ids, String[] passWords, long[] balances, int size) {
		this.ids = ids;
		this.passWords = passWords;
		this.balances = balances;
		this.size = size;
	}
	public BankV4_Personal(String[] ids, String[] passWords, long[] balances, int size, String[] names, String[] addresses, String[] phone_nums)
	{
		this.ids = ids;
		this.passWords = passWords;
		this.balances = balances;
		this.size = size;
		this.names = names;
		this.addresses = addresses;
		this.phone_nums = phone_nums;
	}
	
	public void user_check()
	{
		int flag = 0, conti = -1;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n$$$$$$$$$$$$$ Online Banking Personal $$$$$$$$$$$$$\n" );
			System.out.println("Would you like to view your balance?" );
			System.out.println("Enter your userID:" );
			String user = scanner.nextLine();
			System.out.println("Enter your password:" );
			String pass = scanner.nextLine();
			
			System.out.println("----LOGGING IN...");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i = 0; i < size; i++) {
				if(ids[i].equals(user) && passWords[i].equals(pass)) {
					System.out.println("---Successfully Logging In---" );
					
					System.out.println("=====================================");
					System.out.println("#Client Informations#");
					System.out.println("Name: " + names[i]);
					System.out.println("Address: " + addresses[i]);
					System.out.println("Phone Number: " + phone_nums[i]);
					System.out.println("=====================================");
					
					System.out.println("Would you like to view your balance?");
					System.out.println("1. Yes\n2. No");
					System.out.println("Enter your choice");
					int choice = scanner.nextInt();
					
					switch(choice) {
						case 1: 
							System.out.println("Your current balance: $" + balances[i]);
							break;
						case 2:
							break;
						default:
							System.out.println("Invalid answer");
					}
					
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println("====Failed to log in====\n");
			}
			
			System.out.println("Would you like to view another account?\n1. Yes\n2. No");
			System.out.println("Enter your choice");
			conti = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character
		} while(conti != 2);
	}
	public void SayBye()
	{
		user_check();
		System.out.println("Thank you for using Online Banking");
	}
	public void SayBye(String message)
	{
		user_check();
		System.out.println(message);
	}
	
}
