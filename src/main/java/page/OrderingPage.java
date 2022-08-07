package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderingPage {

    WebDriver driver;
    private final By buttonOneOrder = By.className("Button_Button__ra12g");
    private final By secondButtonOrder = By.xpath("//button[contains(@class,'Button_Middle__1CSJM')]");
    private final By nameField = By.xpath("//input[@placeholder = '* Имя']");
    private final By surnameField = By.xpath(".//input[@placeholder = '* Фамилия']");
    private final By addressField = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private final By station = By.xpath(".//input[@placeholder = '* Станция метро']");
    private final By selectMetroField = By.xpath("//div[@class='select-search__select']/ul//li/button[@value='20']");
    private final By phoneField = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private final By buttonNext = By.xpath(".//button[text() = 'Далее']");
    private final By dataField = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private final By date = By.xpath("//*[text() = '10']");
    private final By rentDate = By.className("Dropdown-control");
    private final By rentDateElement = By.xpath(".//*[text() = 'трое суток']");
    private final By colourCheckbox = By.xpath(".//input[@id = 'black']");
    private final By commentField = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    private final By buttonOrder = By.xpath("//button[contains(@class, 'Button_Middle__1CSJM')][text() = 'Заказать']");
    private final By buttonYes = By.xpath(".//button[text() = 'Да']");
    private final By viewWindow = By.xpath("//button[text()='Посмотреть статус']");

    public OrderingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonOneOrder() {
        driver.findElement(buttonOneOrder).click();
    }

    public void clickSecondButtonOrder() {
        driver.findElement(secondButtonOrder).click();
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setMetro() {
        driver.findElement(station).click();
        driver.findElement(selectMetroField).click();
    }

    public void setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void clickNext() {
        driver.findElement(buttonNext).click();
    }

    public void login(String name, String surname, String address, String phone) {
        setName(name);
        setSurname(surname);
        setAddress(address);
        setPhone(phone);
        clickNext();
    }

    public void clickDate() {
        driver.findElement(dataField).click();
    }

    public void clickChooseDate() {
        driver.findElement(date).click();
    }

    public void clickRentDate() {
        driver.findElement(rentDate).click();
    }

    public void clickRentElement() {
        driver.findElement(rentDateElement).click();
    }

    public void clickCheckbox() {
        driver.findElement(colourCheckbox).click();
    }

    public void Comments() {
        driver.findElement(commentField).sendKeys("Хорошая погодка");
    }

    public void clickOrder() {
        driver.findElement(buttonOrder).click();
    }

    public void clickYesButton() {
        driver.findElement(buttonYes).click();
    }

    public void loginRentalInfo() {
        clickDate();
        clickChooseDate();
        clickRentDate();
        clickRentElement();
        clickCheckbox();
        clickOrder();
        clickYesButton();
    }

    public String getStatusView() {
        return driver.findElement(viewWindow).getText();
    }
}
