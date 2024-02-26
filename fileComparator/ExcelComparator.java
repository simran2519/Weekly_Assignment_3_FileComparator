package Weekly_Assignment.fileComparator;
import java.io.*;
public class ExcelComparator extends file_comparator
{

    public boolean comparefiles(String file1, String file2) throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));

        String line1, line2 = "";
        boolean areEqual = true;
        int lineNum = 1;

        while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
            if (!line1.equals(line2)) {
                System.out.println("Difference at line " + lineNum + ":");
                System.out.println("File 1: " + line1);
                System.out.println("File 2: " + line2);
                areEqual = false;
            }
            lineNum++;
        }

        // Check if one file has more lines than the other
        if(line1 != null || line2 != null)
        {
            System.out.println("Files have different number of lines.");
            areEqual = false;
        }
        reader1.close();
        reader2.close();

        return areEqual;
    }

}