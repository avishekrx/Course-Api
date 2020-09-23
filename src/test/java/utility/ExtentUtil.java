package utility;


public class ExtentUtil {
	
	
	public static String getReportConfigPath()
	{
		String reportConfigPath = "C:\\Users\\AGS-BLR-3\\Project\\course-api\\src\\test\\resources\\extent.properties";
		if(reportConfigPath!= null) 
			return reportConfigPath;
		else 
			throw new RuntimeException("Report Config Path not specified");		
	}

	public void test()
	{
		
	}
}
