package Christopher.Heibutcke.exemplo2mysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "bem vindo ao nosso sistema!";
    }
}
