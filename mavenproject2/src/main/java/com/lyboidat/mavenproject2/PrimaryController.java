package com.lyboidat.mavenproject2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    public void checkHandler(ActionEvent event){
    }
    
}
