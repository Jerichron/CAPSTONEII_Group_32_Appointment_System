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
        return "admin/admin";
    }

    @RequestMapping("/book")
    public String book(){
        return "client/book";
    }

    @RequestMapping("/bookconfirmation")
    public String bookConfirmation(){
        return "client/bookConfirmation";
    }

    @RequestMapping("/adminAppt")
    public String adminAppt(){
        return "admin/adminAppt";
    }

    @RequestMapping("/addClient")
    public String addClient(){
        return "admin/addClient";
    }

    @RequestMapping("/adminClientInfo")
    public String adminClientInfo(){
        return "admin/adminClientInfo";
    }

    @RequestMapping("/adminClientList")
    public String adminClientList(){
        return "admin/adminClientList";
    }

    @RequestMapping("/lawyer")
    public String lawyer(){
        return "lawyer/lawyer";
    }

    @RequestMapping("/lawyerAppt")
    public String lawyerAppt(){
        return "lawyer/lawyerAppt";
    }

    @RequestMapping("/lawyerClientInfo")
    public String lawyerClientInfo(){
        return "lawyer/lawyerClientInfo";
    }

    @RequestMapping("/lawyerClientList")
    public String lawyerClientList(){
        return "lawyer/lawyerClientList";
    }

}
