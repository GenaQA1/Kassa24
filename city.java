package test.city;

import org.testng.annotations.Test;
import test.base.BaseTest;

public class city extends BaseTest {

    @Test
    public void checkResultEvpatory(){
        basePage.open("https://kassa24.ru/");

        changeCity
                .clickSelector()
                .clickEvpatoryCity()
                .checkResultEvpatory();
    }

    @Test
    public void checkResultKerch(){
        basePage.open("https://kassa24.ru/");

        changeCity
                .clickSelector()
                .clickKerchCity()
                .checkResultKerch();
        quite();
    }

    @Test
    public void checkResultIndex4(){
        basePage.open("https://kassa24.ru/");


        changeCity
                .clickSelector()
                .clickIndex4()
                .checkResultIndex4();
    }

    @Test
    public void checkResultSevastopol(){
        basePage.open("https://kassa24.ru/");

        changeCity
                .clickSelector()
                .clickSevastopolCity()
                .checkResultSevastopol();
        quite();
    }

    @Test
    public void checkResultSimferopol(){
        basePage.open("https://kassa24.ru/");

        changeCity
                .clickSelector()
                .clickSimferopol()
                .checkResultSimferopol();
        quite();
    }

    @Test
    public void checkResultFeodocia(){
        basePage.open("https://kassa24.ru/");

        changeCity
                .clickSelector()
                .clickFeodocia()
                .checkResultFeodocia();
        quite();
    }

    @Test
    public void checkResultYalta(){
        basePage.open("https://kassa24.ru/");

        changeCity
                .clickSelector()
                .clickYalta()
                .checkResultYalta();
                 quite();
    }
}
