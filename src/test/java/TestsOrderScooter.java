import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.OrderingPage;

public class TestsOrderScooter extends ConstantsQuestions {

    WebDriver driver = new FirefoxDriver();

    @Before
    public void goOrder() {
        driver.get(LINK_YANDEX);
        driver.findElement(By.id("rcc-confirm-button")).click();
    }

    @Test
    public void testButtonOneOrder() {
        OrderingPage orderingPage = new OrderingPage(driver);
        orderingPage.clickButtonOneOrder();
        orderingPage.login("Алексий", "Великий", "Колотушкина", "89557162312");
        orderingPage.setMetro();
        orderingPage.clickNext();
        orderingPage.loginRentalInfo();
        String textStatus = orderingPage.getStatusView();
        Assert.assertEquals(BUTTONS_STATUS, textStatus);
    }

    @Test
    public void testSecondButtonOrder() {
        OrderingPage orderingPage = new OrderingPage(driver);
        orderingPage.clickSecondButtonOrder();
        orderingPage.login("Миша", "Жидкарев", "Театральная", "89817365522");
        orderingPage.setMetro();
        orderingPage.clickNext();
        orderingPage.loginRentalInfo();
        String textStatus = orderingPage.getStatusView();
        Assert.assertEquals(BUTTONS_STATUS, textStatus);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}