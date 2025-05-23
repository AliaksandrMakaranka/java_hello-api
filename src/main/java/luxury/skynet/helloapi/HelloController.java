package luxury.skynet.helloapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world from Spring Boot with love!";
    }
}