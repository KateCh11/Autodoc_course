package lesson18;

import org.testng.annotations.*;

public class FirstTestExample {

    @BeforeTest
    public void beforeTest(){
        System.out.println("This method will execute before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Execute before class once");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This method will execute before each method");
    }

    @Test(description = "this our first test", priority = 1, timeOut = 1, invocationCount = 4)
    public void testMethod() {
            System.out.println("Hello world");
    }

    @Test(alwaysRun = true, dependsOnMethods = "Test Method", priority = 2, dependsOnGroups = "someGroupe")
    public void testMethod2() {
        System.out.println("Hello world");
    }

    @Test(expectedExceptions = {ArithmeticException.class}) //в данной аннотации тест игнорирует ошибку
    public void testDivision() {
        System.out.println(2 / 0);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This method will execute after each method");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("Execute after class once");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This method will execute after test");
    }
}
