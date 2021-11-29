package com.taco.tacomytaco.repositpries;

import com.taco.tacomytaco.models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
