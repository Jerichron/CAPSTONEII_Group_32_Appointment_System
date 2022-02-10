package com.example.group32_appointments_system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/login")
    public String login(){
        return"login";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/book")
    public String book(){
        return "book";
    }

    @RequestMapping("/bookconfirmation")
    public String bookConfirmation(){
        return "bookConfirmation";
    }

    @RequestMapping("/appointmentsAdmin")
    public String appointmentsAdmin(){
        return "appointmentsAdmin";
    }

    @RequestMapping("/addClient")
    public String addClient(){
        return "addClient";
    }



}
