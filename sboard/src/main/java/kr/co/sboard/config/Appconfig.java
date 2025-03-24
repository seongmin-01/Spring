package kr.co.sboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    @Bean
    public AppInfo appInfo() {
        return new AppInfo();
    }


}
