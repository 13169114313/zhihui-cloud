package com.zhihui.cloud;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Chen
 * 能实现
 * 要求用户在进入你的应用的任何URL之前都进行验证
 * 启用HTTP Basic和基于表单的验证
 * Spring Security将会自动生成一个登陆页面和登出成功页面
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 *
	 *
	 *
	 * */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//关闭csrf
		http.csrf().disable()
			.authorizeRequests()
			.antMatchers("/actuator/**").permitAll()
			.anyRequest()
			.authenticated().and().httpBasic();
	}
}
