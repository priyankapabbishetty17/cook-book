package com.catalogue.recipe.controller;

import java.util.List;

import com.catalogue.recipe.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.catalogue.recipe.services.RecipeService;

@RestController
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@GetMapping(value="/recipes")
	public ResponseEntity<List<Recipe>> getRecipes() {
		return ResponseEntity.ok(recipeService.getAllRecipes());
	}

	@PostMapping(value="/createrecipe")
	public ResponseEntity<String> add(@RequestBody Recipe recipe) {
		recipeService.add(recipe);
		return ResponseEntity.ok("successfully added");
	}

	@DeleteMapping("/recipe/{id}")
	public ResponseEntity<String> remove(@PathVariable int id) {
		recipeService.remove(id);
		return ResponseEntity.ok("successfully removed");
	}

	@PutMapping("/updateRecipe/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody Recipe recipe) {
		if (recipe.getCreationTS() != null)
			return ResponseEntity.badRequest().build();
		if (recipeService.update(id, recipe))
			return ResponseEntity.ok("successfully updated");
		else
			return ResponseEntity.notFound().build();
	}
}
