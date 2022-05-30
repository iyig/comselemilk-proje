import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class İlkClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

       //biz driver objesi olusturdugumzda bos bir chrome browser acilir

        driver.get("https://www.amazon.com");
       // driver.get method'u driver'a gidecegi web adresini girmemizi saglar

  Thread.sleep(3000);

   driver.close();
    }



}
