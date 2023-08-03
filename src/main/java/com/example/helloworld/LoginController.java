package com.example.helloworld;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class LoginController {

    Map<String, String> sessionMap = new HashMap<>();

    @GetMapping("/login")
    public String login(HttpSession httpSession, @RequestParam String name) {
        sessionMap.put(httpSession.getId(), name);

        return "saved";
    }

    @GetMapping("/myName")
    public String login(HttpSession httpSession) {
        String myName = sessionMap.get(httpSession.getId());

        return myName;
    }
}
