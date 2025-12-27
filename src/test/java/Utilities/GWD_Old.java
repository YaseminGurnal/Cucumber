package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.Locale;

import static Utilities.GWD.*;

public class GWD_Old {
    //Genel Web Driver

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    //Driver: threadDriver.get() ->Bulunduğun thread deki driverı veriyor
    //Driver vermek için: threadDriver.set() -> Bulunduğum thread ede driver ı ver


    public static WebDriver getDriver() {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");


        if (threadDriver.get() == null) { //Bu hatttaki driver null ise
            switch (threadBrowserName.get()) { //Hatta hangi browser adı var
                case "Firefox":

                    FirefoxOptions FireFoxOptions = new FirefoxOptions();
                    FireFoxOptions.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    threadDriver.set(new FirefoxDriver(FireFoxOptions));
                    break;
                case "Edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                default:
                    threadDriver.set(new ChromeDriver());
                    break;
            }

            //Bu thread de bir tane driver set et
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        }

        return threadDriver.get();

    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver hattaki = threadDriver.get();
            hattaki = null;
            threadDriver.set(hattaki);

        }
    }


}

