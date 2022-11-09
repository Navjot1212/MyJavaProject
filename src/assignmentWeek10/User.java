package assignmentWeek10;

import java.util.Scanner;

public class User {
	private String email;
	private String name;
	private String phoneNumber;
	private String password;
	Scanner sc = new Scanner(System.in);

	void signUp() {
		String email;
		do {
			System.out.println("Please enter your email :");
			email = sc.nextLine();
			if (email.contains("@")) {
				this.email = email;
			} else {
				System.out.println("Invalid email!");
			}
		} while (!email.contains("@"));
		String name;
		do {
			System.out.println("Please enter your full name :");
			name = sc.nextLine();
			if (name.length() > 3) {
				this.name = name;
			} else {
				System.out.println("Invalid name!");
			}
		} while (!(name.length() > 3));
		String phoneNumber;
		do {
			System.out.println("Please enter your phone number :");
			phoneNumber = sc.nextLine();
			if (phoneNumber.length() == 10) {
				this.phoneNumber = phoneNumber;
			} else {
				System.out.println("Invalid phone number!");
			}
		} while (!(phoneNumber.length() == 10));
		String password;
		do {
			System.out.println("Please enter your new password :");
			password = sc.nextLine();
			if (password.length() > 6 && password.length() < 12) {
				this.password = password;
			} else {
				System.out.println("Invalid Password!");
			}
		} while (!(password.length() > 6 && password.length() < 12));
		System.out.println("Thank you for registering " + this.name);
		System.out.println("Use your email as username for login");

	}

	boolean logIn() {
		String username;
		String pass;
		boolean validation;
		do {
			System.out.println("Please enter your username :");
			username = sc.nextLine();
			System.out.println("Please enter your password :");
			pass = sc.nextLine();
			if (username.equals(email) && pass.equals(password)) {
				System.out.println("login succesfull");
				validation = true;
			} else {
				System.out.println("User name or password incorrect");
				validation = false;
			}
		} while (!(username.equals(email) && pass.equals(password)));
		return validation;
	}

	void updatePassword() {
		String oldPassword;
		do {
			System.out.println("Enter your existing password");
			oldPassword = sc.nextLine();
			if (oldPassword.equals(password)) {
				System.out.println("Enter your new password");
				String newPassword = sc.nextLine();
				password = newPassword;
				System.out.println("Your password has been changed!");
			} else {
				System.out.println("Wrong password!");
			}
		} while (!oldPassword.equals(password));

	}

	void updatePhoneNumber() {
		String oldPhoneNumber;
		do {
			System.out.println("Enter your existing phone number");
			oldPhoneNumber = sc.nextLine();
			if (oldPhoneNumber.equals(phoneNumber)) {
				System.out.println("Enter your new phone number");
				String newPhoneNumber = sc.nextLine();
				phoneNumber = newPhoneNumber;
				System.out.println("Your phone number has been changed!");
			} else {
				System.out.println("Wrong phone number!");
			}
		} while (!oldPhoneNumber.equals(phoneNumber));
	}

	void updateEmail() {
		String oldEmail;
		do {
			System.out.println("Enter your existing email");
			oldEmail = sc.nextLine();
			if (oldEmail.equals(email)) {
				System.out.println("Enter your new email");
				String newEmail = sc.nextLine();
				email = newEmail;
				System.out.println("Your email has been changed!");
			} else {
				System.out.println("Wrong email address!");
			}
		} while (!oldEmail.equals(email));
	}
}
