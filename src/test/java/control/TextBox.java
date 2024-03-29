package control;

import org.openqa.selenium.By;

/**
 * @author freddyar
 */
public class TextBox extends Control {

    public TextBox(By locator) {
        super(locator);
    }

    public void writeText(String value) {
        findControl();
        control.sendKeys(value);
    }
}
