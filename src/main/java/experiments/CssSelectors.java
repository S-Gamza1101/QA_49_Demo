package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsHomePage(){
        driver.get("https://demoqa.com/"); // открытие страницы требуется URL (метод get)
        driver.manage().window().maximize(); // открытие страницы с максимальными разрешенными значениями в плане картинки
       // driver.navigate().to("https://demoqa.com/"); // тоже самое как строка 12
       // driver.navigate().refresh(); // обновление страницы (refresh)
       // driver.navigate().back(); // подсказывает последние идеи действия на один шаг (back)
        pause(4000);
//        WebElement divElements = driver
//                .findElement(By.cssSelector("div[class='card-up']"));
//        divElements.click();
        WebElement divElements = driver
                .findElement(By.cssSelector(".card-up")); // когда класс можно сделать сокращение и поставить просто точку
        divElements.click();
        pause(4000);
//        WebElement radioButton = driver.findElement(By.cssSelector("li[id='item-2']"));
//        radioButton.click();
//        pause(4000);
//        WebElement radioButton = driver.findElement(By.id("item-2")); // поиск по ID (смотреть строчку 27)
//        radioButton.click();
//        pause(4000);
        WebElement radioButton = driver.findElement(By.cssSelector("#item-2")); // если ID можно поставить решетку
        radioButton.click();
        pause(4000);
//        driver.navigate().back();
        pause(4000);
        //label[for='yesRadio']
        WebElement btnYes = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        btnYes.click();
        pause(4000);
        driver.navigate().back();
        driver.navigate().back();
        hideBanner();
        hideFooter();
        WebElement divBookStore = driver.findElement(By.cssSelector("div[class='category-cards'] " +
                "div[class='card mt-4 top-card']:last-child"));
        divBookStore.click();
        pause(4000);
        driver.navigate().back();
        pause(4000);
        WebElement divWidgets = driver.findElement(By.cssSelector("div[class='category-cards'] " +
                "div[class='card mt-4 top-card']:nth-child(4)"));
        divWidgets.click();
        pause(4000);
        driver.navigate().back();
        pause(4000);
        WebElement divAlerts = driver.findElement(By.cssSelector("div[class='category-cards'] " +
                "div[class='card mt-4 top-card']:nth-child(3) div[class='card-body'] h5"));
        System.out.println(divAlerts.getText());

       // driver.close(); // закрытие одного активного окна
        driver.quit(); // закрытие всего браузера и всех окон
    }


    @Test
    public void clickCheckBox(){
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        WebElement divElements = driver.findElement(By.cssSelector(".card"));
        //WebElement divElements = driver.findElement(By.cssSelector("div[class='card mt-4 top-card']"));
        divElements.click();
        WebElement btnCheckBox = driver.findElement(By.id("item-1"));
        //WebElement btnCheckBox = driver.findElement(By.cssSelector("#item-1"));
        //WebElement btnCheckBox = driver.findElement(By.cssSelector("li[id='item-1']"));
        //WebElement btnCheckBox = driver.findElement(By.cssSelector("*[id='item-1']"));
        btnCheckBox.click();
        hideBanner();
        hideFooter();
        WebElement checkBox = driver.findElement(By
                .cssSelector("svg[class='rct-icon rct-icon-uncheck']"));
        checkBox.click();
        pause(4000);
        driver.quit();
    }


    public void pause (int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void hideBanner(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }

    //document.querySelector('footer').style.display='none'


    public void hideFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }
}
