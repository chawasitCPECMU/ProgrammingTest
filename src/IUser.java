public interface IUser {
    /**
     * Constant Variable
     */
    public static final int USER_STUDENT = 1;
    public static final int USER_TEACHER = 2;
    public static final String DEFUALT_NAME = "John Dough";

    /**
     * get name of user
     * @return String name
     */
    public String getName();

    /**
     * set name to user
     * Allow alphabet only
     * @param name
     * @return
     */
    public String setName(String name);
    public boolean isNameCorrect(String name);

    /**
     * set password to user
     * Allow alphabet and number only
     * length > 8 characters
     * @param password
     * @return
     */
    public String setPassword(String password);
    public boolean isPasswordCorrect(String password);

    /**
     * @return type of user
     */
    public int getType();


    /**
     * set user type
     * @param type
     */
    public void setType(int type);
}
