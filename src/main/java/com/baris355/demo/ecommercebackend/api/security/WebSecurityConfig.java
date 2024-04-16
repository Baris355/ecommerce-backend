package com.baris355.demo.ecommercebackend.api.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.AuthorizationFilter;

@Configuration
public class WebSecurityConfig {

    private JWTRequestFilter jwtRequestFilter;

    public WebSecurityConfig(JWTRequestFilter jwtRequestFilter) {
        this.jwtRequestFilter = jwtRequestFilter;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .csrf((csrf) -> csrf.disable()).cors((cors) -> cors.disable());

        http.addFilterBefore(jwtRequestFilter, AuthorizationFilter.class);

        http
                .authorizeHttpRequests((authorizeHtppRequests) -> authorizeHtppRequests
                        .requestMatchers("/product", "/auth/register", "/auth/login", "/auth/verify").permitAll()
                        .anyRequest().authenticated());


        return http.build();



    }

}
