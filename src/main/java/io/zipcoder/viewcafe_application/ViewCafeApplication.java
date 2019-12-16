package io.zipcoder.viewcafe_application;

import io.zipcoder.viewcafe_application.models.User;
import io.zipcoder.viewcafe_application.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Stream;

@Controller
@SpringBootApplication
public class ViewCafeApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) { SpringApplication.run(ViewCafeApplication.class, args);
    }


//    @Bean
//    CommandLineRunner init(UserRepository repository) {
//        return args -> {
//            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//                User user = new User();
//                repository.save(user);
//            });
//            repository.findAll().forEach(System.out::println);
//        };
//    }
}
