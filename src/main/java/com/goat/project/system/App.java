package com.goat.project.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.stage.StageStyle;

public class App extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        //kay BIBIT tong fxml line(COMMENT MO NALANG TONG LINE 28 HANS)
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/loginPane.fxml"));
        
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/owner_dashboard.fxml"));       
        //kay HANS tong fxml line (COMMENT MO NALANG TONG LINE 25 CJHAY)
        
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/owner_dashboard.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/owner_sales_record.fxml"));
               
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/cashier.fxml"));
        
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        Image iconImage = new Image(getClass().getResourceAsStream("images/diosarapIcon.png"));
        stage.getIcons().add(iconImage);
        stage.setTitle("Sales and Records Management System");
        
        stage.setResizable(false);
        stage.setMaximized(true);
        
        stage.initStyle(StageStyle.UNDECORATED);
 
        stage.show();
    }
}