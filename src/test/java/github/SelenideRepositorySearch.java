package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SelenideRepositorySearch {

    @BeforeAll
    static void setBrowser() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    @Test
    public void shouldFindSelenideRepositoryAtTheTop() {
        //открыть главную страницу
        open("https://github.com");
        //ввети в поле поиска selenide и нажать enter
        //кликнуть на первый репозиторий из спискаданных
        //проверка: заголовок selenide/selenide
        $("span.flex-1").setValue("selenide").pressEnter();
        //sleep(6000);
    }
}
