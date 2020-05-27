package com.catalogue.recipe.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "repo")
public class Recipe implements Serializable{

    @Id
    @GeneratedValue
    int id;
    String recipeName;
    String creationTS;
    String dishType;
    int serveCount;
    String ingredients;
    String instructions;
    String description;

    public Recipe(){

    }
    public Recipe (String recipeName, String creationTS, String dishType, int serveCount, String ingredients, String instructions, String description){
        this.recipeName = recipeName;
        this.creationTS = creationTS;
        this.dishType = dishType;
        this.serveCount = serveCount;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreationTS() {
        return creationTS;
    }

    public void setCreationTS(String creationTS) {
        this.creationTS = creationTS;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public int getServeCount() {
        return serveCount;
    }

    public void setServeCount(int serveCount) {
        this.serveCount = serveCount;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
