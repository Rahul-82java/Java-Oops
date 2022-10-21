package file_Crud;
import java.util.Scanner;
import java.io.IOException;

public class main_menu1 {
	public static void main (String[] args) throws IOException {
        try (Scanner userInputScanner = new Scanner (System.in)) {

System.out.println("   ************You have following options*************");
System.out.println("1. ***** Press one for ABOUT PRODUCT NAME**************");
System.out.println("2. Press two for getting file names in ascending order");
System.out.println("3. Press three for Adding file/Adding data to file"
					+"/Search a file/Delete");
System.out.println("4. Press four to close the application");
			    int input = userInputScanner.nextInt();

switch (input) {
			    case 1:

System.out.println("************************");
System.out.println("LOCKEDME.COM               ");
System.out.println("*******************************");
System.out.println("           DEVELOPED BY           ");
System.out.println("**************************************");
System.out.println("                      RAHUL CHAUHAN     "); 
System.out.println("********************************************");
                 break;
			    	
			        case 2:
			        	Scanner userInputScanner2 = new Scanner (System.in);
			        	System.out.println ("Please Enter the directory from where you want to get all files");
			            String path = userInputScanner2.nextLine();
			           // File_Read1 obj = new File_Read1();
			            File_Read1.File_List(path);
			            break;
			        case 3:
			        	//crud_operation1 obj2 = new crud_operation1();
			            crud_operation1.main(args);
			            break;
			        case 4: 
			        	System.out.println ("Thanks for visitinig.");
			            System.exit(0);
			            break; 
			    }
		}
    }
}

