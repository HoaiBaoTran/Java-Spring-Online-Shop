package tdtu.edu.com.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEnconder {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = "admin";
		String encodedPassword = encoder.encode(password);
		
		System.out.println(encodedPassword);
	}
}
