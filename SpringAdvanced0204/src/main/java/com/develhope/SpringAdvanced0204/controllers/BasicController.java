package com.develhope.SpringAdvanced0204.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class BasicController {

    @Value("${myCustomVarTree.welcomeMsg}")
    private String customVariable;


    @GetMapping("/show/customvar")
    public @ResponseBody String showCustomVar () {
        return customVariable;
    }
}
