package app.controller;

import app.bussines.model.User;
import app.controller.events.EventBus;
import app.gui.admin.AdminView;
import app.gui.admin.LoginView;
import app.gui.user.UserView;
import javafx.stage.Stage;

public class Controller {

    private LoginView loginView;
    private UserView userView;
    private AdminView adminView;
    private final EventBus eventBus = new EventBus();
    private Stage primaryStage;
    private User loggedUser;
    
    private Controller(){
        System.out.println("Kreiram Controller");
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    

    public EventBus getEventBus() {
        return eventBus;
    }
    

    public LoginView getLoginView() {
        return loginView;
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }

    public AdminView getAdminView() {
        return adminView;
    }

    public void setAdminView(AdminView adminView) {
        this.adminView = adminView;
    }

    public static Controller getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(Controller INSTANCE) {
        Controller.INSTANCE = INSTANCE;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    public UserView getUserView() {
        return userView;
    }

    public void setUserView(UserView userView) {
        this.userView = userView;
    }
    
    
    private static Controller INSTANCE = null;
    
    public static Controller getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Controller();
        }
        return INSTANCE;
    }
}
