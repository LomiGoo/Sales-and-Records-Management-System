package com.goat.project.system.controller;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CashierController {
    
    // =======================
    // Category Window
    // =======================
    @FXML
    private Label categoryList;  
    @FXML
    private VBox categoryContainer;
    
    // =======================
    // Item Window
    // =======================
    @FXML
    private Label itemName, itemPrice;
    @FXML
    private VBox itemContainer;
    
    private ArrayList<String> category;
    private ArrayList<String> items;
    
    
    
    @FXML
    @SuppressWarnings("unused")
    private void initialize() {
        category = new ArrayList<>();
        category.add("Main Dish");
        category.add("Drinks");
        category.add("Fried");
        
        generateNewCategory();
        
        
        generateNewItem();
    }
    
    private int count1 = 1;
    @FXML
    private void generateNewCategory() {
        categoryList.setVisible(false);
        categoryList.setManaged(false);
        
        for(String categ : category) {
            Label newCategory = new Label(count1 + ". " + categ);
            
            newCategory.getStyleClass().addAll(categoryList.getStyleClass());
            
            newCategory.setStyle(categoryList.getStyle());
            newCategory.setFont(categoryList.getFont());
            newCategory.setPrefSize(categoryList.getPrefWidth(), categoryList.getPrefHeight());
            newCategory.setMinSize(categoryList.getMinWidth(), categoryList.getMinHeight());
            newCategory.setPadding(categoryList.getPadding());
 
            categoryContainer.getChildren().add(newCategory);
            count1++;
        }
    }
    
    private int count2 = 1;
    @FXML
    private void generateNewItem() {
        for(String item : items) {
            Label newitemContainer = new Label();
            
            newitemContainer.setStyle(itemContainer.getStyle());
            newitemContainer.setPrefSize(itemContainer.getPrefWidth(), categoryList.getPrefHeight());
            newitemContainer.setMinSize(itemContainer.getMinWidth(), categoryList.getMinHeight());
            newitemContainer.setPadding(itemContainer.getPadding());
            
            itemContainer.getChildren().add(newitemContainer);
            count2++;
        }
    }
   
    
}
