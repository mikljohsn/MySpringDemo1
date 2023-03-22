package com.example.myspringdemo1.controller;

import com.example.myspringdemo1.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home/index";
    }
    @PostMapping("/personData")
    public String personData(@ModelAttribute Person person, Model model){
        model.addAttribute("Claus", person);
        return "home/personData";
    }
/*    @PostMapping("/personData")
    public String personData(WebRequest webRequest, Model model){
        String firstName = webRequest.getParameter("fname");
        String lastName = webRequest.getParameter("lname");
        String address = webRequest.getParameter("address");

        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("address",address);
        return "home/personData";
    }*/
}
