package ru.mylibr.settings;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@Getter
@Setter
@SpringBootApplication
public class DatabaseProperties {

    @Value("${ru.mylibr.db.driver}")
    private String driver;

    @Value("${ru.mylibr.db.userName}")
    private String userName;

    @Value("${ru.mylibr.db.password}")
    private String password;

    @Value("${ru.mylibr.db.url}")
    private String url;
}