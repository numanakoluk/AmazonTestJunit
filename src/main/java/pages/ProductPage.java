package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    By idInput = By.xpath("//*[@name='sourceCustomerOrgListID']");
    By addToListButton = By.xpath("//input[@title='Alışveriş Sepetine Ekle']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public static String productId;

    public void addProductToList() {
        waitForSecond(2);
        productId = getAttributeFromElement(idInput, "value");
        clickToElement(addToListButton);
        log.info("Ürün Sepete Eklendi");
        waitForSecond(2);
    }
}
