package najeeb.springframework.springrecipe.repositories;

import najeeb.springframework.springrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
