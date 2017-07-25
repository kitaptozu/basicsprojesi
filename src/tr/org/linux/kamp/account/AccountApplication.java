package tr.org.linux.kamp.account;

public class AccountApplication {

	public static void main(String[] args) {

		Account myAcount = new Account("Ian Curtis", 500);

		Account myAcount2 = new Account("Yavuz Çetin", 300);

		Account myAccount3 = new Account("Jim Morrison");

		myAccount3.deposit(3000);

		System.out.println(myAccount3.getBalance());

		myAcount.setName("Kerim Çaplı");
		
		System.out.println(myAcount.getName());

		System.out.println(myAcount2.getName());
	}

}
