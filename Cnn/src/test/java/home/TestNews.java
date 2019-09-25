package home;

import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNews extends CommonAPI {
@Test
    public void test1() {

    String title = driver.getTitle();
    String actualTitle="CNN - Breaking News, Latest News and Videos";
    Assert.assertEquals(actualTitle,title);

    }
    @Test
    public void test2(){

    }

}

