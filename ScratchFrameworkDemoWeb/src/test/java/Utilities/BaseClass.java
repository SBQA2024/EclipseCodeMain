package Utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    static String browsername;

    public static WebDriver initializedriver() {
        try {
            browsername = FetchDataFromProperties.FetchDataFromPropertiesfile().getProperty("browser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (browsername.equalsIgnoreCase("chrome")) {
            WebDriver localDriver = new ChromeDriver();
            driver.set(localDriver);
            try {
                localDriver.get(FetchDatafromExcel.FetchDatafromExcelsheet(1, 0));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return driver.get();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void cleanupDriver() {
        driver.get().quit();
        driver.remove();
    }

    public static void gettitleofwebpage() {
        String title = driver.get().getTitle();
        System.out.println("Page title is " + title);
    }

    public static void waitmethod() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
