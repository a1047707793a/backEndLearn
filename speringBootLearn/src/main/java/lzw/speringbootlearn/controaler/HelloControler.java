package lzw.speringbootlearn.controaler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello World");
        return "hello world";
    }
}
