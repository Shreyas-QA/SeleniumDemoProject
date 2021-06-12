package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class config {

	private String url;
	private String chromedriver;

	public void readConfigSetting() {

		try {

			File src = new File(
					"/Users/shreyassambare/eclipse-workspace/Test.MyDemoProject/Configuration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			Properties ps = new Properties();
			ps.load(fis);
			SetChromePath(ps.getProperty("chromedriver"));
			Seturl(ps.getProperty("url"));

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public String Geturl() {

		return url;

	}

	public void Seturl(String url) {

		this.url = url;
	}

	public String GetChromePath() {

		return chromedriver;

	}

	public void SetChromePath(String chromedriver) {

		this.chromedriver = chromedriver;
	}

}