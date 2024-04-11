package GoibiboUtil;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;



public class FetchGoibiboCredFromExcel_01 {
	
	 public static String un;
	 public static String pasword;
	 public static String inpsw;
	 //public static String invun;
	
	public static void fetchGoibiboCred() throws EncryptedDocumentException, IOException {
		FileInputStream ref=new FileInputStream("D:\\prgm\\GoibiboPrj02\\GoibiboTestData\\AmirTest.xlsx");
		//FileInputStream ref=new FileInputStream("D:\\prgm\\AmazonMavenPOMPrj01\\AmazonMavenPOMPrj1TestData\\AmirTest.xlsx");
		Workbook wb=WorkbookFactory.create(ref);
		un=NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(2).getCell(0).getNumericCellValue());
		
		
		pasword=wb.getSheet("LoginDetails").getRow(2).getCell(1).getStringCellValue();
		inpsw=wb.getSheet("LoginDetails").getRow(3).getCell(1).getStringCellValue();
		
	
		
		
	}
	
//public static void fetchAmzonInvCred() throws EncryptedDocumentException, IOException {
//		
//		FileInputStream ref=new FileInputStream("D:\\prgm\\AmazonMavenPOMPrj01\\AmazonMavenPOMPrj1TestData\\AmirTestInvCred.xlsx");
//		Workbook wb=WorkbookFactory.create(ref);
//		invun=NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(1).getCell(0).getNumericCellValue());
//		inpsw=wb.getSheet("LoginDetails").getRow(1).getCell(1).getStringCellValue();
//		
//		
//	}

}
