package main.java.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import main.java.base.BaseTest;

import java.util.List;

public class ElementFetch {
    public WebElement getWebElement (String identifierType , String identifierValue ){

        switch (identifierType){
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(identifierValue));
            case "CLASSNAME":
                return BaseTest.driver.findElement(By.className(identifierValue));
            case "Name":
                return BaseTest.driver.findElement(By.name(identifierValue));
            case "linkText":
                return BaseTest.driver.findElement(By.linkText(identifierValue));
            case "partialLinkText":
                return BaseTest.driver.findElement(By.partialLinkText(identifierValue));
                default:
                    return null;
        }
    }
        public List<WebElement> getListWebElements (String identifierType , String identifierValue ){

            switch (identifierType){
                case "ID":
                    return BaseTest.driver.findElements(By.id(identifierValue));
                case "cssSelector":
                    return BaseTest.driver.findElements(By.cssSelector(identifierValue));
                case "TAGNAME":
                    return BaseTest.driver.findElements(By.tagName(identifierValue));
                case "XPATH":
                    return BaseTest.driver.findElements(By.xpath(identifierValue));
                case "CLASSNAME":
                    return BaseTest.driver.findElements(By.className(identifierValue));
                case "Name":
                    return BaseTest.driver.findElements(By.name(identifierValue));
                case "linkText":
                    return BaseTest.driver.findElements(By.linkText(identifierValue));
                case "partialLinkText":
                    return BaseTest.driver.findElements(By.partialLinkText(identifierValue));
                default:
                    return null;
            }
        }

}
