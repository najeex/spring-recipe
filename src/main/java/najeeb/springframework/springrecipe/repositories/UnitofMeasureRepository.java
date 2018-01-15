package najeeb.springframework.springrecipe.repositories;

import najeeb.springframework.springrecipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitofMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{

    Optional<UnitOfMeasure> findByDescription(String description);

}
