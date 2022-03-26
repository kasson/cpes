package com.kasson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 * @author Administrator
 */
@SpringBootApplication
public class CpesApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(CpesApplication.class);
        /* application.setBannerMode(Banner.Mode.OFF); */
        application.run(args);

    }
}
