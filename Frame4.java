import java.io.File;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Frame4{
	JFrame fr;
	JButton b;
	String[][] questions = new String[10][6];
	Frame4() throws IOException{
		String excelFilePath = "./Book1.xlsx/";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();
        boolean hasNext = iterator.hasNext();
        int j=0;
        for(int k=0;k<10;k++) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            String[] arr = new String[6];
            int i =0;
            for(int p=0;p<6;p++) {
            	Cell cell = cellIterator.next();
            	CellType celltype = null;
            	arr[p] = cell.getStringCellValue();
            }
            questions[j] = arr;
            j++;
        }   
        inputStream.close();
        workbook.close();}
		
	}
	
