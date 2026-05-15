package org.example.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //SORT
    @FindBy(css = "[data-test='product-sort-container']")
    private WebElement buttonFilter;

    @FindBy(css = "[option='az']")
    private WebElement optionAz;

    @FindBy(css = "option['za']")
    private WebElement optionZa;

    @FindBy(css = "option['lohi']")
    private WebElement optionLohi;

    @FindBy(css = "option['hilo']")
    private WebElement optionHilo;

    @FindBy(css = "[data-test='inventory-item-name']")
    private WebElement titleSortZ;

    //PRODUCT
    @FindBy(css = "[data-test='inventory-item-name']")
    private WebElement titleProduct1;

    @FindBy(css = "[data-test='inventory-item-sauce-labs-backpack-img']")
    private WebElement detailProduct1;

    @FindBy(id = "add-to-cart")
    private WebElement addDetailProduct1;

    @FindBy(id = "remove")
    private WebElement removeInDetail1;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement product1;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement buttonRemoveBackpack;

    //CART
    @FindBy(css = "[data-test='title']")
    private WebElement titleCart;

    @FindBy(className = "shopping_cart_link")
    private WebElement buttonCart;


    //CLICK PRODUCT
    public void clickProduct1() {
        waitForElementToBeVisible(detailProduct1);
        detailProduct1.click();
    }

    //CLICK BUTTON ADD TO CART IN DETAIL PRODUCT 1
    public void addProduct1InDetail() {
        waitForElementToBeVisible(addDetailProduct1);
        addDetailProduct1.click();
    }

    //CLICK BUTTON ADD TO CART
    public void product1AddToCart() {
        waitForElementToBeVisible(product1);
        product1.click();
    }

    //CLICK BUTTON CART
    public void clickCart() {
        waitForElementToBeVisible(buttonCart);
        buttonCart.click();
    }

    //SORT ITEM BY NAME Z TO A
    public void     sortItemZToA() {
        waitForElementToBeVisible(buttonFilter);
        buttonFilter.click();
        optionZa.click();
    }

    //VERIFY TITTLE PRODUCT
    public boolean isUserDispalyedProduct1Page() {
        try {
            waitForElementToBeVisible(titleProduct1);
            return titleProduct1.isDisplayed() && titleProduct1.getText().equals("Sauce Labs Backpack");
        } catch (Exception e) {
            return false;
        }
    }

    //VERIFY ADD TO CART IN PRODUCT DETAIL
    public boolean isUserDisplayedRemoveProduct1() {
        try {
            waitForElementToBeVisible(removeInDetail1);
            return removeInDetail1.isDisplayed() && removeInDetail1.getText().equals("Remove");
        } catch (Exception e) {
            return false;
        }
    }

    //VERIFY DIRECTED TO CART PAGE
    public boolean isUserDispalyedCartPage() {
        try {
            waitForElementToBeVisible(titleCart);
            return titleCart.isDisplayed() && titleCart.getText().equals("Your Cart");
        } catch (Exception e) {
            return false;
        }
    }

    //VERIFY SORT PRODUCT BY NAME Z TO A
    public boolean isUserDisplayedSortByNameZtoA() {
        try {
            waitForElementToBeVisible(titleSortZ);
            return titleSortZ.isDisplayed() && titleSortZ.getText().equals("Test.allTheThings() T-Shirt (Red)");
        } catch (Exception e) {
            return false;
        }
    }
}
