package tests;

import core.BaseTest;
import core.DriverManager;
import core.RetryAnalyzer;
import org.apache.logging.log4j.LogManager;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomeTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(HomeTest.class);

    @Test(priority = 1, groups = {"smoke"}, description = "Test Successfully Click Product 1", retryAnalyzer = core.RetryAnalyzer.class)
    public void testProduct() {
        logger.info("Memulai test login dengan credenrial standard user");
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        logger.info("User login dengan standard user");
        loginPage.login(config.getProperty("standardUser"), config.getProperty("password"));

        logger.info("Verify user sukses login dan melihat halaman products");
        Assert.assertTrue(loginPage.isUserLoggedInSuccessfully(),
                "User should be able to see the Products page after logging in with valid credentials");

        logger.info("Memulai test click product");
        HomePage homePage = new HomePage(DriverManager.getDriver());

        logger.info("User menekan gambar product");
        homePage.clickProduct1();

        logger.info("Verify user diarahakan pada halaman detail product 1");
        Assert.assertTrue(homePage.isUserDispalyedProduct1Page(),
                "User should be able to see the Product Detail Page");

        logger.info("Test click detail product berhasil dijalankan");
    }

    @Test(priority = 2, groups = {"smoke"}, description = "Test Successfully Add Product 1 in Detail Page", retryAnalyzer = core.RetryAnalyzer.class)
    public void testDetailProduct() {
        logger.info("Memulai test login dengan credenrial standard user");
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        logger.info("User login dengan standard user");
        loginPage.login(config.getProperty("standardUser"), config.getProperty("password"));

        logger.info("Verify user sukses login dan melihat halaman products");
        Assert.assertTrue(loginPage.isUserLoggedInSuccessfully(),
                "User should be able to see the Products page after logging in with valid credentials");

        logger.info("Memulai test click product");
        HomePage homePage = new HomePage(DriverManager.getDriver());

        logger.info("User menekan gambar product");
        homePage.clickProduct1();

        logger.info("Verify user diarahakan pada halaman detail product 1");
        Assert.assertTrue(homePage.isUserDispalyedProduct1Page(),
                "User should be able to see the Product Detail Page");

        logger.info("User menekan button add to cart");
        homePage.addProduct1InDetail();

        logger.info("Verify user sukses menambahkan produk ke keranjang");
        Assert.assertTrue(homePage.isUserDisplayedRemoveProduct1(),
                "User harusnya melihat button remove product");

        logger.info("Test add to cart pada halaman detail product berhasil dijalankan");

    }

    @Test(priority = 3, groups = {"smoke"}, description = "Test successful Add to Cart in Home Page", retryAnalyzer = core.RetryAnalyzer.class)
    public void testAddToCart() {
        logger.info("Memulai test login dengan credenrial standard user");
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        logger.info("User login dengan standard user");
        loginPage.login(config.getProperty("standardUser"), config.getProperty("password"));

        logger.info("Verify user sukses login dan melihat halaman products");
        Assert.assertTrue(loginPage.isUserLoggedInSuccessfully(),
                "User should be able to see the Products page after logging in with valid credentials");

        logger.info("Memulai test product add to cart");
        HomePage homePage = new HomePage(DriverManager.getDriver());

        logger.info("User memilih product");
        homePage.product1AddToCart();

        logger.info("User menekan button add to cart");
        homePage.clickCart();

        logger.info("Verify user sukses add to cart product dan melihat halaman cart");
        Assert.assertTrue(homePage.isUserDispalyedCartPage(),
                "User should be able to see the Cart page after logging in with valid credentials");

        logger.info("Test add to cart product berhasil dijalankan");
    }

    @Test(priority = 4, groups = {"smoke"}, description = "Test successful Sort By Name Z To A", retryAnalyzer = core.RetryAnalyzer.class)
    public void testSortByNameZtoA() {
        logger.info("Memulai test login dengan credenrial standard user");
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        logger.info("User login dengan standard user");
        loginPage.login(config.getProperty("standardUser"), config.getProperty("password"));

        logger.info("Verify user sukses login dan melihat halaman products");
        Assert.assertTrue(loginPage.isUserLoggedInSuccessfully(),
                "User should be able to see the Products page after logging in with valid credentials");

        logger.info("Memulai test product add to cart");
        HomePage homePage = new HomePage(DriverManager.getDriver());

        logger.info("User klik button filter dan pilih name (Z to A)");
        homePage.sortItemZToA();

        logger.info("Verify user sukses mengurutkan produk by name dari z ke a");
        Assert.assertTrue(homePage.isUserDisplayedSortByNameZtoA(),
                "User harusnya melihat produk diurutkan dari Z ke A");

        logger.info("Test sort by name z to a berhasil dijalankan");
    }

    @Test(priority = 5, groups = {"smoke"}, description = "Test successful Sort By Price Low To High", retryAnalyzer = core.RetryAnalyzer.class)
    public void testSortByPriceLowToHigh() {
        logger.info("Memulai test login dengan credenrial standard user");
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        logger.info("User login dengan standard user");
        loginPage.login(config.getProperty("standardUser"), config.getProperty("password"));

        logger.info("Verify user sukses login dan melihat halaman products");
        Assert.assertTrue(loginPage.isUserLoggedInSuccessfully(),
                "User should be able to see the Products page after logging in with valid credentials");

        logger.info("Memulai test product add to cart");
        HomePage homePage = new HomePage(DriverManager.getDriver());

        logger.info("User klik button filter dan pilih price (low to high)");
        homePage.sortItemLoToHi();

        logger.info("Verify user sukses mengurutkan produk by price dari low to high");
        Assert.assertTrue(homePage.isUserDisplayedSortByPriceLotoHi(),
                "User harusnya melihat produk diurutkan dari harga terendah hingga terbesar");

        logger.info("Test sort by price low to high berhasil dijalankan");
    }

    @Test(priority = 6, groups = {"smoke"}, description = "Test successful Sort By Price High To Low", retryAnalyzer = core.RetryAnalyzer.class)
    public void testSortByPriceHighToLow() {
        logger.info("Memulai test login dengan credenrial standard user");
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        logger.info("User login dengan standard user");
        loginPage.login(config.getProperty("standardUser"), config.getProperty("password"));

        logger.info("Verify user sukses login dan melihat halaman products");
        Assert.assertTrue(loginPage.isUserLoggedInSuccessfully(),
                "User should be able to see the Products page after logging in with valid credentials");

        logger.info("Memulai test product add to cart");
        HomePage homePage = new HomePage(DriverManager.getDriver());

        logger.info("User klik button filter dan pilih price (low to high)");
        homePage.sortItemHiToLo();

        logger.info("Verify user sukses mengurutkan produk by price dari high to low");
        Assert.assertTrue(homePage.isUserDisplayedSortByPriceHiToLo(),
                "User harusnya melihat produk diurutkan dari harga terbesar hingga terkecil");

        logger.info("Test sort by price high to low berhasil dijalankan");
    }
}