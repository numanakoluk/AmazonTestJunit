import org.junit.jupiter.api.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AmazonTest extends BaseTest{

    HomePage homePage;
    LoginPage loginPage;
    ProductPage productPage;
   // AccountPage accountPage;
    @Test
    public void amazonTest() {

        homePage = new HomePage(driver);
        loginPage= new LoginPage(driver);
        productPage = new ProductPage(driver);
     // accountPage = new AccountPage(driver);

        homePage.visitHomePage();
        homePage.navigateToLogIn();
        loginPage.login();
        homePage.checkForLogin();
        homePage.chooseCategory("Bilgisayarlar");
        homePage.searchForProduct("MSI");
        homePage.selectPageFromPagination("2");
        homePage.selectProductFromSearchList("1");
        productPage.addProductToList();
        //homePage.navigateToList();
        homePage.logout();
        loginPage.checkForLogout();

    }
}
