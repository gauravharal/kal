package com.scm.scm20.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to first springboot project");
        model.addAttribute("author", "just to testing");
        System.out.println(10 + 20 + "Testing");   //30Testing  1020Testing
        System.out.println("Testing" + 10 + 20);   //Testing30 Testing1020 
        System.out.println(10 * 20 + "Testing");   //200Testing
        System.out.println("Testing" + 10 * 20);    //Testing200
        System.out.println("home page controller");
        System.out.println("this is out custom change");
        ArrayList <Integer> List= new ArrayList<>();
        List.add(1);
        List.add(2);
        List.set(1,4);
        
        for(int x: List){
            System.out.println(x);
        }
        return "home";
    }

}
