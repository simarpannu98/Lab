/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicegui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 *
 * @author simarjit singh pannu
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label Pizzaorderlabel;
    @FXML private CheckBox CHICKENCheckBox;
    @FXML private CheckBox BACONCheckBox;
    @FXML private CheckBox PEPPORONICheckBox;
    @FXML private CheckBox CHEESECheckBox;
    //this is for the checkbox label    above
    
    
    @FXML private Label choiceBoxlabel;
    @FXML private ChoiceBox choiceBox;
    
    
    public void choiceBoxButton()
    {
        choiceBoxlabel.setText("My favorite fruit is : \n" +choiceBox.getValue().toString());
    }
    
    
    public void pizzaButton()
    {
        String order = "Toppings are:";
        
        if(CHICKENCheckBox.isSelected() )
        
            order += "\nChicken";
        
        if(BACONCheckBox.isSelected() )
        
            order += "\nBacon";
        
        if(PEPPORONICheckBox.isSelected() )
        
            order += "\nPEPPORONI";
        
        if(CHEESECheckBox.isSelected() )
        
            order += "\nCheese";
        
        this.Pizzaorderlabel.setText(order);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Pizzaorderlabel.setText("");
        
        choiceBoxlabel.setText("");
        choiceBox.getItems().add("apple");
        choiceBox.getItems().add("banana");
        choiceBox.getItems().add("kiwi");
        choiceBox.setValue("apple");
    }    
    
}
