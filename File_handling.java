package com.simlilearn2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;


public class File_handling
{// to read write and append operation on file
	
public static void main(String[] args) throws IOException {
		
		while(true) {
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Operation like Write or Read or Append or Exit");
		
		
		String user_i=sc.next();
		
		File_handling fh=new File_handling();//object creation 
		
		if(user_i.equalsIgnoreCase("write")) {
			System.out.println("you select writing operation"); 
			
				fh.write_infile();
			}
	
		else if(user_i.equalsIgnoreCase("read")) {
			System.out.println("you enter read operation");
			fh.read_file("D://test1.txt"); 
			
			 
		}
		
		else if(user_i.equalsIgnoreCase("append")) {
			System.out.println("you enter append operation");
			fh.append_infile();
		}
		else if(user_i.equalsIgnoreCase("exit")) {
			System.out.println("you enter exit operation");
			break;
		}
		else {
			System.out.println("Please Enter Valid Charector");
		}
		
		
		}
		
	}
	
	  void read_file(String fileName) {   // this method for reading text from file
	  
	    List<String> lines = Collections.emptyList(); //creates an empty list
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      //e.printStackTrace();
	    	System.out.println("Enter a valid File mane . ERROR! ");
	    } 
	
	    Iterator<String> itr = lines.iterator(); 
	    while (itr.hasNext()) {
	      System.out.println(itr.next()); 
	    }
	  } 
	
	
	 private void write_infile()  throws IOException {  // this method used for writing in file
	
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Text for File ");
	   String data = sc.nextLine();
	   
	    Files.write(Paths.get("D://test1.txt"), data.getBytes()); 

	    System.out.println(" Writing Successful ");
	}
	
	
	 protected void append_infile() throws IOException {        // this is use for append 
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Text for append ");
		   String appenddata  = sc.nextLine();
		
		List<String> lines = Arrays.asList(" ",appenddata);
		
		Files.write(Paths.get("D://test1.txt"), lines,StandardCharsets.UTF_8 ,StandardOpenOption.APPEND);
		
		System.out.println("Append Successful");
	}
	
}