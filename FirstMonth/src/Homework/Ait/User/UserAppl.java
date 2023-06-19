package Homework.Ait.User;

import Homework.Ait.User.Model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("pe$ter@gmail.com", "1234");
        System.out.println(user);
        user.setEmail("peter@yahoo.com");

        user.setPassword("2qwER!@"); // 7 символов
        System.out.println(user);
        user.setPassword("qwerER!@"); // не цифр
        System.out.println(user);
        user.setPassword("1234ER!@"); // нет букв в нижнем регистре
        System.out.println(user);
        user.setPassword("12qwer!@"); // нет букв в верхнем регистре
        System.out.println(user);
        user.setPassword("12qwER34"); // нет спец. символов
        System.out.println(user);

        user.setPassword("12qwER!@"); // все есть
        System.out.println(user);
    }
}
