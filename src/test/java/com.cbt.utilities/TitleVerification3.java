package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");


        //3.Visit all websites one by one.
        int i = 1;


        for (String each : urls) {
            WebDriver ChromeDriver = BrowserFactory.getDriver("Chrome");
            System.out.println("Test --> Page " + i);
            i++;

            ChromeDriver.get(each);
            Hold.wait(1);
            //4.Verify that URLof the website contains the title of the website.Ignore spacesand casein comparison.
            String currentURL = ChromeDriver.getCurrentUrl();
            String currentTitle = ChromeDriver.getTitle();

            System.out.println((currentURL.contains(currentTitle) ? "Pass : Title is contained in the URL " + currentTitle : "Fail : Title is not contained in the URL " + currentTitle));
            //close browser
            ChromeDriver.close();
            Hold.wait(0);
        }

    }
}
