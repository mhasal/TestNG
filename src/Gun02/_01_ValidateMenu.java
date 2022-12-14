package Gun02;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
     */
public class _01_ValidateMenu extends GenelWebDriver {

        @Test
        void menuValidation(){
            List<String> menuExpectedList = new ArrayList<>();
            menuExpectedList.add("Desktops");
            menuExpectedList.add("Laptops & Notebooks");
            menuExpectedList.add("Components");
            menuExpectedList.add("Tablets");
            menuExpectedList.add("Software");
            menuExpectedList.add("Phones & PDAs");
            menuExpectedList.add("Cameras");
            menuExpectedList.add("MP3 Players");

            By menuFinder = By.cssSelector("ul[class='nav navbar-nav']>li");
            List<WebElement> menuActualList = driver.findElements(menuFinder);

            for (int i=0;i<menuExpectedList.size();i++)
                Assert.assertEquals(menuExpectedList.get(i),menuActualList.get(i).getText());

        }
}
