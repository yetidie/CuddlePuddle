package com.cuddlepuddle.cuddlePuddle.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtProjectsController {

    @RequestMapping( value = "artProjects")
    public String getArtProjects(){
        return "artProjects";
    }
}
