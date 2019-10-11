package com.jdi.tests;

import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.elements.init.UIFactory.*;
import static com.epam.jdi.light.settings.WebSettings.DOMAIN;
import static com.jdi.test.data.ContactsDataProvider.SIMPLE_CONTACT;
import static com.jdi.test.data.UsersDataProvider.ROMAN;

public class NoPoExample {
    @Test
    public void contactFormTest() {
        DOMAIN = "https://jdi-testing.github.io/jdi-light/";
        openUrl("/");
        $("img#user-icon").click();
        loginAs(ROMAN);
        openUrl("/contacts.html");
        submitForm("form#contact-form", SIMPLE_CONTACT);
    }

}
