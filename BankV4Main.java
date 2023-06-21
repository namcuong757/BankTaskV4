package CoreJava5;

public class BankV4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankV4 main = new BankV4();
		BankV4_Personal sub_per = new BankV4_Personal();
		BankV4_Business sub_bus = new BankV4_Business();
		
		main.sayBye(sub_per, sub_bus);
	}

}
