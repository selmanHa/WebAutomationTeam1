package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestAmazon extends CommonAPI {

    @Test
    public void tes1(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhones");
        driver.findElement(By.cssSelector(".nav-input")).click();
    }

    @Test
    public void test2(){
        driver.findElement(By.linkText("Orders")).click();
    }

    @Test
    public void test3(){
        driver.findElement(By.cssSelector(".nav-input")).click();
    }

    @Test
    public void test4(){
        String title = driver.getTitle();
        String actualTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(actualTitle,title);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
    }

    @Test
    public void test5(){
        driver.findElement(By.linkText("Today's Deals")).click();
    }

    @Test
    public void test6(){
        driver.findElement(By.cssSelector(".icp-nav-link-inner")).click();
        //driver.findElement(By.cssSelector("")).click();
    }

    @Test
    public void test7(){
        driver.findElement(By.linkText("Orders")).click();
    }

    @Test
    public void test8(){
        driver.findElement(By.id("icp-nav-flyout")).click();
    }

    @Test
    public void test9(){
        driver.findElement(By.linkText("Try Prime")).click();
    }
    @Test
    public void test10(){
        driver.findElement(By.cssSelector(".nav_first")).click();
    }

    @Test
    public void test11(){
        driver.findElement(By.xpath("//a[@href='https://www.amazon.jobs']")).click();
    }

    @Test
    public void test12(){
        driver.findElement(By.xpath("//a[@href='https://blog.aboutamazon.com/?utm_source=gateway&utm_medium=footer']")).click();
    }

    @Test
    public void test13(){
        driver.findElement(By.xpath("//a[@href='https://www.aboutamazon.com/?utm_source=gateway&utm_medium=footer']")).click();
    }

    @Test
    public void test14(){
        driver.findElement(By.xpath("//a[@href='https://www.amazon.com/pr']")).click();
    }

    @Test
    public void test15(){
        driver.findElement(By.xpath("//a[@href='https://www.amazon.com/ir']")).click();
    }

    @Test
    public void test16(){
        driver.findElement(By.xpath("//a[@href='/amazon-devices/b?ie=UTF8&node=2102313011&ref_=footer_devices']")).click();
    }

    @Test
    public void test17(){
        driver.findElement(By.xpath("//a[@href='https://www.aboutamazon.com/amazon-fulfillment-center-tours?utm_source=gateway&utm_medium=footer&utm_campaign=fctours']")).click();
    }

    @Test
    public void test18(){
        driver.findElement(By.xpath("//a[@href='/gp/redirect.html?_encoding=UTF8&location=https%3A%2F%2Fservices.amazon.com%2Fcontent%" +
                "2Fsell-on-amazon.htm%2Fref%3Dfooter_soa%3Fld%" +
                "3DAZFSSOA%26ref_%3Dfooter_soa&source=standards&token=1CC2E60AAEEFD9613C04037E8F5AFD0F4D90DC5B']")).click();
    }

    @Test
    public void test19(){
        driver.findElement(By.xpath("//a[@href='/l/ref=map_1_b2b_GW_FT?_encoding=UTF8&node=17882322011']")).click();
    }

    @Test
    public void test20(){
        driver.findElement(By.xpath("//a[@href='/gp/redirect.html?_encoding=UTF8&location=https%3A%2F%" +
                "2Fservices.amazon.com%2Fhandmade%2Fhandmade.html%3Fld%3DAZUSHNDFooter%" +
                "26ref_%3Dfooter_soa&source=standards&token=3B063664DF1F3D449986FD6D04FA7404D76C339B']")).click();
    }

    @Test
    public void test21(){
        driver.findElement(By.className("nav-fill")).click();
    }
    @Test
    public void test22(){
        driver.findElement(By.cssSelector(".nav-cart-count")).click();
    }

    @Test
    public void test23(){
        driver.findElement(By.className("nav-single-row-link")).click();
    }

    @Test
    public void test24(){
        driver.findElement(By.className("icp-nav-language")).click();
    }

    @Test
    public void test25(){
        driver.findElement(By.className("a-icon-next-rounded")).click();
    }

    @Test
    public void test26(){
        WebElement element = driver.findElement(By.className("nav-search-dropdown"));
        element.click();
    }

    @Test
    public void test27(){
        driver.findElement(By.className("nav-logo-base")).click();
    }

    @Test
    public void test28(){
        WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("Quran");
        driver.findElement(By.className("nav-input")).click();
    }

    @Test
    public void test29(){
        driver.findElement(By.className("nav_a_carat")).click();
    }

    @Test
    public void test30(){
        driver.findElement(By.className("a-icon-previous-rounded")).click();
    }

    @Test
    public void test31(){
        driver.findElement(By.xpath("//a[@href='https://music.amazon.com?ref=dm_aff_amz_com']")).click();
    }

    @Test
    public void test32(){
        driver.findElement(By.xpath("//a[@href='/AmazonFresh/b?ie=UTF8&node=10329849011&ref_=footer_aff_fresh']")).click();
    }

    @Test
    public void test33(){
        driver.findElement(By.partialLinkText("Amazon Drive")).click();
    }

    @Test
    public void test34(){
        driver.findElement(By.partialLinkText("AmazonGlobal")).click();
    }

    @Test
    public void test35(){
        driver.findElement(By.partialLinkText("Box Office Mojo")).click();
    }

    @Test
    public void test36(){
        driver.findElement(By.className("icp-color-base")).click();
    }
    @Test
    public void test37(){
        driver.findElement(By.cssSelector(".nav_first")).click();
    }

    @Test
    public void test38(){
        driver.findElement(By.xpath("//a[@href='https://www.amazoninspire.com/?ref=amazon_footer']")).click();
    }

    @Test
    public void test39(){
        driver.findElement(By.id("navBackToTop")).click();
    }

    @Test
    public void test40(){
        List<WebElement> linkElements = driver.findElements(By.id("nav-your-amazon"));

        String[] linkTexts = new String[linkElements.size()];
    }

    @Test
    public void test41(){
        List<WebElement> linkElements = driver.findElements(By.linkText("Whole Foods"));
        String [] linkTexts = new String[linkElements.size()];
    }

    @Test
    public void test42(){
        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.xpath("//a[@data-menu-id='4']")).click();
    }

    @Test
    public void test43(){
        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.xpath("//a[@data-menu-id='5']")).click();
    }
    @Test
    public void test44(){
        WebElement element= driver.findElement(By.name("field-keywords"));
        element.sendKeys("Tech Books");
        driver.findElement(By.className("nav-input")).click();
        driver.navigate().back();
    }

    @Test
    public void test45(){

        String text = "Amazon Web Services";
        WebElement element = driver.findElement(By.partialLinkText("Amazon Web Services"));
        if (text.equals(element))
            element.click();

    }

    @Test
    public void test46(){
        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.xpath("//a[@data-menu-id='8']")).click();
        driver.findElement(By.xpath("//a[@href='/gp/feature.html?docId=1000645111&ref_=" +
                "nav_em_T1_0_4_25_5__adr_amz']")).click();
        driver.navigate().back();
        driver.navigate().back();
    }

    @Test
    public void test47(){
        driver.findElement(By.linkText("Sell on Amazon Business")).click();
    }

    @Test
    public void test48(){
        driver.findElement(By.linkText("Sell Your Apps on Amazon")).click();
    }

    @Test
    public void test49(){
        driver.findElement(By.linkText("Become an Affiliate")).click();
    }

    @Test
    public void test50(){
        driver.findElement(By.linkText("Advertise Your Products")).click();
    }

    @Test
    public void test51(){
        driver.findElement(By.linkText("Self-Publish with Us")).click();
    }

    @Test
    public void test52(){
        driver.findElement(By.linkText("See More")).click();
    }

    @Test
    public void test53(){
        driver.findElement(By.linkText("Amazon Rewards Visa Signature Cards")).click();
    }

    @Test
    public void test54(){
        driver.findElement(By.linkText("Amazon.com Store Card")).click();
    }

    @Test
    public void test55(){
        driver.findElement(By.linkText("Amazon Business Card")).click();
    }

    @Test
    public void test56(){
        driver.findElement(By.linkText("Amazon.com Corporate Credit Line")).click();
    }

    @Test
    public void test57(){
        driver.findElement(By.tagName("header")).click();
    }

    @Test
    public void test58(){
        driver.findElement(By.id("glow-ingress-line2")).click();
    }

    @Test
    public void test59(){
        driver.findElement(By.className("nav-right")).click();
    }

    @Test
    public void test60(){
        driver.findElement(By.className("nav-fill")).click();
    }

}
