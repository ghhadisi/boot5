package com.hss.boot5.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/cors")
    public String corsIndex() {
        return "this is cirs info";
    }
}
