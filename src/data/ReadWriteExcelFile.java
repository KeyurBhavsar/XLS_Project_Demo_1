package data;

import utilities.Xls_Reader;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Xls_Reader d= new Xls_Reader("D:\\testing\\wetransfer_build-xml_2022-08-07_1444\\NikulTest.xlsx");
		
	
		Xls_Reader d=new Xls_Reader("D:\\testing\\NikulTest.xlsx");
		
		String emailwithSpecChar=d.getCellData("Data1", "UserName", 4);
		String wrongEmail= d.getCellData("Data1", "UserName", 3);
		String wrongPassword=d.getCellData("Data1", "Password", 2);
		String specialCharExErr=d.getCellData("Data1", "Email Error",5);
		String emptyEmailExErr=d.getCellData("Data1", "Email Error", 4);
		String emptyPasswordExErr=d.getCellData("Data1", "Password Error", 2);
		String globalErr=d.getCellData("Data1", "Global Error", 2);
		
		System.out.println(emailwithSpecChar);
		System.out.println(wrongEmail);
		System.out.println(wrongPassword);
		System.out.println(specialCharExErr);
		System.out.println(emptyEmailExErr);
		System.out.println(emptyPasswordExErr);
		System.out.println(globalErr);
		
	}
}
		
		/* THis is Old FILE CODE
		 	System.out.println(d.getCellData("Data1", "Name", 3));
		String correctEmail =d.getCellData("Data1",1,2);
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data", "Browser", 2);
		System.out.println(browser);

		System.out.println(d.getRowCount("Data1")); // 7
		System.out.println(d.getColumnCount("Data1"));// 7
		
		d.setCellData("Data", "Name", 11, "testing11");
		System.out.println(d.getCellData("Data1","Name", 11));
		System.out.println(d.getRowCount("Data1"));
		
		d.addColumn("Data1", "Nikul");
		System.out.println(d.getColumnCount("Data1")); // 	
	*/
		
		
