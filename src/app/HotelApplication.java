
package app;

import app.bussines.FacadeFactory;
import app.bussines.model.User;
import app.controller.Controller;
import app.gui.admin.LoginView;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HotelApplication extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        LoginView loginView = new LoginView();
        Controller.getINSTANCE().setLoginView(loginView);
        
        Scene scene = new Scene(loginView, 650, 180);
        
        primaryStage.setTitle("Log in to Hotel Management Application!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

  
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
