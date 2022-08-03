package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.WeakHashMap;

public class Tools {

    public static void compareToList(List<String> menuExpectedList, List<WebElement> menuActualList){
        for (int i=0;i<menuExpectedList.size();i++)
            Assert.assertEquals(menuExpectedList.get(i),menuActualList.get(i).getText());
    }


    public static void successMessageValidation(){
        WebElement textCheck = GenelWebDriver.driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(textCheck.getText().contains("Success"));
    }
}
