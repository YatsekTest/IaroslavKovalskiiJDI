package entities;

public class User {

    private final String name;
    private final String password;
    private final String userFullName;

    public User(String name, String password, String userFullName) {
        this.name = name;
        this.password = password;
        this.userFullName = userFullName;
    }

    public static final User ROMAN = new User(
            "Roman",
            "Jdi1234",
            "Roman Iovlev");

    public String getUserFullName() {
        return userFullName;
    }

}
