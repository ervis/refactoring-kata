package legacy.provided;

// this is a global class provided by the runtime
public class UserSession {
    private static UserSession userSession = new UserSession();

    private UserSession() {
    }

    public static UserSession getInstance() {
        return userSession;
    }

    public User getLoggedUser() {
        throw new NoClassDefFoundError("User session not found");
    }
}
