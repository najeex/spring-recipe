package najeeb.springframework.springrecipe.controllers;

import najeeb.springframework.springrecipe.domain.Category;
import najeeb.springframework.springrecipe.domain.UnitOfMeasure;
import najeeb.springframework.springrecipe.repositories.CategoryRepository;
import najeeb.springframework.springrecipe.repositories.UnitofMeasureRepository;
import najeeb.springframework.springrecipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller

public class IndexController {

  private  final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute( attributeName "recipes", recipeService.getRecipes())

        return "index";

    }
}
