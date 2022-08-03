package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
  1- Siteyi açınız.
  2- Edit Account a tıklatınız.
  3- Yeni isim ve soyisim göndererek Continue yapınız.
  4- İşlem sonucunu kontrol ediniz.
  5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
 */
public class _03_EditAccount extends GenelWebDriver {

    @Test
    void newNameTest(){
        for (int i = 0; i < 2; i++) {
            WebElement editAccount = driver.findElement(By.linkText("Edit Account"));
            editAccount.click();
            WebElement newName = driver.findElement(By.name("firstname"));
            newName.clear();
            newName.sendKeys("Metin");
            WebElement newSurname = driver.findElement(By.name("lastname"));
            newSurname.clear();
            newSurname.sendKeys("Hasal");
            WebElement cnt = driver.findElement(By.cssSelector("[value='Continue']"));
            cnt.click();

            Tools.successMessageValidation();
        }


    }


}
