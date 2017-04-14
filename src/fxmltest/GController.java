package fxmltest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : sunwei
 *         Date : 2017/4/9
 *         Time : 17:51
 */
public class GController implements Initializable {
    private FXMLTest application;

    public void setApp(FXMLTest application){
        this.application = application;
    }

    @FXML
    private void GUA_HAO(ActionEvent event) {
        application.gotomain();
    }
    @FXML
    private void D(ActionEvent event) {
        application.gotomain();
    }
    @FXML
    private void CK(ActionEvent event) {
        application.gotomain();
    }
    @FXML
    private void JF(ActionEvent event) {
        application.gotomain();
    }
    @FXML
    private void CZ(ActionEvent event) {
        application.gotomain();
    }
    @FXML
    private void YS(ActionEvent event) {
        application.gotomain();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
