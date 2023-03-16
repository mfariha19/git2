package StepDefinitions;


import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hook extends Config {
    // QA: http://www.qa.taltektc.com
    // STAGE: http://www.stage.taltektc.com
    // PROD: http://www.prod.taltektc.com

    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeEachTest(){
        driver = SetupBrowser(driverType);
        switch (envType){
            case "qa":
                url = "http://www.qa.taltektc.com";
                Email_Address="mfariha1219@gmail.com";
                Password="Faaiza23";

//                break;
//            case "stg":
//                url = "http://www.stage.taltektc.com";
//                Email_Address="mfariha1219@gmail.com";
//                Password="Faaiza23";
//                break;
//            case "prod":
//                url = "http://www.prod.taltektc.com";
//                Email_Address="mfariha1219@gmail.com";
//                Password="Faaiza23";
//                break;
//        }
//        driver.get(url);
        }
        driver.get(url);
    }


    @After
    public void afterEachTest(){
        driver.quit();
    }
}