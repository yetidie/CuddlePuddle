package com.cuddlepuddle.cuddlePuddle.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CuddlePuddleController {

    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute ( "title", "Cuddle Puddle" );
        return "htmls/index";
    }

    @RequestMapping(value = "BathProducts")
    public  String bathProducts(){
        return "bathProducts";

    }
}
