package fxmltest;



import check.Check;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author sunwei
 */
public class FXMLTest extends Application {
    private Stage stage;
    /*private final double MINIMUM_WINDOW_WIDTH = 400.0;
    private final double MINIMUM_WINDOW_HEIGHT = 250.0;*/

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("华生医叮挂号系统");
        /*stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);*//*
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());*/
        stage.setMaximized(true);
        stage.setFullScreen(true);

        //gotologin();*/
        gotoUI();
        stage.show();
    }

    public void gotoUI(){
        try{
            GController login = (GController) replaceSceneContent("FXML_TEST2.fxml");
            login.setApp(this);
        }catch (Exception e){
            Logger.getLogger(FXMLTest.class.getName ()).log(Level.SEVERE, null, e);
        }
    }

    public void gotologin(){
        try {
            LoginController login = (LoginController) replaceSceneContent("FXML_BAR.fxml");
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(FXMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void gotomain(){
        try {
            MainController main = (MainController) replaceSceneContent("FXML_MAIN.fxml");
            main.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(FXMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void userlogin(String account,String password){
        if(Check.checkreturn(account,password)){
            gotomain();
        }
    }
    public void useroutmain(){
        gotoUI();
    }
    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = FXMLTest.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(FXMLTest.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page, 800, 600);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
    public static void main(String[] args) {
        launch(args);
    }
}