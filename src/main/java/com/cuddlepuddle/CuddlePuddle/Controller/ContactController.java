package com.cuddlepuddle.cuddlePuddle.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController<contacts> {

    @RequestMapping( value = "contacts")
    public String getContacts(){
        return "contacts";
    }

}
