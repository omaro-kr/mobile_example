package com.kroger.mobile.ui.pages;

import com.kroger.mobile.ui.maps.QAMap;
import com.krogerqa.seleniumcentral.framework.main.MobileCommands;

public class QAPage {

    private MobileCommands mobileCommands = new MobileCommands();
    private QAMap qaMap = new QAMap();

    public void nativeView() {
        mobileCommands.tap(qaMap.nativeView());
        mobileCommands.assertElementExists(qaMap.viewOneLabel(), true);
    }

    public void back() {
        mobileCommands.tap(qaMap.back());
    }

    public void longPress() {
        mobileCommands.tap(qaMap.longPress());
        mobileCommands.assertElementExists(qaMap.longPressLabel(), true);
        mobileCommands.longTapOnElement(qaMap.longPressBtn());
        mobileCommands.tap(qaMap.okBtn());
    }

    public void doubleTap() {
        mobileCommands.tap(qaMap.doubleTapBtn());
        mobileCommands.doubleTapOnElement(qaMap.doubleTapOnElement());
        mobileCommands.tap(qaMap.okBtn());
    }

    public void verticalSwiping() {
        mobileCommands.tap(qaMap.verticalSwiping());
        mobileCommands.wait(3);
        mobileCommands.scrollDown(2);
        mobileCommands.wait(3);
    }

    public void horizontalSwiping() {
        mobileCommands.scrollDownToFindVisibleText("Carousel");
        mobileCommands.tap(qaMap.carousel());
        mobileCommands.wait(2);
        mobileCommands.swipeLeft();
        mobileCommands.swipeRight();
    }
}
