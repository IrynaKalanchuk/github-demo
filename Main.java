package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String season;
        System.out.println("Enter any month from jan to dec");
        Scanner s = new Scanner(System.in);
        String month = s.nextLine().toLowerCase();
        boolean isDefault = false;
        switch (month)
        {
            case "dec":
            case "jan":
            case "feb":
                season = "winter";
                break;
            case "mar":
            case "apr":
            case "may":
                season = "spring";
                break;
            case "jun":
            case "jul":
            case "aug":
                season = "summer";
                break;
            case "sep":
            case "oct":
            case "nov":
                season = "autumn";
                break;
            default:
                isDefault = true;
                season = "There is no such month";
        }
        System.out.println(isDefault ? season : "It's "+ season + " now!");

    }
}
