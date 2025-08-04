package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class Browser_manage extends Driver_Setup {

    @Test
    public void HandleBrowser() throws InterruptedException {
        driver.get("https://google.com");
        Thread.sleep(1000);

        driver.manage().window().minimize();
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.navigate().to("https://youtube.com");
        Thread.sleep(1000);

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(1000);
        driver.get("https://mvnrepository.com/");
        Thread.sleep(1000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(1000);
        driver.get("https://www.linkedin.com/in/rjalim/");
        Thread.sleep(2000);
        String CurrentWindowHandle = driver.getWindowHandle();
        Thread.sleep(2000);
        System.out.println(CurrentWindowHandle);
        List<String> handles = new ArrayList<>(driver.getWindowHandles());

        for(String handle: handles){
            System.out.println(handles);
        }
        driver.switchTo().window(handles.get(0));
        Thread.sleep(2000);
        System.out.println(driver.getWindowHandles());

        driver.switchTo().window(handles.get(1));
        Thread.sleep(2000);
        System.out.println(driver.getWindowHandles());

        driver.switchTo().window(handles.get(2));
        Thread.sleep(2000);
        System.out.println(driver.getWindowHandles());

        driver.switchTo().window(handles.get(3));
        Thread.sleep(2000);
        System.out.println(driver.getWindowHandles());

        driver.switchTo().window(handles.get(4));
        Thread.sleep(2000);
        System.out.println(driver.getWindowHandles());

    }

}
