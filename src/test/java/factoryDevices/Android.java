package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice{

    @Override
    public AppiumDriver createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", "Nombre de tu dispositivo virtual o fisico");
        capabilities.setCapability("appium:platformVersion", "15.0");
        capabilities.setCapability("appium:appPackage", "Direccion del package de tu app");
        capabilities.setCapability("appium:appActivity", "La actividad de tu app en la pantalla en la que estas");
        capabilities.setCapability("platformName","Android"); // que dispositivo utilizaras
        capabilities.setCapability("appium:automationName","uiautomator2");
        AppiumDriver driver = null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}