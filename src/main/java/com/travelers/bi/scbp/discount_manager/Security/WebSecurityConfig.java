package com.travelers.bi.scbp.discount_manager.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/**");
	}
}
