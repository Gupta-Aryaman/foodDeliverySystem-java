import java.util.*;

public class UserManager {
    private static UserManager userManagerInstance = null;
    Map<String, User> usersMap;

    private UserManager(){
        usersMap = new HashMap<String, User>();
    }

    public static UserManager getUserManager(){
        if(userManagerInstance == null){
            userManagerInstance = new UserManager();
        }
        return userManagerInstance;
    }

    public void addUser(String pUserName, User pUser){
        usersMap.put(pUserName, pUser);
    }
    
    public User getUser(String pUserName){
        return usersMap.get(pUserName);
    }
}
