package com.cuddlepuddle.CuddlePuddle.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
@Controller
public class CuddlePuddleController {
    @RequestMapping(value = "");
    public static void index(Model model){
               return 'index.html';
    }

    @RequestMapping(value = "BathProducts")
    public static void bathProducts(){
        return 'BathProducts.html';

    }
}
