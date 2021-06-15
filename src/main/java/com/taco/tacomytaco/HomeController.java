package com.taco.tacomytaco;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("app/")
    public String home() {
        return "home";
    }
}
//the end
//the end