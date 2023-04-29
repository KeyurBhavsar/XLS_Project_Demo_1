package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f = new FileInputStream("D:\\Selenium_Workspace\\XLS_Project_2\\prop.properties"); ;
		Properties prop = new Properties();
		prop.load(f);

		String s=prop.getProperty("browser");
		System.out.println(s);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("incorrectemail"));
		System.out.println(prop.getProperty("correctemail"));
		System.out.println(prop.getProperty("url"));
	
		prop.setProperty("testing", "Automation");
		System.out.println(prop.getProperty("testing"));
		
		prop.setProperty("tool", "selenium");
		System.out.println(prop.getProperty("tool"));
		
		FileOutputStream fo = new FileOutputStream("D:\\Selenium_Workspace\\XLS_Project_2\\prop.properties");
		prop.store(fo, "Adding to Properties File");
		
		
	}

}
