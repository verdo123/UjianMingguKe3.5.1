package com.juaracoding.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {

    @Override
    public WebDriver setStrategy() {
        String path2 = "C:\\Users\\Personal\\IdeaProjects\\UjianMingguKe3.5\\chromedriver-win64\\chromedriver.exe";
        String url = "https://shop.demoqa.com/";
        System.setProperty("webdriver.chrome.driver", path2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtention",false);
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);

    }
}
