package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidCloud implements IDevice{
    String userName ="adrinthompson_qgBGpZ";
    String accessKey ="PsKzmJA1T4az2YHL6vdT";


    @Override
    public AppiumDriver createDriver() {
        DesiredCapabilities options = new DesiredCapabilities();
        options.setCapability("appium:app", "bs://67fd1f2ba65c6f15f3796498bf288acb61004554");
        options.setCapability("appium:deviceName", "Samsung Galaxy S22 Ultra");
        options.setCapability("appium:platformVersion", "12.0");
        AppiumDriver driver = null;
        try {
            driver = new AndroidDriver(new URL(String.format("https://%s:%s@hub.browserstack.com/wd/hub", userName , accessKey)), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}
