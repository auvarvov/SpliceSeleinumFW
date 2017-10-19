package cloud.ui;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by auvarov on 10/11/17.
 */
public class Utils {


    public static void takeScreensht(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM_dd_yyyy_h_mm_ss_a");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate); // 12/01/2011 4:48:16 PM
        FileUtils.copyFile(scrFile, new File("test-output/" + formattedDate + "_screenshot.png"));
    }



}
