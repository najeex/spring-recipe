package najeeb.springframework.springrecipe.repositories;

import najeeb.springframework.springrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
