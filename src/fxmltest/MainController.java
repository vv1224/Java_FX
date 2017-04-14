package fxmltest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * @author sunwei
 */
public class MainController implements Initializable{
    private FXMLTest application;

    public void setApp(FXMLTest application){
        this.application = application;
    }

    @FXML
    private void OUT_M(ActionEvent event) {
        application.useroutmain();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}