package utilities.helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyActions {


    public static boolean isDisplayed(WebDriver driver, By locator) {
        return new WebDriverWait(driver, 100).until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed();
    }

    public static boolean isClickable(WebDriver driver, By locator) {
        return new WebDriverWait(driver, 100).
                until(ExpectedConditions.elementToBeClickable(locator)).isEnabled();
    }

    public static String getPopSuccessText(WebDriver driver) {

        try {
            Thread.sleep(100);
            return  driver.switchTo().alert().getText();

        } catch (Exception e) {
            System.out.println("No Alert displayed");
        }
        return null;

    }
}
