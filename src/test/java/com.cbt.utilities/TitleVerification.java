package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class TitleVerification {
    public static void main(String[] args) {

        String[] arr = {"http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login"};
        ArrayList<String> urls = new ArrayList<>(Arrays.asList(arr));


        WebDriver ChromeDriver = BrowserFactory.getDriver("Chrome");
        String expectedTitle = "Practice";
        String expectedURL = "http://practice.cybertekschool.com";
        int i = 1;
        for (String each : urls){

            System.out.println("Test --> Page "+ i);
            i++;

            ChromeDriver.get(each);
            Hold.wait(0);
            //System.out.println("====================\nTITLE Tests");
            //4.Visit all the websitesfrom step 3and verify that they all have the same title.
            String actualTitle = ChromeDriver.getTitle();
            System.out.println("TITLE Test: "+ChromeDriver.getCurrentUrl() +" "+ (actualTitle.equalsIgnoreCase(ChromeDriver.getTitle()) ? "\t:\tSame Title": "\t:\tDifferent Title"));

            //System.out.println("====================\nURL Tests");
            //5.Verify that all URLsof all pages start with http://practice.cybertekschool.com.
            String currentUrl = ChromeDriver.getCurrentUrl();
            System.out.println("URL Test: "+(currentUrl.startsWith(expectedURL)? "URL starts with "+expectedURL : "URL is different : "+currentUrl));


        }
        //6.Close the browser at the end of the test.
        ChromeDriver.close();



    }
}
