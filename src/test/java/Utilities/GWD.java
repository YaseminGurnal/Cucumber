package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.channels.ScatteringByteChannel;
import java.time.Duration;

public class GWD {
    //Genel Web Driver

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) { //hiç oluşturulmamışsa
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        }
        //Eğer zaten oluşmuş ise driver ı gönder
        return driver;

    }

    //Test sonucu ekranı bir beklesin diye
    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver != null) {
            driver.quit();
            driver = null;

        }
    }


}

