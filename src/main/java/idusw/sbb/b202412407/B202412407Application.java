package idusw.sbb.b202412407;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
/**
 * @SpringBootApplication 어노테이션이 하는 역할
 * 📌 이 클래스가 스프링 부트 애플리케이션의 진입점(Main 클래스)
 * 이 클래스를 실행하면 Spring Boot가 자동으로 설정을 로드하고, 애플리케이션이 실행됨.
 * 📌 자동 설정 기능, 컴포넌트 스캔 가능
 * @SpringBootApplication 어노테이션이 있으면 스프링 부트가 자동으로 설정을 해줌
 * 또, @Component, @Service, @Repository, @Controller 같은 어노테이션이 붙은 클래스를 자동으로 찾아서 등록(컴포넌트 스캔) 해줌.
 */
public class B202412407Application {

    public static void main(String[] args) {

        SpringApplication.run(B202412407Application.class, args);
    }
}