package Activities;
//For this activity we will be using Excel to store data and Apache POI to retrieve that data.
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

class Activity15
{
    public static final String filename="MyExcel.xlsx";

    public static void main(String[] args)
    {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Data type in java");

        Object[][] datatypes=
                {
                        {"DataType","Type","SizeinByte"},
                        {"int","primitive",4},
                        {"float","primitive",4},
                        {"char","prmitive",1}
                };
        int rownum=0;

        for(Object[] datatype:datatypes)
        {
            Row row=sheet.createRow(rownum++);
            int column=0;
            for(Object data:datatype)
            {
                Cell cell=row.createCell(column++);
                if(data instanceof String)
                {
                    cell.setCellValue((String)data);
                } else if (data instanceof Integer)
                {
                    cell.setCellValue((Integer)data);

                }
            }
        }
        try
        {
            FileOutputStream out=new FileOutputStream(filename);
            workbook.write(out);
            workbook.close();
            out.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.print("Done");
    }
}
