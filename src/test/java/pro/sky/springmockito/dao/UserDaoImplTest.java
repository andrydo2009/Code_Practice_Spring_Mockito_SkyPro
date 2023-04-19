package pro.sky.springmockito.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import pro.sky.springmockito.model.User;


public class UserDaoImplTest {
    private UserDaoImpl userDao;


    @Before//выполняется перед запуском каждого тестого метода
    public void setUserDao() {
        userDao = new UserDaoImpl();
    }

    @Test
    public void testGetUserByName() {
      User userTest  = userDao.getUserByName("SkyProOne");
      Assertions.assertNotNull(userTest);
      userTest=userDao.getUserByName("SkyPro");
      Assertions.assertNull(userTest);
    }

    @Test
    public void testGetUserByMail() {
        User userTest  = userDao.getUserByMail("skyproToo@mail.ru");
        Assertions.assertNotNull(userTest);
        userTest=userDao.getUserByMail("skypro@mail.ru");
        Assertions.assertNull(userTest);
    }

}
