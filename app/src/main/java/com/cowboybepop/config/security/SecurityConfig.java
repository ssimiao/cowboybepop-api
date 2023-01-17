package com.cowboybepop.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(
                        authorizeConfig -> {
                            authorizeConfig.requestMatchers("/actuator/health").permitAll();
                            authorizeConfig.requestMatchers("/actuator").permitAll();
                            authorizeConfig.requestMatchers(HttpMethod.GET,"/api/v1/**").permitAll();
                            authorizeConfig.requestMatchers(HttpMethod.GET,"/api/**").permitAll();
                        })
                .build();
    }
}
