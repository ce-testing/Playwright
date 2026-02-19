package org.example.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;

import java.util.ArrayList;
import java.util.List;

public class CustomOptions implements OptionsFactory {

    public Options getOptions() {
        return new Options()
                .setLaunchOptions(createLaunchOptions()) //launch options
                .setContextOptions(createContextOptions()) //context options
                .setHeadless(Boolean.parseBoolean(Config.get("headless")))  //para que se renderice el browser
                .setBrowserName(Config.get("browser"))  //chromium, firefox, webkit
                .setChannel(Config.get("channel"))  // chrome o edge
                .setTestIdAttribute(Config.get("test.id"))
                .setBaseUrl(Config.get("base.url"));
    }
    //Opciones del Browser Context
    private Browser.NewContextOptions createContextOptions() {
        return new Browser.NewContextOptions().setViewportSize(null);
    }

    //Opciones del Browser
    private BrowserType.LaunchOptions createLaunchOptions() {
        List<String> arguments =new ArrayList<>();
        arguments.add("--start-maximized");

        return new BrowserType
                .LaunchOptions()
                .setSlowMo(Integer.parseInt(Config.get("slow.mo")))
                .setArgs(arguments);
    }


}
