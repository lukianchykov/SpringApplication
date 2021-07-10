package ua.lukianchykov.springapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("ua.lukianchykov.springapplication")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}

