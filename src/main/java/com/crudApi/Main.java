package com.crudApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main{
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/home")
    public Fav SayHello(){
        Fav response = new Fav(
                List.of("java", "C#", "JS"),
                new User("fady")
        );
        return response;
    }

    public record User(String name){}
    public record Fav(
            List<String> ProgrammingLanguages,
            User user){}
}