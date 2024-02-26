package Weekly_Assignment.fileComparator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose file type");
        System.out.println("0.exit");
        System.out.println("1. Text");
        System.out.println("2. CSV ");
        System.out.println("3. Excel");
//        System.out.println("4. xml ");
//        System.out.println("5. json");
        int filetype = sc.nextInt();
        sc.nextLine();
        if(filetype==0)
        {
            return;
        }
        switch (filetype)
        {
            case 1:
            {
                compareTextFiles(sc);
                break;
            }
            case 2:
            {

                compareCSVFiles(sc);
                break;
            }
            case 3:
            {
                compareExcelFiles(sc);
                break;
            }
//            case 4:
//            {
//                break;
//            }
//            case 5:
//            {
//                break;
//            }
            default:
            {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
    private static void compareTextFiles(Scanner sc) {
        System.out.println("Enter the location of file1:");
        String file1 = sc.nextLine();
        System.out.println("Enter the location of file2:");
        String file2 = sc.nextLine();

        Text_File_comparator comparator = new Text_File_comparator();
        try {
            boolean areEqual = comparator.comparefiles(file1, file2);
            if (areEqual) {
                System.out.println("Files are equal.");
            } else {
                System.out.println("Files are different.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void compareCSVFiles(Scanner sc) {
        System.out.println("Enter the location of file1:");
        String file1 = sc.nextLine();
        System.out.println("Enter the location of file2:");
        String file2 = sc.nextLine();

        CSV_file_comparator comparator = new CSV_file_comparator();
        try {
            boolean areEqual = comparator.comparefiles(file1, file2);
            if (areEqual) {
                System.out.println("Files are equal.");
            } else {
                System.out.println("Files are different.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void compareExcelFiles(Scanner sc) {
        System.out.println("Enter the location of file1:");
        String file1 = sc.nextLine();
        System.out.println("Enter the location of file2:");
        String file2 = sc.nextLine();

        ExcelComparator comparator = new ExcelComparator();
        try {
            boolean areEqual = comparator.comparefiles(file1, file2);
            if (areEqual) {
                System.out.println("Files are equal.");
            } else {
                System.out.println("Files are different.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}