package idusw.sbb.b202412407.controller;

import idusw.sbb.b202412407.B202412407Application;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class HIRestController {
    public static void main(String[] args) {
        SpringApplication.run(B202412407Application.class, args);
    }
    @GetMapping("/hi") //HTTP 메소드 중 Get 방식의 요청 / hi와 하단의 메소드 sayHi()리턴
    public String sayHi() {
        return "<h1> hihi </h1>"; // HTTP Response Body, 직접 응답
    }

    @PostMapping("/hi") // 🔥 POST 요청 처리
    public ResponseEntity<String> sayHihi(HttpServletRequest request) {
        String name = request.getParameter("p-name"); // 폼 데이터에서 name="p-name"을 가져옴
        String email = request.getParameter("p-email"); // 폼 데이터에서 name="p-email"을 가져옴
        return ResponseEntity.ok("<h1> 받았다!: " + name + " - " + email + " - " + request.getParameter("p-phone") +" - "+ request.getParameter("p-message")+ " </h1>");
    }
}
