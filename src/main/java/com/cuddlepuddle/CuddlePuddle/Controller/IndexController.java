package com.cuddlepuddle.cuddlePuddle.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping(value = "")
    public String getIndex(Model model){
        model.addAttribute ( "title", "Cuddle Puddle" );
        return "index";
    }


}
