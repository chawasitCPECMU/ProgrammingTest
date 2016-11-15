import com.sun.org.apache.bcel.internal.generic.IUSHR;

import java.util.ArrayList;

public class Users {
    // User repository
    private ArrayList<IUser> userList;

    public Users() {
        userList = new ArrayList<>();
    }

    // Create new user with type, name and password
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password) {
        IUser user = new User();
        user.setType(type);
        user.setName(name);
        user.setPassword(password);
        this.add(user);
        return user;
    }

    // Add new user to repository
    public void add(IUser user) {
        userList.add(user);
    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {
        if(!userList.remove(user))
            throw new RuntimeException(String.format("User[%s] is not in the list", user.getName()));
    }

    // Return true if the user is in the list
    public boolean exists(IUser user) {
        return userList.contains(user);
    }

    // Return number of user in the list
    public int count() {
        return userList.size();
    }

    // Return number of user in the list, according to type
    public int countByType(int type) {
        int count = 0;
        for (IUser user :
                userList) {
            count += user.getType() == type ? 1 : 0;
        }
        return count;
    }
}
