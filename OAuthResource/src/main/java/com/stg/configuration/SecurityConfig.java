package com.stg.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@Order(1)
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/**").authorizeRequests().antMatchers("/oauth/authorize**", "/login**", "/error**").permitAll()
				.and().authorizeRequests().anyRequest().authenticated().and().formLogin().permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("humptydumpty").password(passwordEncoder().encode("123456"))
				.roles("USER");

	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}





/*
 * @Autowired private AuthEntryPointJwt unauthorizedHandler;
 * 
 * @Bean public AuthTokenFilter authenticationJwtTokenFilter() { return new
 * AuthTokenFilter(); }
 * 
 * @Bean
 * 
 * @Override public AuthenticationManager authenticationManagerBean() throws
 * Exception { return super.authenticationManagerBean(); }
 */

/*
 * @Bean public SecurityFilterChain configure(HttpSecurity http) throws
 * Exception {
 * http.antMatcher("/**").authorizeRequests().antMatchers("/oauth/authorize**",
 * "/login**", "/error**").permitAll()
 * .and().authorizeRequests().anyRequest().authenticated().and().formLogin().
 * permitAll(); return http.build(); }
 */

/*
 * @Bean public InMemoryUserDetailsManager configure() throws Exception {
 * 
 * UserDetails user =
 * User.withUsername("humptydumpty").password(passwordEncoder().encode("123456")
 * ).roles("USER") .build(); return new InMemoryUserDetailsManager(user);
 * 
 * }
 */
