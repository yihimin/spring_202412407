package idusw.sbb.b202412407.controller;

import idusw.sbb.b202412407.B202412407Application;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HIRestController {
    public static void main(String[] args) {
        SpringApplication.run(B202412407Application.class, args);
    }
    @GetMapping("/hi") //HTTP 메소드 중 Get 방식의 요청 / hi와 하단의 메소드 sayHi()리턴
    public String sayHi() {
        return "<h1> hihi </h1>"; // HTTP Response Body, 직접 응답
    }
}
