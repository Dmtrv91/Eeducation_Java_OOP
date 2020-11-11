package p04_InterfaceSegregation.p02_identity.interfaces;

public interface AuthManager {

    void register(String username, String password);

    void login(String username, String password);

}
