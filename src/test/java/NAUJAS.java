import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
        // a musu puslapiu skicius
        // i preke

        int count = 0;
//        String fistId= "0";// kintamasis palyginimui kai firstID yra lygus ID

        for (int a = 1; a <= 5; a++) {

            _globalDriver.get("https://www.skelbiu.lt/skelbimai/?autocompleted=[" + a + "]&keywords=kepure+su+snapeliu&cities=0&distance=0&mainCity=0&search=1&category_id=4353&user_type=0&ad_since_min=0&ad_since_max=0&visited_page=&detailsSearch=0");

            if (a == 1) {

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
                _globalDriver.get("https://www.skelbiu.lt/skelbimai/?autocompleted=[" + a + "]&keywords=kepure+su+snapeliu&cities=0&distance=0&mainCity=0&search=1&category_id=4353&user_type=0&ad_since_min=0&ad_since_max=0&visited_page=&detailsSearch=0");

            }
        }
        System.out.println("skelbimu skaicius yra" + count);
    }
    // parasyti kintamaji  kad first ID sutaptu su ID kai prasuka cikla
}

//if (IdFirst== a==1 && i==1){
//    break;
//        }


@Test
public void Search() {
    // a musu puslapiu skicius
    // i preke

    int count = 0;
//        String fistId= "0";// kintamasis palyginimui kai firstID yra lygus ID

    for (int b = 1; b <= 5; b++) {

        WebDriver _globalDriver;
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
            _globalDriver.get("https://www.skelbiu.lt/skelbimai/?autocompleted=[" + b + "]&keywords=kepure+su+snapeliu&cities=0&distance=0&mainCity=0&search=1&category_id=4353&user_type=0&ad_since_min=0&ad_since_max=0&visited_page=&detailsSearch=0");

        }
    }
    System.out.println("skelbimu skaicius yra" + count);
}