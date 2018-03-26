package emailApplication;

public class emailApp {

	public static void main(String[] args) {
		email em1 = new email("John", "Smith", 8, "mycompany.com");
		
		em1.changePassword("newpassword");
		/*System.out.println("Your new password is: " + em1.getPassword());*/
		em1.setAlternateEmail("johnsmth@sales.mycompany.com");
		em1.setNewEmail("anaplima@sales.mycompany.com");
		/*System.out.println("Your alternate email is: " + em1.getAlternateEmail());*/
		
		System.out.println(em1.showInfo());
	}

}
