package az.edu.ada.wm2.first_restful_app.repository;

import az.edu.ada.wm2.first_restful_app.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MealRepository extends JpaRepository<Meal, Long> {

    List<Meal> findByNameContains(String name);

}
