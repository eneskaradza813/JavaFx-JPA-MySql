package app.gui.admin;

import app.controller.Controller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class LoginView extends GridPane{

    private final Label usernameLabel = new Label("Korisnicko ime: ");
    private final TextField usernameteTextField = new TextField();
    private final Label passwordLabel = new Label("Lozinka: ");
    private final PasswordField passwordField = new PasswordField();
    private final Button  logginButton = new Button("Prijava: ");
    private final Button cancelButton = new Button("Odustani: ");
    private final Label messageLabel = new Label();

    public LoginView() {
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(25, 25, 25, 25));
        setAlignment(Pos.CENTER);
        
        add(usernameLabel, 0, 0);
        add(usernameteTextField, 1, 0);
        
        add(passwordLabel, 0, 1);
        add(passwordField, 1, 1);
        
        FlowPane flowPane = new FlowPane();
        flowPane.setAlignment(Pos.CENTER_RIGHT);
        flowPane.getChildren().addAll(logginButton, cancelButton);
        add(flowPane, 1, 2);
        
        add(messageLabel, 1, 3);
        
        //logginButton.setOnAction(Controller.getInstance().getEventBus().getLoginEvent());
        //cancelButton.setOnAction(Controller.getINSTANCE().getEventBus().getCancelEvent());
        
    }

    public TextField getUsernameteTextField() {
        return usernameteTextField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public Label getMessageLabel() {
        return messageLabel;
    }
    
       
    
}
