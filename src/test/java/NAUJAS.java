import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NAUJAS {

    WebDriver _globalDriver;

//    _globalDriver.navigate().back();

    @BeforeTest
    public void setUp() {

        _globalDriver = new ChromeDriver();
    }

    @Test
    public void Search () {

        _globalDriver.get("https://www.skelbiu.lt/skelbimai/?autocompleted=1&keywords=kepure+su+snapeliu&cities=0&distance=0&mainCity=0&search=1&category_id=4353&user_type=0&ad_since_min=0&ad_since_max=0&visited_page=&detailsSearch=0");
        _globalDriver.findElement(By.id("onetrust-reject-all-handler")).click();


        for (int i = 1; i <= 29; i++) {

            _globalDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[2]/div[" + i + "]/a")).click();//pirmo pr Xpath
            String ID = _globalDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[4]/div[1]")).getText();
            System.out.println(ID);

//            /html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[2]/div[29]/div[2]/div[1]/a //paskutinio pr

        }


    }





}