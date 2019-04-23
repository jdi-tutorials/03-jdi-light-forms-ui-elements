package com.jdi.states;

import static com.jdi.test.data.UsersDataProvider.ROMAN;
import static jdisite.JDISite.*;
import static jdisite.JDISite.logout;

public class State {
    public static void loggedIn() {
        if (userName.isHidden()) {
            if (loginForm.isHidden())
                userIcon.click();
            loginForm.loginAs(ROMAN);
        }
    }
}
