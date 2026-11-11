package com.example.demospring;

@Configuration
public class CorsConfig {
    @Bean 
    public WebMvcConfigurer CorsConfig() {
        return new WebMvcConfigurer() {
            @Override 
        }
    }
}
