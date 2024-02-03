package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public  class login_step extends config {
    @Given("Student at talenTEK Homepage")
    public void studentAtTalenTEKHomepage() {

    }

    @And("Student enter their valid email address")
    public void studentEnterTheirValidEmailAddress(){
        driver.findElement(By.name("email")).sendKeys(STUDENT_EMAIL);


    }



@And("Student enter their valid password")
    public void studentEnterTheirValidPassword() {
        driver.findElement(By.name("password")).sendKeys(STUDENT_PASSWORD);

    }

    @When("student click on login button")
    public void studentClickOnLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/input")).click();

    }


    @Then("Student should be successfully logged")
    public void studentShouldBeSuccessfullyLogged() {
        String businessAct = "Student Information";
        String developerCodeExp = driver.findElement(By.xpath("//*[@id=\"wrap\"]/div/div/div[1]/h2")).getText();
        Assert.assertEquals(businessAct, developerCodeExp);

    }

    @And("Student enter their invalid email address.")
    public void studentEnterTheirInvalidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys(STUDENT_INVALID_EMAIL);

    }


    @Then("Student should get an error message for entering invalid email.")
    public void studentShouldGetAnErrorMessageForEnteringInvalidEmail() {
        String actual1 = "Invalid email address";
       String expected1 = driver.findElement(By.xpath("//*[@id=\"error-msg\"]")).getText();
        Assert.assertEquals(actual1,expected1);
    }


    @And("Student enter their invalid password.")
    public void studentEnterTheirInvalidPassword() {
        driver.findElement(By.name("password")).sendKeys(STUDENT_INVALID_PASSWORD);
    }

    @When("When student click on login button.")
    public void whenStudentClickOnLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/input")).click();
    }

    @Then("Student should get an error message for entering invalid password.")
    public void studentShouldGetAnErrorMessageForEnteringInvalidPassword() {
        String actual2 = "InIncorrect email or password";
        String expected2 = driver.findElement(By.xpath("//*[@id=\"error-msg\"]")).getText();
        Assert.assertEquals(actual2,expected2);
    }

    @Then("Student should get an error message for entering invalid credentials.")
    public void studentShouldGetAnErrorMessageForEnteringInvalidCredentials() {
        String actual3 = "Invalid email address";
        String expected3 = driver.findElement(By.xpath("//*[@id=\"error-msg\"]")).getText();
        Assert.assertEquals(actual3,expected3);
    }
}
