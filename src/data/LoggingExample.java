package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this is my console for generating report so i can create a tool 
		// add log4j.properties 
		
		Logger print =Logger.getLogger("devpinoyLogger");
		print.debug("hello");
		print.debug("we are writing in to a log file");
		print.debug("staring the XYZ test case 1 ");
		print.debug("starting the abc in test case 2");
		
	}

}
