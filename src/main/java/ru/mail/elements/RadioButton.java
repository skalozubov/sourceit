package ru.mail.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton extends Element {
    public RadioButton(By by, WebDriver driver) {
        super(by, driver);
    }

    public void click() {
        element().click();
    }

}
