package file_Crud;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
public class crud_operation1 {
	//1
	static void Add_File()
	{
		
		try {
			  
            // Creating BufferedReadered object
           BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
  
            // Reading File name
            String strName = br.readLine();
            System.out.println("Enter the file path:");
  
            // Reading File Path
            String strPath = br.readLine();
  
            // Creating File Object
            File myFile = new File(strPath, strName);
            try
            {
            	FileOutputStream fStream = new FileOutputStream(myFile);
               DataOutputStream data = new DataOutputStream(fStream);
            
            System.out.println("file added successfully");
            }
            catch (Exception ex1) {

                System.out.println("file is not added successfully");
            }
		}
        // Try-Catch Block
        catch (Exception ex1) {

            System.out.println("file is not added successfully");
        }}
	//2
		  static void adding_data () throws IOException
		  {
			  
				FileWriter fw=new FileWriter("F:\\\\files\\\\simplelearn.text");
				BufferedWriter b=new BufferedWriter(fw);
				b.write("I am adding my first comments");
				System.out.println("Comments added successfully.");
				b.close();
				fw.close();
		   }
		  //3
			static void Search_File()
			{
				class MyFilenameFilter implements FilenameFilter {
				    
				    String initials;
				    
				    // constructor to initialize object
				    public MyFilenameFilter(String initials)
				    {
				        this.initials = initials;
				    }
				    
				    // overriding the accept method of FilenameFilter
				    // interface
				    public boolean accept(File dir, String name)
				    {
				        return name.startsWith(initials);
				    }
				}
				try
				{
				BufferedReader br = new BufferedReader(
		                new InputStreamReader(System.in));
		            System.out.println("Enter the file name:");
		  
		            // Reading File name
		            String strName = br.readLine();
		            System.out.println("Enter the file path:");
		  
		            // Reading File Path
		            String strPath = br.readLine();
		        File directory = new File(strPath);
		  
		        // Create an object of Class MyFilenameFilter
		        // Constructor with name of file which is being
		        // searched
		        MyFilenameFilter filter
		            = new MyFilenameFilter(strName);
		  
		        // store all names with same name 
		        // with/without extension
		        String[] flist = directory.list(filter);
		  
		        // Empty array
		        if (flist.length == 0) 
		        {
		            System.out.println(
		                "Empty directory or file does not exists.");
		        }
		        else {
		  
		            // Print all files with same name in directory
		            // as provided in object of MyFilenameFilter
		            // class
		            for (int i = 0; i < flist.length; i++) {
		                System.out.println(flist[i]+" found");
		            }
		        }
				}
		        catch (Exception ex1) {

		            System.out.println("file is not added successfully");
		        }
				
			}
			
	//4
			static void Delete_File()
			{
				try (Scanner userInputScanner2 = new Scanner (System.in)) {
					System.out.println("Enter the file name:");
					String strName = userInputScanner2.nextLine();
					// Reading File name
					//String strName = br.readLine();
					System.out.println("Enter the file path:");
					String path = userInputScanner2.nextLine();
					path = path + "\\" + strName;
					try {
					    Files.deleteIfExists(Paths.get(path));
					    System.out.println("file Deleted successfully.");
					}
					catch (NoSuchFileException e) {
					    System.out.println(
					        "No such file/directory exists");
					}
					catch (DirectoryNotEmptyException e) {
					    System.out.println("Directory is not empty.");
					}
					catch (IOException e) {
					    System.out.println("Invalid permissions.");
					}
				}
		 
		        
		    }		
	public static void main(String[] args) throws IOException
    {
		try (Scanner userInputScanner = new Scanner (System.in)) {
			System.out.println ("Please select a options:-");
			System.out.println ("1. Press one to Add file");
			System.out.println ("2. Press two to add data into file");
			System.out.println ("3. Press three to  search file");
			System.out.println ("4. Press four to delete file");
			int input = userInputScanner.nextInt();

			switch (input) {
			    case 1:
			    	
			    	Add_File();
			        break;
			    case 2:
			    	adding_data();
			    	break;
			    	
			    case 3:
			    	Search_File();
			       
			        break;
			    case 4: 
			    	Delete_File();
			    	 //obj.File_List(path);
			        break; 
			
			
   }
		}
    }
	
}
