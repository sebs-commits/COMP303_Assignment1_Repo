package com.example.sebastian_301241956_assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AccountOpenController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

}
