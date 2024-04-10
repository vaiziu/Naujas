import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import java.util.concurrent.TimeUnit;

public class NAUJAS {

    WebDriver _globalDriver;

//    _globalDriver.navigate().back();

    @BeforeTest
    public void setUp() {

        _globalDriver = new ChromeDriver();
        _globalDriver.manage().window().maximize();
    }

    @Test
    public void Search() {

        int count = 0;
        _globalDriver.get("https://www.skelbiu.lt/skelbimai/1?autocompleted=%5B1%5D&keywords=kepure+su+snapeliu&cities=0&distance=0&mainCity=0&search=1&category_id=4353&user_type=0&ad_since_min=0&ad_since_max=0&visited_page=&detailsSearch=0");

        for (int a = 1; a <= 99; a++) {
            System.out.println(a + " page: " + _globalDriver.getCurrentUrl());

            if (a == 1) {
                _globalDriver.findElement(By.id("onetrust-reject-all-handler")).click();//cookies
            }

            for (int i = 1; i <= 29; i++) {

                try {
                    _globalDriver.findElement(By.className("standard-list-container"));
                    _globalDriver.findElement(By.xpath("div[" + i + "]/a")).click();   // pirmo Xpatch
                    count++;

                } catch (Exception e) {
                    System.out.println("advertise hat");
                    continue;
                }

                String ID = _globalDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[4]/div[1]")).getText(); // pirmo pr ID xpath
                System.out.println(ID);

//                _globalDriver.navigate().back();
            }

            try {
                _globalDriver.findElement(By.xpath("//*[text()='»']")).click();// next zenkliukas

            } catch (Exception e) {
//                System.out.println("last page");
                break;
            }
        }

        System.out.println("skelbimu skaicius yra: " + count);
    }





    @Test
    public void SamotinesPlytos() {
    // a musu puslapiu skicius
    // i preke

        int count = 0;
//        String fistId= "0";// kintamasis palyginimui kai firstID yra lygus ID

        for (int b = 1; b <= 5; b++) {


        _globalDriver.get("https://www.skelbiu.lt/skelbimai/?autocompleted=["+ b + "]&keywords=samotines+plytos&cost_min=&cost_max=&type=0&cities=0&distance=0&mainCity=0&search=1&category_id=2&user_type=0&ad_since_min=0&ad_since_max=0&visited_page=1&orderBy=-1&detailsSearch=0;");

        if (b == 1) {

            _globalDriver.findElement(By.id("onetrust-reject-all-handler")).click();//cookies

        }

        for (int i = 1; i <= 29; i++) {

            try {
                _globalDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[2]/div[" + i + "]/a")).click(); // pirmo Xpatch
                count++;
            } catch (Exception e) {
                continue;
            }

            String ID = _globalDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[4]/div[1]")).getText(); // pirmo pr ID xpath
            System.out.println(ID);
            _globalDriver.get("https://www.skelbiu.lt/skelbimai/?autocompleted=["+ b + "]&keywords=samotines+plytos&cost_min=&cost_max=&type=0&cities=0&distance=0&mainCity=0&search=1&category_id=2&user_type=0&ad_since_min=0&ad_since_max=0&visited_page=1&orderBy=-1&detailsSearch=0");

            }
        }
    System.out.println("skelbimu skaicius yra" + count);
    }






}