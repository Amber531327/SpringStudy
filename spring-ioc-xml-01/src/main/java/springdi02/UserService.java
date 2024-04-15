package springdi02;

public class UserService {

    private UserDao userDao;
    private int age;
    private String name;

    public UserService(UserDao userDao, int age, String name) {
        this.userDao = userDao;
        this.age = age;
        this.name = name;
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
}
