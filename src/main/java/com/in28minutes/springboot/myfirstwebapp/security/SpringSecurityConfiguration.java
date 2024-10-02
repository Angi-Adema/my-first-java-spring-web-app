package com.in28minutes.springboot.myfirstwebapp.security;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
	// Here we create a number of Spring Beans and return them back. Typically when you want to store usernames and passwords you make use of LDAP or a database. Here we will use an in memory configuration.
	
	// InMemoryUserDetailsManager
	// InMemoryUserDetailsManager(UserDetails... users)
	// Create a UserDeails object and build an in memory UserDetailsManager class and return it back.
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		// This allows us to create new users.
		UserDetails userDetails1 = createNewUser("in28minutes", "dummy");
		UserDetails userDetails2 = createNewUser("angi", "dummydummy");
		
		// Create in memory user details manager.
		return new InMemoryUserDetailsManager(userDetails1, userDetails2);
	}

	// Taking the user's input and encoding it and then configure the userDetails.
	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		
		// This is what we use for authentication during development. Since it is depricated we removed the User.withDefaultPasswordEncoder and replaced it with User.builder().
		UserDetails userDetails = User.builder()
									.passwordEncoder(passwordEncoder)
									.username(username)  // Passed in username rather than the hardcoded in28minutes.
									.password(password)  // Passed in password rather than the hardcoded dummy.
									.roles("USER", "ADMIN")
									.build();
		return userDetails;
	}
	
	// Since above is depricated, we will utilize below:
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// Two things should be configured in SpringSecurity. 1. All URLs are protected and 2. A login form is shown for unauthorized requests. (Provided by SecurityFilterChain must configure the rest noted below.)
	// In order to access the h2 feature, we need to disable the CSRF and h2 makes use of frames as Spring Security does not be default deal with the frames.
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		// First, authorize the requests and we need to define how the authorization will be implemented. (Authenticate all requests.)
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated());
		
		// We also want to show a logging form.
		http.formLogin(withDefaults());
		
		// Disable csrf.
		http.csrf().disable();
		
		// Enable user frames in our application.
		http.headers().frameOptions().disable();
		
		return http.build();
	}
}
