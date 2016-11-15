public class User implements IUser {
    private String username;
    private String password;
    private static final String NAME_CHECK = "[A-Z][a-z]{2,} [A-Z][a-z]{2,}";
    private static final String PASSWORD_CHECK = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,}";
    private int type;

    public User() {
        username = DEFUALT_NAME;
        password = null;
    }


    @Override
    public String getName() {
        return username;
    }

    @Override
    public String setName(String name) {
        if (isNameCorrect(name))
            username = name;
        return username;
    }

    @Override
    public boolean isNameCorrect(String name) {
        if (name == null) return false;
        return name.matches(NAME_CHECK);
    }

    @Override
    public String setPassword(String password) {
        if (isPasswordCorrect(password))
            this.password = password;
        return this.password;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if (password == null) return false;
        return password.matches(PASSWORD_CHECK);
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public void setType(int type) {
        if (type == USER_STUDENT || type == USER_TEACHER)
        this.type = type;
    }
}
