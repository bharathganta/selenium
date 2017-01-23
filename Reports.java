package GenrickLibs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Reports {
	
		public void getScreenShot(String fileName) throws IOException{
			EventFiringWebDriver edriver=new EventFiringWebDriver(Driver.driver);
			File srcImg=edriver.getScreenshotAs(OutputType.FILE);
			File dst=new File("E:\\MGlobally\\screenShots\\"+fileName+".png");
			FileUtils.copyFile(srcImg,dst);
			
		}

	}



