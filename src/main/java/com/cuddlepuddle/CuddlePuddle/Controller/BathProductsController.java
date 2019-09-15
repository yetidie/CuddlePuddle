package com.cuddlepuddle.cuddlePuddle.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BathProductsController {

    @RequestMapping(value = "BathProducts")
    public  String getBathProducts(){
        return "bathProducts";

    }
}
