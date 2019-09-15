package com.cuddlepuddle.cuddlePuddle.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "index")
    public String getIndex(Model model){
        model.addAttribute ( "title", "Cuddle Puddle" );
        return "index";
    }


}
