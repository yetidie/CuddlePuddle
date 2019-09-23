package com.cuddlepuddle.cuddlePuddle.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( value = "/")
public class WelcomeController {

    @RequestMapping( value = "")
    public String getWelcome(){
        return "welcome";
    }

}
