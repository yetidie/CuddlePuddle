package com.cuddlepuddle.CuddlePuddle.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CuddlePuddleController {
    @RequestMapping(value = "");

    public String index(Model model){

        return "index";
    }

    @RequestMapping(value = "BathProducts")
    public  String bathProducts(){
        return "bath";

    }
}
