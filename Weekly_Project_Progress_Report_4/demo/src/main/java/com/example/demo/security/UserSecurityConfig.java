package com.example.demo.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.controller.UserController;

//@Configuration
//@EnableWebSecurity
//@Order(1)
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UserSecurityConfig extends WebSecurityConfigurerAdapter {
	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserDetailsService userDetailsService;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// auth.authenticationProvider(daoAuthenticationProvider());
		logger.info("<=== USER SECURITY CONFIGURATION ===>" + userDetailsService);
		auth.userDetailsService(userDetailsService).passwordEncoder(encodePwd());
	}

	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().anyRequest().authenticated().and().formLogin().permitAll().and().logout()
				.permitAll();

	}

	@Bean
	public BCryptPasswordEncoder encodePwd() {
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return (PasswordEncoder) NoOpPasswordEncoder.getInstance();
//	}

	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(bCryptPasswordEncoder);
		provider.setUserDetailsService(userDetailsService);

		return provider;
	}
}

/*
 * @Bean public DaoAuthenticationProvider daoAuthenticationProvider(final
 * UserDetailsService userDetailsService, final PasswordEncoder passwordEncoder,
 * final MessageSource messageSource) { final DaoAuthenticationProvider
 * daoAuthenticationProvider = new DaoAuthenticationProvider();
 * daoAuthenticationProvider.setUserDetailsService(userDetailsService);
 * daoAuthenticationProvider.setPasswordEncoder(passwordEncoder);
 * daoAuthenticationProvider.setMessageSource(messageSource); return
 * daoAuthenticationProvider; }
 */

//http.csrf().disable();

// http.authorizeRequests().antMatchers("/").permitAll();
/*
 * http.authorizeRequests().antMatchers("/user").hasAuthority("USER").and().
 * formLogin();
 * 
 * .loginPage("/user/login")
 * .loginProcessingUrl("/user/checkUser").defaultSuccessUrl("/user/dashboard").
 * permitAll().and().logout() .logoutUrl("/user/logout").logoutSuccessUrl("/");
 */