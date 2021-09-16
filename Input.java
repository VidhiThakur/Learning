package BioScheduler;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.Gson;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Input {
    public void getInput() {
//
//        try
//        {
//            File file = new File("/home/vidhi/IdeaProjects/BioTa/src/ClassSlots.xlsx");   //creating a new file instance
//            FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file
////creating Workbook instance that refers to .xlsx file
//            XSSFWorkbook wb = new XSSFWorkbook(fis);
//            XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
//            Iterator<Row> itr = sheet.iterator();//iterating over Excel file-
//            ArrayList<ClassSlots> classSlots= new ArrayList<>();
//            while (itr.hasNext())
//            {
//                Row row = itr.next();
//                //System.out.println(row.toString());
//                Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
//                ClassSlots singleClassSlot=new ClassSlots();// one row begins
//                ArrayList<String> timeSlots=new ArrayList<>();
//                while (cellIterator.hasNext())
//                {
//                    Cell cell = cellIterator.next();
//                    switch (cell.getStringCellValue().trim()) {
//                        case "Monday" -> singleClassSlot.setDay(ClassSlots.Days.MONDAY);
//                        case "Tuesday" -> singleClassSlot.setDay(ClassSlots.Days.TUESDAY);
//                        case "Wednesday" -> singleClassSlot.setDay(ClassSlots.Days.WEDNESDAY);
//                        case "Thursday" -> singleClassSlot.setDay(ClassSlots.Days.THURSDAY);
//                        case "Friday" -> singleClassSlot.setDay(ClassSlots.Days.FRIDAY);
//
//                    }
//
//                    switch (cell.getStringCellValue().trim()) {
//
//                        case "8-10" :
//                            timeSlots.add("8-10");
//                            break;
//                        case "10-12" :
//                            timeSlots.add("10-12");
//                            break;
//                        case "12-2" :
//                            timeSlots.add("12-2");
//                            break;
//                        case "2-4" :
//                            timeSlots.add("2-4");
//                            break;
//
//                    }
//
//                }
//                singleClassSlot.setTimeSlot(timeSlots);
//                classSlots.add(singleClassSlot);
//
//            }
//            System.out.println(classSlots);
//
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }

        try{
            try (Reader reader = new FileReader("/home/vidhi/IdeaProjects/BioTa/ClassSlots")) {
                Gson gson = new Gson();
                ClassSlots[] classSlots = gson.fromJson(reader, ClassSlots[].class);
                System.out.println(classSlots);
            }
        }
        catch(Exception e)
        {

        }

        try {
            try (Reader reader = new FileReader("/home/vidhi/IdeaProjects/BioTa/PreferenceList")) {
                Gson gson = new Gson();
                InstructorPreference[] features = gson.fromJson(reader, InstructorPreference[].class);
            }
        }
        catch (Exception e)
        {

        }
        try {
            try (Reader reader = new FileReader("/home/vidhi/IdeaProjects/BioTa/NumberOfClassesPerInstructor")) {
                Gson gson = new Gson();
                InstructorPreference.NoOfClassesPerInstructor[] instructorNoOfClasses = gson.fromJson(reader, InstructorPreference.NoOfClassesPerInstructor[].class);
                System.out.println(instructorNoOfClasses);
            }
        }
        catch (Exception e)
        {

        }

    }
}
