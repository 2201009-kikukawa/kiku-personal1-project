package com.example.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // フロント連携確認用。あとで見直す
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/hello").permitAll() // 認証不要でアクセス可
                        .anyRequest().authenticated()              // その他は認証必須
                );

        return http.build();
    }
}
