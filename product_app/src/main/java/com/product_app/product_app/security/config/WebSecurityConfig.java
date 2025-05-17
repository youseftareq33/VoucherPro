package com.product_app.product_app.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
    
    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @SuppressWarnings("removal")
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.httpBasic();

        http.authorizeHttpRequests().requestMatchers(HttpMethod.GET, "/voucherapi/getVoucher/**")
        .hasAnyRole("Role_User","Role_Admin")
        .requestMatchers(HttpMethod.POST, "/voucherapi/createVoucher")
        .hasRole("Admin").and().csrf().disable();

        return null;
    }
}
