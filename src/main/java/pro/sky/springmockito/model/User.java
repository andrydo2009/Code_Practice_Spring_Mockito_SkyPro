package pro.sky.springmockito.model;


import java.util.Objects;

public class User {

    String nameUser;
    String mailUser;

    public User() {
    }

    public User(String nameUser, String mailUser) {
        this.nameUser = nameUser;
        this.mailUser = mailUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getMailUser() {
        return mailUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nameUser, user.nameUser) && Objects.equals(mailUser, user.mailUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameUser, mailUser);
    }
}
