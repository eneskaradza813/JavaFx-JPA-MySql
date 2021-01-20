package app.bussines;

import app.bussines.model.User;

public interface Facade {

    public User login(String username, String password);
}
