package com.cognizant.springSecurityDemo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EncoderTest {

	@Test
	public void pssworderEncoderTest() {
		PasswordEncoder pe = new BCryptPasswordEncoder();
		String encodedPassword = pe.encode("pass123");
		System.out.println(encodedPassword);
	}
}
