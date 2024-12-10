package me.dio.domain.secutiry;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class WebSecutiryConfig {





    SecurityFilterChain filterChain(HttpSecurity http){
        http.csrf(d -> d.disable()
                .authenticationProvider()

        );
    }



}
