package pro.sky.springmockito.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;
import pro.sky.springmockito.dao.UserDaoImpl;
import pro.sky.springmockito.model.User;

import static org.mockito.Mockito.when;

public class UserServiceTest {
    User userTestOne = new User("SkyProThree", "skyproThree@mail.ru");
    User userTestToo = new User("SkyPro", "skypro@mail.ru");

    private UserService userService= new UserService();

    @Mock
    private UserDaoImpl userDao;

    @Before
    public void setUser() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testCheckUserExistTrue() {
        when(userDao.getUserByName(userTestOne.getNameUser())).thenReturn(userTestOne);
        Assertions.assertTrue(userService.checkUserExist(userTestOne));
    }
    @Test
    public void testCheckUserExistFalse() {
        when(userDao.getUserByName(userTestToo.getNameUser())).thenReturn(userTestToo);
        Assertions.assertFalse(userService.checkUserExist(userTestToo));

    }
    @Test
    public void testCheckUserMailExistTrue() {
        when(userDao.getUserByMail(userTestOne.getMailUser())).thenReturn(userTestOne);
        Assertions.assertTrue(userService.checkUserMailExist(userTestOne));
    }
    @Test
    public void testCheckUserMailExistFalse() {
        when(userDao.getUserByMail(userTestToo.getMailUser())).thenReturn(userTestToo);
        Assertions.assertFalse(userService.checkUserMailExist(userTestToo));

    }

}
