package org.TestNg.Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PracticeTest4 {

	public static void main(String[] args) throws MalformedURLException {
URL url=new URL("http:/localhost:5555/wd/hub");
DesiredCapabilities cp=new DesiredCapabilities();
cp.setBrowserName("firefox");
cp.setPlatform(Platform.WINDOWS);
RemoteWebDriver driver=new RemoteWebDriver(url,cp);
driver.get("https://gmail.com");
	}

}
