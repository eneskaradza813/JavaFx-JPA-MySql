package app.bussines;

public class FacadeFactory {

    private static final Facade FACADE = (Facade) new FacadeImplementation();

    public static Facade getFacade() {
        return FACADE;
    }
    
}
