package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email email = new Email("FatmaGul", "Bakir");

		email.setAlternateEmail("a.b@development.xx.com");

		email.changePassword("XYZASDF12*");

		email.setMailboxcapacity(1000);

		System.out.println(email.displayInfo());
	}

}
