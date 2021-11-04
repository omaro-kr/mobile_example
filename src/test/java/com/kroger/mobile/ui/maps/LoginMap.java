package com.kroger.mobile.ui.maps;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginMap {

    public By loginBtn() {
        return MobileBy.AndroidUIAutomator("new UiSelector().text(\"LOG IN\")");
    }
}
