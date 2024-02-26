package Weekly_Assignment.fileComparator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text_File_comparator extends file_comparator
{
    @Override
    public boolean comparefiles(String file1, String file2) throws IOException {
        FileReader fileread1 = new FileReader(file1);
        BufferedReader reader1 = new BufferedReader(fileread1);
        FileReader fileread2 = new FileReader(file2);
        BufferedReader reader2 = new BufferedReader(fileread2);
        String line1 , line2;// read the lines from the two files
        boolean areEqual = true;
        int lineNum = 1;
        while((line1 = reader1.readLine())!=null && (line2 = reader2.readLine())!=null)
        {
            // if lines are not equal print the difference
            if(!line1.equals(line2))
            {
                System.out.println("difference at line" + lineNum + " : ");
                System.out.println("file 1: " + line1);
                System.out.println("file 2: " + line2);
                areEqual = false;// mark files as different
            }
            lineNum++;
        }
        reader1.close();
        reader2.close();
        return areEqual;//return whether files are equal or not
    }
}