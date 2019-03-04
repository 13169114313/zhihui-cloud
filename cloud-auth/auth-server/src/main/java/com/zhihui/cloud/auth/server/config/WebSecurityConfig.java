package com.zhihui.cloud.auth.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Chen
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {

        return super.authenticationManagerBean();

    }

    /**
     * //允许访问项目主路径/swagger-ui.html的请求
     * //actuator/** 请求都要经过拦截验证
     * //同时也允许注销请求
     * //支持表单验证登录
     * //取消掉默认的csrf认证
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/swagger-ui.html").permitAll()
//                .anyRequest().authenticated()  //任意请求都要通过认证
                .antMatchers("/actuator/**")
                .hasAnyRole("USER")
//                .hasAuthority("USER")  //指定 请求需要验证
                .and()
                .logout().permitAll()
                .and()
                .formLogin();
        http.csrf().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
}
