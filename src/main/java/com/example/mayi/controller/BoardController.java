package com.example.mayi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/test", method= RequestMethod.GET)
public class BoardController {
    public String Test(){
        return "HELLO WORLD";
    }
}
