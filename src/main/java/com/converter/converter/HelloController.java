package com.converter.converter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    RadioButton cmTOM ;
    @FXML
    RadioButton mTOKM;
    @FXML
    RadioButton kmTOMi;
    @FXML
    Button convert;
    @FXML
    TextField first ;
    @FXML
    TextField second;
    @FXML
    TextField converted;


    @FXML
    private void radioButtonsAction(){
        if(mTOKM.isSelected() == true){
            kmTOMi.setSelected(false);
            cmTOM.setSelected(false);
        }
        if(kmTOMi.isSelected() == true){
            mTOKM.setSelected(false);
            cmTOM.setSelected(false);
        }
        else if (cmTOM.isSelected() == true) {
            kmTOMi.setSelected(false);
            mTOKM.setSelected(false);
        }
    }
    @FXML
    private void convertAction(){
        if(mTOKM.isSelected()== true && kmTOMi.isSelected()== false && cmTOM.isSelected() == false){
            double km = Double.parseDouble(first.getText()) / 1000;
            converted.setText(String.valueOf(km));
        }
        if(kmTOMi.isSelected() == true && mTOKM.isSelected() == false && cmTOM.isSelected() == false){
            double mi = Double.parseDouble(first.getText()) * 0.6214;
            converted.setText(String.valueOf(mi));
        }
        if(cmTOM.isSelected() == true && mTOKM.isSelected() == false && kmTOMi.isSelected() == false){
            double m = Double.parseDouble(first.getText()) / 100 ;
            converted.setText(String.valueOf(m));
        }
    }
}