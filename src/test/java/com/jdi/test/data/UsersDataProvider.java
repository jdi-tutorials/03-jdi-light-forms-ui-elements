package com.jdi.test.data;

import jdisite.entities.User;
import org.testng.annotations.DataProvider;

public class UsersDataProvider {

    public static User ROMAN = new User().set(c -> {
        c.name = "Roman"; c.password = "Jdi1234";}
    );
}
