package com.catalogue.recipe.services;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.catalogue.recipe.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogue.recipe.repository.RecipeRepo;

@Service
public class RecipeService {

	@Autowired
	private RecipeRepo recipeRepo;

	public List<Recipe> getAllRecipes() {

		List<Recipe> recipeList = recipeRepo.findAll();

		if(recipeList.size() > 0){
			return recipeList;
		}else{
			return null;
		}
	}

	public boolean add(Recipe recipe) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		Date date = new Date();
		System.out.println(format.format(date));
		recipe.setCreationTS(format.format(date));
		recipeRepo.save(recipe);
		return true;
	}

	public boolean remove(int id) {
		System.out.println(recipeRepo.findById(id));
		recipeRepo.deleteById(id);
		return true;
	}

	public boolean update(int id, Recipe recipe) {
		if (!recipeRepo.existsById(id))
			return false;
		recipeRepo.save(recipe);
		return true;
	}

}
