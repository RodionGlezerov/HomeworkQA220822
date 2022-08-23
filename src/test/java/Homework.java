import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework {

    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://ilcarro-1578153671498.web.app/search");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void findElementByTagName(){

        //ByTag
        System.out.println("ByTag:");


        List<WebElement> elements_a = wd.findElements(By.tagName("a"));
        System.out.println("Elements with tagName <a> : " + elements_a.size());

        List<WebElement> elements_h = wd.findElements(By.tagName("h1"));
        System.out.println("Elements with tagName <h1> : " + elements_h.size());

        List<WebElement> elements_h2 = wd.findElements(By.tagName("h2"));
        System.out.println("Elements with tagName <h2> : " + elements_h.size());

        List<WebElement> elements_h3 = wd.findElements(By.tagName("h3"));
        System.out.println("Elements with tagName <h3> : " + elements_h.size());

        List<WebElement> elements_div = wd.findElements(By.tagName("div"));
        System.out.println("Elements with tagName <div> : " + elements_div.size());
        

        System.out.println();

        //ByClass
        System.out.println("ByClass:");
        System.out.println();

        WebElement navigationlink = wd.findElement(By.className("navigation-link"));
        System.out.println(navigationlink.getText());

        WebElement logo = wd.findElement(By.className("logo"));
        System.out.println(logo.getText());

        WebElement mobileheader = wd.findElement(By.className("mobile-header"));
        System.out.println(mobileheader.getText());

        WebElement hidediv = wd.findElement(By.className("hide-div"));
        System.out.println(hidediv.getText());

        WebElement searchcard = wd.findElement(By.className("search-card"));
        System.out.println(searchcard.getText());

        WebElement searchcontainer = wd.findElement(By.className("search-container"));
        System.out.println(searchcontainer.getText());

        WebElement title = wd.findElement(By.className("title"));
        System.out.println(title.getText());

        WebElement subtitle = wd.findElement(By.className("subtitle"));
        System.out.println(subtitle.getText());

        System.out.println();


        //By ID
        System.out.println("ById:");
        System.out.println();

        WebElement id_0 = wd.findElement(By.id("0"));
        System.out.println(id_0.getText());
        WebElement id_1 = wd.findElement(By.id("1"));
        System.out.println(id_1.getText());
        WebElement id_2 = wd.findElement(By.id("2"));
        System.out.println(id_2.getText());
        WebElement id_city = wd.findElement(By.id("city"));
        System.out.println(id_city.getText());
        WebElement id_dates = wd.findElement(By.id("dates"));
        System.out.println(id_dates.getText());

    }


    @AfterMethod(enabled = true)
    public void tearDown(){
        wd.quit();
    }


}
