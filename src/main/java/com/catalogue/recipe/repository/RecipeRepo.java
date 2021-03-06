package com.catalogue.recipe.repository;

import com.catalogue.recipe.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface RecipeRepo extends JpaRepository<Recipe, Integer> {
}
