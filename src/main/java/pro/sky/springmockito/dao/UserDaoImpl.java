package pro.sky.springmockito.dao;



import pro.sky.springmockito.model.User;


import java.util.List;



public class UserDaoImpl implements UserDao {

    User userOne = new User("SkyProOne", "skyproOne@mail.ru");
    User userToo = new User("SkyProToo", "skyproToo@mail.ru");
    User userThree = new User("SkyProThree", "skyproThree@mail.ru");

    private final List<User> users = List.of(userOne, userToo, userThree);

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users
        ) {
            if (user.getNameUser().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByMail(String mail) {   for (User user : users
    ) {
        if (user.getMailUser().equals(mail)) {
            return user;
        }
    }
        return null;
    }


}
