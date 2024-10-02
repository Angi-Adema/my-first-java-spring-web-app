package com.in28minutes.springboot.myfirstwebapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	// Here we create a number of Spring Beans and return them back. Typically when you want to store usernames and passwords you make use of LDAP or a database. Here we will use an in memory configuration.
	
	// InMemoryUserDetailsManager
	// InMemoryUserDetailsManager(UserDetails... users)
	// Create a UserDeails object and build an in memory UserDetailsManager class and return it back.
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		// Taking the user's input and encoding it and then configure the userDetails.
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		
		// This is what we use for authentication during development. Since it is depricated we removed the User.withDefaultPasswordEncoder and replaced it with User.builder().
		UserDetails userDetails = User.builder()
									.passwordEncoder(passwordEncoder)
									.username("in28minutes")
									.password("dummy")
									.roles("USER", "ADMIN")
									.build();
		
		// Create in memory user details manager.
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	// Since above is depricated, we will utilize below:
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
