import java.util.Scanner;

public class User {
	private String email;
	private String name;
	private String phoneNumber;
	private String password;
	boolean attempt;
	Scanner sc = new Scanner(System.in);

	User(String email, String name, String phoneNumber, String password) {
		this.email = email;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
		System.out.println("Thank you for registering " + name);
		System.out.println("Use your email as username for login");

	}

	boolean logIn(String username, String pass) {
		if (username.equals(email) && pass.equals(password)) {
			System.out.println("login succesfull");
			attempt=true;
		} else {
			System.out.println("User name or password incorrect");
			attempt = false;
		}
		return attempt;
	}

	boolean updatePassword() {
		System.out.println("Enter your existing password");
		String oldPassword = sc.nextLine();
		if (oldPassword.equals(password)) {
			System.out.println("Enter your new password");
			String newPassword = sc.nextLine();
			password = newPassword;
			System.out.println("Your password has been changed!");
			attempt=true;
		} else {
			System.out.println("Wrong password");
			attempt = false;
		}
		return attempt;
	}

	boolean updatePhoneNumber() {
		System.out.println("Enter your existing phone number");
		String oldPhoneNumber = sc.nextLine();
		if (oldPhoneNumber.equals(phoneNumber)) {
			System.out.println("Enter your new phone number");
			String newPhoneNumber = sc.nextLine();
			phoneNumber = newPhoneNumber;
			System.out.println("Your phone number has been changed!");
			attempt=true;
		} else {
			System.out.println("Wrong phone number");
			attempt = false;
		}
		return attempt;
	}

	boolean updateEmail() {
		System.out.println("Enter your existing email");
		String oldEmail = sc.nextLine();
		if (oldEmail.equals(phoneNumber)) {
			System.out.println("Enter your new email");
			String newEmail = sc.nextLine();
			email = newEmail;
			System.out.println("Your email has been changed!");
			attempt=true;
		} else {
			System.out.println("Wrong email");
			attempt = false;
		}
		return attempt;
	}
}
