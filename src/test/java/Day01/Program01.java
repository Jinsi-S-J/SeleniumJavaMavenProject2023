package Day01;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Program01 {

	public static void main(String[] args) {
		// How Reports are generated using Maven
		
		ExtentReports report = new ExtentReports(".\\src\\test\\resources\\report\\Feb14.html");
		ExtentTest test= report.startTest("TC01","Login with valid Username and password");
		test.log(LogStatus.INFO, "Open ChromeBrowser");
		test.log(LogStatus.INFO, "Open Application URL");
		test.log(LogStatus.INFO, "Enter the User Name in text box");
		test.log(LogStatus.INFO, "Enter the Password in text box");
		test.log(LogStatus.INFO, "Click Log-in");
		report.endTest(test);//saved testcases
		report.flush();//saved report
		

	}

}
