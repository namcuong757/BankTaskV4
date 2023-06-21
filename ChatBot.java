package CoreJava4;

import java.util.Scanner;

public class ChatBot 
{
	public String[] ids;
	public String[] passWords ;
	public long[] balances;
	public int size;
	
	public ChatBot() 
	{
		size = 2;
		ids = new String[] {"user001", "user002"};
		passWords = new String[] {"123456", "1234"};
		balances = new long[]{1725, 5820};
		
	}
	
	public ChatBot(String[] ids, String[] passWords, long[] balances, int size) {
		this.ids = ids;
		this.passWords = passWords;
		this.balances = balances;
		this.size = size;
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
}
