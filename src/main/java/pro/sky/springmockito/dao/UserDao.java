package pro.sky.springmockito.dao;

import pro.sky.springmockito.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();

    User getUserByName(String name);

    User getUserByMail(String mail);

}
