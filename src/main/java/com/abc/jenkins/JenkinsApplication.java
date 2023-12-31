package com.abc.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

}
