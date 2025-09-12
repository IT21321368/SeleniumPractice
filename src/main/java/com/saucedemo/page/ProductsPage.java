package com.saucedemo.page;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {
    private By productsHeader = By.xpath("//div[text()='Products']");

    public boolean isProductsHeaderDisplayed(){
        return find(productsHeader).isDisplayed();
    }
}
