package experiments;

import org.openqa.selenium.By;
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


       // driver.close(); // закрытие одного активного окна
        driver.quit(); // закрытие всего браузера и всех окон

    }

    public void pause (int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
