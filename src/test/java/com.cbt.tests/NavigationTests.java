package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;


    /*
    1.Open browser
    2.Go to website https://google.com
    3.Save the title in a string variable
    4.Go to https://etsy.com
    5.Save the title in a string variable
    6.Navigate back to previous page
    7.Verify that title is same is in step 3
    8.Navigate forward to previous page
    9.Verify that title is same is in step 5
     */
public class NavigationTests {
    public static void main(String[] args) {



        //=========================================================
        // ------------------- CHROME TESTS -----------------------
        //=========================================================


        WebDriver chromeDriver = BrowserFactory.getDriver("chrome");
        chromeDriver.get("http://www.google.com");

        //3 get the title
        String googleTitle = chromeDriver.getTitle();
        //System.out.println(title);

        //4.Go to https://etsy.com
        chromeDriver.navigate().to("https://etsy.com");

        //5.Save the title in a string variable
        String etsyTitle = chromeDriver.getTitle();
        //System.out.println(etsyTitle);

        //6.Navigate back to previous page
        chromeDriver.navigate().back();

        System.out.println("Chrome TESTS");
        //7.Verify that title is same as in step 3
        if (googleTitle.equals("Google")){
            System.out.println("Google Title Test - Pass");
        }
        else System.out.println("Google Title Test - Fail");



        //8.Navigate forward to previous page
        chromeDriver.navigate().forward();

        //9.Verify that title is same is in step 5
        if (etsyTitle.equals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")){
            System.out.println("Etsy Title Test - Pass");
        }
        else System.out.println("Etsy Title Test - Fail");

        chromeDriver.close();



        //=========================================================
        // ------------------- FIREFOX TESTS ----------------------
        //=========================================================



        WebDriver firefoxDriver = BrowserFactory.getDriver("firefox");



        //2.Go to website https://google.com
        firefoxDriver.get("http://www.google.com");

        //3.Save the title in a string variable
        googleTitle = firefoxDriver.getTitle();

        //4.Go to https://etsy.com
        firefoxDriver.navigate().to("https://etsy.com");

        //5.Save the title in a string variable
        etsyTitle = firefoxDriver.getTitle();

        //6.Navigate back to previous page
        firefoxDriver.navigate().back();

        //7.Verify that title is same as in step 3
        System.out.println("FIREFOX TESTS");

        StringUtility.verifyEquals(googleTitle, "Google" );


        //8.Navigate forward to previous page
        firefoxDriver.navigate(). forward();


        //9.Verify that title is same is in step 5
        StringUtility.verifyEquals(etsyTitle, "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");

        firefoxDriver.close();


        //=========================================================
        // ------------------- SAFARI TESTS -----------------------
        //=========================================================



        WebDriver safariDriver =  BrowserFactory.getDriver("Safari");
        //2.Go to website https://google.com
        safariDriver.get("https://google.com");
        safariDriver.manage().window().maximize();


        //3.Save the title in a string variable
        googleTitle = safariDriver.getTitle();

        System.out.println("Safari TESTS");


        //4.Go to https://etsy.com
        safariDriver.navigate().to("https://etsy.com");

        //5.Save the title in a string variable
        etsyTitle = safariDriver.getTitle();

        //6.Navigate back to previous page
        safariDriver.navigate().back();

        //7.Verify that title is same is in step 3
        StringUtility.verifyEquals(googleTitle, "Google");


        //8.Navigate forward to previous page
        safariDriver.navigate().forward();

        //9.Verify that title is same is in step 5
        StringUtility.verifyEquals(etsyTitle, "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");


        safariDriver.close();






    }
}
