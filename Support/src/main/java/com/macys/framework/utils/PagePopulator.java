package com.macys.framework.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by yc05r3a on 4/21/2017.
 */
public class PagePopulator {

    public static void fillPage(HashMap data) {
        Set set = data.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            WebDriver driver = Navigation.getDriver();
            if (driver.findElement(By.id(me.getKey().toString())).getTagName() == "input") {
                driver.findElement(By.id((me.getKey().toString()))).sendKeys(me.getValue().toString());
            }
        }

    }
}
