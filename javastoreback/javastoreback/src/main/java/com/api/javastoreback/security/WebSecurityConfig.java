package com.api.javastoreback.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
@EnableWebSecurity
@CrossOrigin(origins = "http://localhost:4200")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests()
			.antMatchers("/home").permitAll()
			.antMatchers("/hometeste").permitAll()
			.antMatchers("/createaccount").permitAll() 
			.antMatchers(HttpMethod.POST, "/login").permitAll()
			.antMatchers(HttpMethod.GET, "/loginvalid/**/**").permitAll() 
			.anyRequest().authenticated()
			.and()
			
			// filters login requests
			//.addFilterBefore(new JWTLoginFilter("/login", authenticationManager()), UsernamePasswordAuthenticationFilter.class)
			
			// filters other requests to check the presence of the JWT in the header
			.addFilterBefore(new JWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
		    .httpBasic()
		    .and().headers().frameOptions().disable()
		    .and().cors()
		    .and().csrf().disable()
		    .headers() 
		    // the headers you want here. This solved all my CORS problems! 
		    .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Origin", "*"))
		    .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Methods", "POST, GET"))
		    .addHeaderWriter(new StaticHeadersWriter("Access-Control-Max-Age", "3600"))
		    .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Credentials", "true"))
		    .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Headers", "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization"));
			;
	}
	  
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// create a default account
		auth.inMemoryAuthentication()
			.withUser("admin")
			.password("{noop}123")
			.roles("ADMIN");
	}
}
