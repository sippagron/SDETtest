package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Main {
    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();

        driver.get("https://www.saucedemo.com");

        WebElement usernameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();

        driver.get("https://www.saucedemo.com/inventory.html");

        WebElement shoppingcart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        shoppingcart.click();

        WebElement shoppingcart2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        shoppingcart2.click();

        WebElement shoppingcart3 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        shoppingcart3.click();

        WebElement shoppingcart4 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        shoppingcart4.click();

        WebElement shoppingcart5 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        shoppingcart5.click();

        WebElement shoppingcart6 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        shoppingcart6.click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cartCountElement = driver.findElement(By.className("shopping_cart_badge"));
        int cartCount = Integer.parseInt(cartCountElement.getText());
        if (cartCount == 6) {
            System.out.println("Product was added to cart successfully.");
        } else {
            System.out.println("Product was not added to cart.");
        }

        driver.get("https://www.saucedemo.com/cart.html");

        WebElement checkoutButton = driver.findElement(By.name("checkout"));
        checkoutButton.click();

        WebElement firstnameField = driver.findElement(By.name("firstName"));
        WebElement lastnameField = driver.findElement(By.name("lastName"));
        WebElement postalField = driver.findElement(By.name("postalCode"));

        firstnameField.sendKeys("test");
        lastnameField.sendKeys("testtest");
        postalField.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.name("continue"));
        continueButton.click();

        driver.get("https://www.saucedemo.com/checkout-step-two.html");

        WebElement finishButton = driver.findElement(By.name("finish"));
        finishButton.click();

//          driver.quit();
    }
}


