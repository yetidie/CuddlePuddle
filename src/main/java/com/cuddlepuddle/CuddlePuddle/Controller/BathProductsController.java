package com.cuddlepuddle.cuddlePuddle.Controller;

import com.cuddlepuddle.cuddlePuddle.PagePrograms.BathProducts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Controller
@RequestMapping("bathProducts")
public class BathProductsController {
    static HashMap<Integer, BathProducts> bathItems;

    public BathProductsController() {
        bathItems = new HashMap<>();
        bathItems.put(1, new BathProducts (1,"Jinx Remover", "Remove that Curse!", "Bath Bomb", 6.00, 2));
        bathItems.put(2, new BathProducts (2, "Jasmine", "Jasmine Flavored Lip balm", "Lip Balm", 3.00, 5));
    }

    @GetMapping()
    public String listBathProducts(Model model){
        model.addAttribute(("Bath Items"), bathItems.values());
        model.addAttribute("count", bathItems.size());

        return "bathProducts.html";
    }

    @GetMapping("/new")
    public String newBathProducts(){
        return "redirect:";
    }

    @PostMapping("/new")
    public String saveAddNewBathproducts(@RequestParam String productTitle,
                                     @RequestParam String bathItemDescription, @RequestParam String category, @RequestParam double price, @RequestParam int inStock) {
        System.out.println("Saved it..." + productTitle + " " + bathItemDescription + " " + category + " " + price + " " + inStock);

        int id = bathItems.size() + 1;

        bathItems.put(id, new BathProducts (id, productTitle, bathItemDescription, category, price, inStock ));
        return "redirect:";
    }


//    @GetMapping("/{id}/edit")
//    public String viewBathProducts(Model model, @PathVariable int id) {
//        BathProducts bathItems = bathItems.get(id);
//        model.addAttribute("Bath Items", bathItems);
//
//        return "bathProducts.html";
//    }
//
//    @PostMapping("/{id}/edit")
//    public String editBathProducts(@ModelAttribute BathProducts bathItems, @PathVariable int id) {
//        bathItems.put(id, bathItems);
//        return "redirect:/bathProducts";
//    }

}