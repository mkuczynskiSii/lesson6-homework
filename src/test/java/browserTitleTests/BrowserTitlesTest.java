package browserTitleTests;

import base.TestBase;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Execution(ExecutionMode.CONCURRENT)
public class BrowserTitlesTest extends TestBase {

    @ParameterizedTest
    @ValueSource(strings = "Logowanie na koncie")
    @Tag("Regression")
    @Tag("siiportal")
    public void verifySiiPortalTitleTest(String expectedTitle) {
        driver.get("https://siiportal.sii.pl");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = "Onet – Jesteś na bieżąco")
    @Tag("regression")
    @Tag("onet")
    public void verifyOnetTitleTest(String expectedTitle) {
        driver.get("https://www.onet.pl/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = "Kotuszkowo- blog o kotach")
    @Tag("regression")
    @Tag("kotuszkowo")
    public void verifyKotuszkowoTitleTest(String expectedTitle) {
        driver.get("http://www.kotuszkowo.pl");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = "Filmweb - filmy takie jak Ty!")
    @Tag("regression")
    @Tag("filmweb")
    public void verifyFilmwebTitleTest(String expectedTitle) {
        driver.get("https://www.filmweb.pl/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = "WebDriver | Selenium")
    @Tag("regression")
    @Tag("selenium")
    public void verifySeleniumTitleTest(String expectedTitle) {
        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }
}
