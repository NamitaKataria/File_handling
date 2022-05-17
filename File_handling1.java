package com.simlilearn2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class File_handling1 {
	public static void main(String[]args) throws FileNotFoundException {
		
	
	try {//to write text in file
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text for File ");
		   String data = sc.nextLine();
		   Files.write(Paths.get("D://test1.txt"), data.getBytes());
		   sc.close();
           System.out.println("Successfully written.");
       }
	catch(IOException e) {
		System.out.println("An error has occurred.");
        e.printStackTrace();

}
	
	}// to read the file
  public static List<String> readFileInList(String fileName) 
  { 
	  //if(user_i.equalsIgnoreCase("r")) {
	  Scanner Reader = new Scanner(System.in);
	    while (Reader.hasNextLine()) {
	   String data = Reader.nextLine();
	  System.out.println(data);
	    }
			System.out.println("You Enter R for Reading");
			 List l =read_file("D://test1.txt"); 
			
			 Iterator<String> itr = l.iterator(); 
			    while (itr.hasNext()) {
			      System.out.println(itr.next()); 
			    }
    List<String> lines = Collections.emptyList(); //creates an empty list
    try
    { 
      lines = 
       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
    } 
  
    catch (IOException e) 
    { 
      e.printStackTrace(); 
    } 
    return lines; 
  } 
 
    private static List read_file(String string) {
	// TODO Auto-generated method stub
	return null;
}

	List l = readFileInList("D://testFile3.txt"); 
  
    Iterator<String> itr = l.iterator(); 
    while (itr.hasNext()) 
      System.out.println(itr.next()); 
  } 
}

Reader.close();
	
	}


	
}