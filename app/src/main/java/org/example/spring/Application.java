package org.example.spring;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@SpringBootApplication
@RestController
public final class Application {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().directory("./").ignoreIfMissing().load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    void home(HttpServletResponse response) throws IOException {
        response.sendRedirect("/index.html");
    }

    @GetMapping("/debug/env")
    Map<String, String> showEnv() {
        return Map.of(
                "HOST", System.getProperty("HOST", "NOT SET"),
                "PORT", System.getProperty("PORT", "NOT SET"),
                "DB_NAME", System.getProperty("DB_NAME", "NOT SET"),
                "DB_USERNAME", System.getProperty("DB_USERNAME", "NOT SET")
        );
    }
}

