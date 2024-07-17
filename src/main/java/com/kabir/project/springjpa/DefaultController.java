package com.kabir.project.springjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/about")
    public String getAboutDetails() {
        return "this is a about page";
    }
}
