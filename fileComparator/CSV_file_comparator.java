package Weekly_Assignment.fileComparator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CSV_file_comparator extends file_comparator {
    public boolean comparefiles(String file1, String file2) throws IOException {
        FileReader fileread1 = new FileReader(file1);
        BufferedReader reader1 = new BufferedReader(fileread1);
        FileReader fileread2 = new FileReader(file2);
        BufferedReader reader2 = new BufferedReader(fileread2);
        String line1="", line2 ="";
        // read the lines from the two files
        //boolean areEqual = true;
        int lineNum = 1;
        try {
            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                String[] arr1 = line1.split(",");
                String[] arr2 = line2.split(",");
//                if (arr1.length != arr2.length) {
//                    System.out.println("length of file and file1 is differ");
//                    return false;
//                }
                if (!Arrays.equals(arr1, arr2)) { // Compare entire lines as arrays
                    System.out.println("Difference in line " + lineNum + ".");
                    System.out.println("File 1: " + line1);
                    System.out.println("File 2: " + line2);
                    return false;
                }
//                for (int i = 0; i < arr1.length; i++) {
//                    if (!arr1[i].equals(arr2[i])) {
//                        System.out.println("Difference in line" + lineNum + " , field" + (i + 1) + ".");
//                        System.out.println("file 1 :" + arr1[i]);
//                        System.out.println("file 2 :" + arr2[i]);
//                        return false;
//                    }
//                }
                lineNum++;
            }
            if (line1 != null || line2 != null) {
                System.out.println("CSV file have different number of lines");
                return false;
            }
        }
        finally
        {
            reader1.close();
            reader2.close();

        }
        System.out.println("files are identical");
        return true;
    }
}
