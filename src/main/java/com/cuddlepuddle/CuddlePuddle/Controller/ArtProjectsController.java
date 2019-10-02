package com.cuddlepuddle.cuddlePuddle.Controller;

import com.cuddlepuddle.cuddlePuddle.Models.ArtProjects;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("artProjects")
public class ArtProjectsController {

    static HashMap<Integer, ArtProjects>  artItems;

    public ArtProjectsController(){
        artItems = new HashMap<> ();
        artItems.put(1, new ArtProjects (1,"Batty Coffin", "Trays", "Kick-ass tray", 40.00) );
    }

    @GetMapping()
    public String listArtItems(Model model){
        model.addAttribute(("Art Items"), artItems.values());
        model.addAttribute ( "count", artItems.size() );
        return  "artProjects.html";
    }

    @GetMapping("/new")
    public  String newArtProjects(){ return "redirect:";}

    @PostMapping("/new")
    public String saveAddNewArtProjects(@RequestParam String artTitle, @RequestParam String artCatgory,
                                        @RequestParam String artItemDescription, @RequestParam double artCost ){

        System.out.println ("Saved it as " + artTitle + " " + artCatgory + " " + artItemDescription + " " + artCost);
        int id = artItems.size() + 1;
        artItems.put(id, new ArtProjects ( id, artTitle, artCatgory, artItemDescription, artCost ));
        return "redirect:";
    }
//    @GetMapping("/{id}/edit")
//    public String viewArtProjects(Model model, @PathVariable int id){
//        ArtProjects artItems = artItems.get(id);
//        model.addAttribute ( "Art Item", artItems );
//        return "ArtProducts.html";
//    }
//
//    @PostMapping("/{id}/edit")
//    public String editArtProjects(@ModelAttribute ArtProjects artitems, @PathVariable int id){
//        artitems.put(id, artitems);
//        return "redirect:/artProjects"
//    }



}
