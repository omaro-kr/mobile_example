package com.kroger.mobile.cases;

import com.kroger.mobile.ui.pages.LoginPage;
import com.kroger.mobile.ui.pages.QAPage;
import com.krogerqa.seleniumcentral.framework.main.BaseTest;
import org.testng.annotations.Test;

public class TestQA_App extends BaseTest {

    LoginPage loginPage = new LoginPage();
    QAPage qaPage = new QAPage();

    @Test(groups = { "smoke" }, description = "Verify Login Submit", enabled = true, priority = 1)
    public void tc_Login() {
        loginPage.login();
    }

    @Test(groups = { "smoke" }, description = "Verifiy Natiew View Screen", enabled = true, priority = 2)
    public void tc_NativeView() {
        qaPage.nativeView();
        qaPage.back();
    }

    @Test(groups = { "smoke" }, description = "Verify Long Press functionality", enabled = true, priority = 3)
    public void tc_LongPress() {
        qaPage.longPress();
        qaPage.back();
    }

    @Test(groups = { "smoke" }, description = "Verify Double Tap Functionality", enabled = true, priority = 4)
    public void tc_DoubleTap() {
        qaPage.doubleTap();
        qaPage.back();
    }

    @Test(groups = { "smoke" }, description = "Verify Vertical Swiping Functionality", enabled = true, priority = 5)
    public void tc_VerticalSwiping() {
        qaPage.verticalSwiping();
        qaPage.back();
    }

    @Test(groups = { "smoke" }, enabled = true, priority = 6)
    public void tc_HorizontalSwiping() {
        qaPage.horizontalSwiping();
        qaPage.back();
    }
}
