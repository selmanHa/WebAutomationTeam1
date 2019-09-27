package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestNews extends CommonAPI {

    @Test
    public void testCnn31(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
    }

    @Test
    public void testCnn32(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
        driver.findElement(By.xpath("//a[@href='http://bleacherreport.com/nfl']")).click();
    }

    @Test
    public void testCnn33(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
        driver.findElement(By.name("world-football")).click();
        driver.navigate().back();
    }

    @Test
    public void testCnn34(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
        driver.findElement(By.className("nav-linksstyles__Link-sc-1tike8v-0")).click();
    }

    @Test
    public void testCnn35(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
        driver.findElement(By.className("search-icon")).click();

    }

    @Test
    public void testCnn36(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
        driver.findElement(By.className("search-icon")).click();
        driver.findElement(By.xpath("//input[@id='header-search-bar']")).sendKeys("Tech News");
        driver.findElement(By.className("Text-sc-1amvtpj-0")).click();
    }

    @Test
    public void testCnn37(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
        driver.findElement(By.className("facebook-icon")).click();
    }

    @Test
    public void testCnn38(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
        driver.findElement(By.className("twitter-icon")).click();
    }

    @Test
    public void testCnn39(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
        driver.findElement(By.className("instagram-icon")).click();
    }

    @Test
    public void testCnn40(){
        driver.findElement(By.cssSelector(".menu-icon")).click();
        driver.findElement(By.cssSelector(".close-icon")).click();
    }

    @Test
    public void testCnn41(){
        driver.findElement(By.cssSelector(".edition-pickerstyles__Caret-t9lxqp-1")).click();
        driver.findElement(By.xpath("//a[@class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 " +
                "edition-pickerstyles__LinkListLink-t9lxqp-5 gcLwUc']")).click();
    }

    @Test
    public void testCnn42(){
        driver.findElement(By.cssSelector(".edition-pickerstyles__Caret-t9lxqp-1")).click();
        driver.findElement(By.name("arabic")).click();
        driver.navigate().back();
    }

    @Test
    public void testCnn43(){
        driver.findElement(By.cssSelector(".edition-pickerstyles__Caret-t9lxqp-1")).click();
        driver.findElement(By.xpath("//a[@href='//cnnespanol.cnn.com?hpt=header_edition-picker']")).click();
        driver.navigate().back();
    }


    @Test
    public void testCnn44(){
        driver.findElement(By.className("cnn-badge-icon")).click();
        driver.navigate().back();
    }

    @Test
    public void testCnn45(){
        List<WebElement> elements = driver.findElements(By.cssSelector(".edition-pickerstyles__Caret-t9lxqp-1"));
        System.out.println("Number of elements: "+elements.size());

        for (int i =0; i<elements.size(); i++){
            System.out.println(elements.get(i).getAttribute("value"));
        }
    }



    @Test
    public void testCnn46(){
        driver.findElement(By.linkText("Sitemap")).click();
        driver.navigate().back();
    }

    @Test
    public void testCnn47(){
        driver.findElement(By.className("breaking-news__close-btn")).click();
    }
    @Test
    public void testCnn48(){
        driver.findElement(By.xpath("//a[@class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 " +
                "copyright__TBSLink-f3mp1a-1 iqIHwd']")).click();
    }

    @Test
    public void testCnn49(){
        driver.findElement(By.partialLinkText("LIVE UPDATES:")).click();
        driver.navigate().back();
    }

    @Test
    public void testCnn50(){
        driver.findElement(By.xpath("//a[@href='//store.cnn.com']")).click();
        driver.navigate().back();
    }


}

