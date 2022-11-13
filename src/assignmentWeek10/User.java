package assignmentWeek10;

import java.util.Scanner;

public class User {
	private String email;
	private String name;
	private String phoneNumber;
	private String password;
	private int count = 1;
	Scanner sc = new Scanner(System.in);

	private void maxAttempts() {
		if (count <= 3) {
			count++;
			if (count > 3) {
				System.out.println("Max attempts reached!");
				System.exit(0);
			}
		}
	}

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

	void logIn() {
		String username;
		String pass;
		do {
			System.out.println("Please enter your username :");
			username = sc.nextLine();
			System.out.println("Please enter your password :");
			pass = sc.nextLine();
			if (username.equals(email) && pass.equals(password)) {
				System.out.println("login succesfull");
			} else {
				System.out.println("User name or password incorrect");
				maxAttempts();
			}

		} while (!(username.equals(email) && pass.equals(password)));
		count = 1;
	}

	private void updatePassword() {
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
				maxAttempts();
			}
		} while (!oldPassword.equals(password));
		count = 1;
	}

	private void updatePhoneNumber() {
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
				maxAttempts();
			}
		} while (!oldPhoneNumber.equals(phoneNumber));
		count = 1;
	}

	private void updateEmail() {
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
				maxAttempts();
			}
		} while (!oldEmail.equals(email));
		count = 1;
	}

	void updateInformation() {
		System.out.println(
				"Do you want to update your personal information. Press Y to change. Press any other alphabet to exit. ");
		String acInfoUpdate = sc.nextLine();
		if (acInfoUpdate.equalsIgnoreCase("Y")) {
			System.out.println(
					"Please enter the information you want to change. \n1. Password\n2. Phone number\n3. Email ");
			int selection = sc.nextInt();
			if (selection == 1) {
				updatePassword();
			} else if (selection == 2) {
				updatePhoneNumber();
			} else if (selection == 3) {
				updateEmail();
			} else {
				System.out.println("Invalid Selection!");
			}
		} else {
			System.out.println("Thank you for using our services!");
			System.exit(0);
		}
	}
}
