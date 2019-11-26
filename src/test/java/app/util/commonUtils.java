//call Property file and set capabilities according to corresponding platform

package app.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class commonUtils {
	private static Properties prop = new Properties();
	public static String APPLICATION_NAME;
	public static String BASE_PKG;
	public static String APP_ACTIVITY;
	private static String APPIUM_PORT;
	public static String PLATFORM_NAME;
	public static String DEVICE_NAME;
	public static String APPLICATION_APP;
	public static String APP;
	public static String UDID;
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	private static URL serverUrl;
	private static AppiumDriver driver;	

public static void loadAndroidConfigProp(String propertyFileName) throws IOException
{
	FileInputStream propFile = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+propertyFileName);
	prop.load(propFile);
	BASE_PKG = prop.getProperty("base.pkg");
	APP_ACTIVITY = prop.getProperty("application.activity");
	APPIUM_PORT = prop.getProperty("appium.server.port");
	DEVICE_NAME=prop.getProperty("device.name");
    PLATFORM_NAME = prop.getProperty("platform.name");

}

public static void setAndroidCapabilities() {
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,commonUtils.PLATFORM_NAME);
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,commonUtils.DEVICE_NAME);
	capabilities.setCapability("appPackage", commonUtils.BASE_PKG);
	capabilities.setCapability("appActivity", commonUtils.APP_ACTIVITY);
}


public static AppiumDriver getAndroidDriver() throws MalformedURLException {
	serverUrl = new URL("http://localhost:" + APPIUM_PORT + "/wd/hub");		
	driver = new AndroidDriver(serverUrl, capabilities);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return driver;
}
}
