package com.example.helloworld;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    @GetMapping("/login")
    public String login(HttpSession httpSession, @RequestParam String name) {
        httpSession.setAttribute("name", name);

        return "saved";
    }

    @GetMapping("/myName")
    public String login(HttpSession httpSession) {
        String myName = (String) httpSession.getAttribute("name");

        return myName;
    }
}
