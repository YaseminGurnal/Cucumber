package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWD {
    //Genel Web Driver

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) //hiç oluşturulmamışsa
            driver = new ChromeDriver();
        //Eğer zaten oluşmuş ise driver ı gönder
        return driver;

    }
}

