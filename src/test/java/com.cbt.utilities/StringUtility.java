package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String actualResult, String expectedResult){

        if (expectedResult.equalsIgnoreCase(actualResult)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test fail");
            System.out.println("expectedResult : "+expectedResult );
            System.out.println("actualResult : "+actualResult);
        }
    }

}
