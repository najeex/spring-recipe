package najeeb.springframework.springrecipe.services;

import najeeb.springframework.springrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}