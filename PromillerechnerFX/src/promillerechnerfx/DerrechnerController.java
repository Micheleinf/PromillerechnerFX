/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promillerechnerfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author biond
 */
public class DerrechnerController implements Initializable {

    @FXML
    private CheckBox mann;
    @FXML
    private CheckBox frau;
    @FXML
    private TextField kilo;
    @FXML
    private TextField liter;
    @FXML
    private TextField min;
    @FXML
    private Button ausrechnerbtn;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
   @FXML
    private void mann(ActionEvent event) {
        
    }

    @FXML
    private void frau(ActionEvent event) {
    }

    @FXML
    private void ausrechner(ActionEvent event) {
        if(mann.isSelected())
        {
           
            
            String kilogramm = kilo.getText();
            int k = Integer.parseInt(kilogramm);
            
            String bierlitter = liter.getText();
            double l = Double.parseDouble(bierlitter);            

            
            String minuten = min.getText();
            int m =  Integer.parseInt(minuten);
            
            double alkgramm = l*40;
            double step1 = k*0.7;
            double step2 = alkgramm/step1;
            double step3 = m*0.0025;
            double finalstep = step2-step3;
            
            label.setText("SIE HABEN " + finalstep + " PROMILLE");
            
            
            
            
          
            
        }
        else if(frau.isSelected()){
            
            String kilogramm = kilo.getText();
            int k = Integer.parseInt(kilogramm);
            
            String bierlitter = liter.getText();
            double l = Double.parseDouble(bierlitter);            

            
            String minuten = min.getText();
            int m =  Integer.parseInt(minuten);
            
            double alkgramm = l*40;
            double step1 = k*0.6;
            double step2 = alkgramm/step1;
            double step3 = m*0.0025;
            double finalstep = step2-step3;
            
            label.setText("SIE HABEN " + finalstep + " PROMILLE");
            
            
       
            
            
        
        }

    }
    
}
