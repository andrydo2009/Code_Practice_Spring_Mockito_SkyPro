package pro.sky.springmockito.service;

import pro.sky.springmockito.dao.UserDaoImpl;
import pro.sky.springmockito.model.User;



public class UserService {

    private final UserDaoImpl userDao=new UserDaoImpl();

    public boolean checkUserExist(User userCheck){
        return userDao.getUserByName(userCheck.getNameUser()) != null;
    }
    public boolean checkUserMailExist(User userCheck){
        return userDao.getUserByMail(userCheck.getMailUser()) != null;
    }

}
