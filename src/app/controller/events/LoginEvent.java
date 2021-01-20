package app.controller.events;

import app.bussines.FacadeFactory;
import app.bussines.model.User;
import app.controller.Controller;
import app.controller.constants.Constants;
import app.gui.admin.AdminView;
import app.gui.admin.LoginView;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class LoginEvent implements EventHandler<ActionEvent>{

   

    @Override
    public void handle(ActionEvent event) {
        LoginView loginView = Controller.getInstance().getLoginView();
        String userName = loginView.getUsernameteTextField().getText();
        String password = loginView.getPasswordField().getText();
        if(userName == null || userName.isEmpty() || password == null || password.isEmpty()){
            loginView.getMessageLabel().setText(Constants.EMPTY_USERNAME_PASSOWORD_NOT_ALLOWED);
            return;
        }
        User user = FacadeFactory.getFacade().login(userName, password);
        if(user == null){
            loginView.getMessageLabel().setText(Constants.BAD_USERNAME_PASSWORD_COMBINATION);
        }else{
            if("admin".equals(user.getIdPrivilege().getName())){
                AdminView adminView = new AdminView();
                Controller.getInstance().setAdminView(adminView);
                Controller.getInstance().getPrimaryStage().setTitle("Admin panel: " + user.getName());
            }
        }
    }

    
}
