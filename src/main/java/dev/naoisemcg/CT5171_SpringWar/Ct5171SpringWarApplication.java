package dev.naoisemcg.CT5171_SpringWar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ct5171SpringWarApplication {

    @RequestMapping("/")
    public String hello1() {
        return "Hello";
    }

    @RequestMapping("/hello")
    public String hello2() {
        return "Hello again";
    }

	public static void main(String[] args) {
		SpringApplication.run(Ct5171SpringWarApplication.class, args);
	}

}
