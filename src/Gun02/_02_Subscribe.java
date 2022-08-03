package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayrı testlerde yapınız.
  3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız
 */

public class _02_Subscribe extends GenelWebDriver {
    By link = By.linkText("Newsletter");
    By yes = By.cssSelector("input[value='1']");
    By no = By.cssSelector("input[value='0']");
    By cnt = By.cssSelector("[value='Continue']");

        @Test (priority = 1)
    void yesCheck(){
            WebElement newsletterButton = driver.findElement(link);
            newsletterButton.click();

            WebElement yesButton = driver.findElement(yes);
            yesButton.click();

            WebElement continueButton = driver.findElement(cnt);
            continueButton.click();

            //WebElement textCheck = driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']"));
            //Assert.assertEquals(textCheck.getText(),"Success: Your newsletter subscription has been successfully updated!");

            Tools.successMessageValidation(); // Method a koyduk Tools ta
        }
    @Test (priority = 2)
    void noCheck(){
        WebElement newsletterButton = driver.findElement(link);
        newsletterButton.click();

        WebElement noButton = driver.findElement(no);
        noButton.click();

        WebElement continueButton = driver.findElement(cnt);
        continueButton.click();

        // WebElement textCheck = driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']"));
        // Assert.assertEquals(textCheck.getText(),"Success: Your newsletter subscription has been successfully updated!");

        Tools.successMessageValidation();
    }
    @Test (priority = 3)
    void doYesOrNo(){
        WebElement newsletterButton = driver.findElement(link);
        newsletterButton.click();

        WebElement noButton = driver.findElement(no);
        WebElement yesButton = driver.findElement(yes);

        if (yesButton.isSelected())
            noButton.click();
        else yesButton.click();

        WebElement continueButton = driver.findElement(cnt);
        continueButton.click();

        Tools.successMessageValidation();
    }

}
