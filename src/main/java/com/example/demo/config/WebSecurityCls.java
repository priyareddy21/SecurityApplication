package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity(debug=true)
public class WebSecurityCls {

	@Bean
	public InMemoryUserDetailsManager userDetails(PasswordEncoder passwordEncoder) {
		
		UserDetails user1=
				User
				.withUsername("priya")
				.password(passwordEncoder.encode("pass"))
				.roles("user")
				.build();
		UserDetails user2=
				User
				.withUsername("nikil")
				.password(passwordEncoder.encode("nikpass"))
				.roles("admin","user")
				.build();
		return new InMemoryUserDetailsManager(user1,user2);
		
		//three types of default storage provided by spring: InMmeory(erases data of werver is re running, JDBC(database), LDAP(remote server))
		
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
}
