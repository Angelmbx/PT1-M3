package com.example.M3PruebaTecnica.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/lenguages")
public class LenguageController {


    @GetMapping
    public String testController() {
        return "Lenguages controller working, boss";
    }

}
