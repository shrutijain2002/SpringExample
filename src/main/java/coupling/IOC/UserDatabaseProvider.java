package coupling.IOC;

// A - MySQL, PostgreSQL
// B - Web Service, MongoDB

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        // Directly access database here
        return "User Details From Database";
    }
}
