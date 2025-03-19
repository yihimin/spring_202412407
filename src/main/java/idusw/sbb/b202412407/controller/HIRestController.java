package idusw.sbb.b202412407.controller;

import idusw.sbb.b202412407.B202412407Application;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HIRestController {
    public static void main(String[] args) {
        SpringApplication.run(B202412407Application.class, args);
    }
    @GetMapping("/")
    public String goHome() {
        return "index"; // 클라이언트(브라우저 또는 API 요청을 보낸 프로그램)가 서버로부터 받는 응답의 본문(내용)
    }
}
