package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// create new text file 
		File f= new File("D:\\Selenium_Workspace\\XLS_Project_2\\testing\\temp.txt");  // Ahiya address ma \\ doulble j add karvu pade 6 otherwise aa error batave 6 
		f.createNewFile(); // after this create new text file
		
		// write into text file
		FileWriter w=new FileWriter(f);
		BufferedWriter out=new BufferedWriter(w);
		
		out.write("This is 1st Line");
		out.newLine();
		out.write("This is 2nd Line");
		out.newLine();
		out.write("This is 3rd Line");
		out.newLine();
		out.write("This is 4th Line");
		out.newLine();
		
		// This command put our text into text file 
		out.flush();
		
		// part2- Read Text File 
		FileReader r=new FileReader(f);
		BufferedReader rd = new BufferedReader(r);	
				
		// whenever you  add rd.readLine() its read the line and set pointer to next line 
		
		/*
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());	
		*/
		// while loop print the lines
		String s;	
		int i=0;
		while((s=rd.readLine())!=null)
		{
			System.out.println(s);	
			i++;
		}
	}	
		
} 




/*// Sir notes
String s;
int i=0;
while((s=rd.readLine())!=null) {
	System.out.println(s);
	i++;
}

System.out.println("number of lines: "+i);
	
*/		
		

/*
 * System.out.println(d.getCellData("Data1", "Name", 3));
		String correctEmail = d.getCellData("Data1", 1, 2);
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data1", "Browser", 2);
		System.out.println(browser);
		
		
		System.out.println(d.getRowCount("Data1")); //7
		System.out.println(d.getColumnCount("Data1"));//7 
		 
		
		d.setCellData("Data1", "Name", 11, "testing11");
		System.out.println(d.getCellData("Data1", "Name", 11));//testing11
		System.out.println(d.getRowCount("Data1")); //11
		 
		d.addColumn("Data1", "Nikul");
		System.out.println(d.getColumnCount("Data1"));//8
*/
