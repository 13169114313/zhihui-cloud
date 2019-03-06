package com.zhihui.cloud.auth.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 认证相关配置
 * @author Chen
 * 能实现
 * 要求用户在进入你的应用的任何URL之前都进行验证
 * 启用HTTP Basic和基于表单的验证
 * Spring Security将会自动生成一个登陆页面和登出成功页面
 */
@Primary
@Order(90)
@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers(
                    "/actuator/**",
                    "/oauth/removeToken",
                    "/oauth/delToken/*",
                    "/oauth/listToken",
                    "/mobile/**").permitAll()
            .anyRequest().authenticated()
            .and().csrf().disable();
    }

    /**
     * 开启密码验证
     * */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
