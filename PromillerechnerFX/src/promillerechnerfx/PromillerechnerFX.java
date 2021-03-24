/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promillerechnerfx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author biond
 */
public class PromillerechnerFX extends Application {
    
     @Override
    public void start(Stage primaryStage) throws Exception{
    Parent root  = FXMLLoader.load(getClass().getResource("derrechner.fxml"));
    primaryStage.setTitle("DER BIER Promillerechner");
    primaryStage.setScene(new Scene(root, 1005, 538));
    primaryStage.show();
    }
    
    public static void main(String[] args){ launch(args); }
    
}

 
   
    

