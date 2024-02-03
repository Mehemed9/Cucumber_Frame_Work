package stepDef;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class hook extends config {
    public static String url;
    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");

    @Before
    public void beforeEachTest(){
        if(Strings.isNullOrEmpty(envType)){

            envType = "qa";
        }
        if(Strings.isNullOrEmpty(browserType)){
            browserType = "ch";
        }
        driver = setupBrowser(browserType);
        switch (envType){
            case "qa":
                url = "https://qa.taltektc.com";
                STUDENT_EMAIL = "nahid@gmail.com";
                STUDENT_PASSWORD = "123456";
                STUDENT_INVALID_EMAIL ="nahid1@gmail.com";
                STUDENT_INVALID_PASSWORD ="1235555";
                break;
            case "stage":
                url = "https://stage.taltektc.com";
                STUDENT_EMAIL = "nahid@gmail.com";
                STUDENT_PASSWORD = "123456";
                STUDENT_INVALID_EMAIL ="nahid1@gmail.com";
                STUDENT_INVALID_PASSWORD ="1235555";
                break;
            case "prod":
                url = "https://prod.taltektc.com";
                break;
        }
        driver.get(url);

    }

    @After
    public void afterEachTest(){
        driver.quit();
//         close browser
//         quite browser
//         take screenshot if test steps or case fail
//         close db connection
    }





}
