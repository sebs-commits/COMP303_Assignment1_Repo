package com.example.sebastian_301241956_assignment1;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountOpenController {

    @GetMapping("/accountOpen")
    public String showAccountOpen(Model model) {
        model.addAttribute("account", new AccountOpen());
        return "index";
    }

    @PostMapping("/accountOpen")
    public String processAccountOpen(@ModelAttribute AccountOpen account, Model model) {
        model.addAttribute("account", account);
        System.out.println("Received account opening request: " + account);
        return "show-details";
    }


}
