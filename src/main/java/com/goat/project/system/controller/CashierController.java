package com.goat.project.system.controller;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CashierController {
    
    // =======================
    // Category Labels
    // =======================
    @FXML
    private Label dummyCateg;
    private ArrayList<String> category = new ArrayList<>();
    
    @SuppressWarnings("unused")
    private void initialize() {
        category.add("Main Dish");
        category.add("Drinks");
        category.add("Fried");
        
        generateNewCategory();
    }
    
    int count = 1;
    public void generateNewCategory() {
        for(String categ : category) {
            Label newLabel = new Label(count + ". " + categ.indexOf(categ));
            System.out.println(categ.indexOf(categ));
        }
    }
    
}
