package com.simlilearn2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;



public class File_1 {
	public static void main(String[]args) throws FileNotFoundException {
	
		
		try {//to write in file
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Text for File ");
			   String data = sc.nextLine();
			
           // FileWriter Writer
            //    = new FileWriter("myfile.txt");
            Files.write(Paths.get("D://test1.txt"), data.getBytes()); 

          //  Writer.write(
           //     "Files in Java are seriously good!!");
            sc.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();

	}
	//File Obj = new File("myfile.txt");
	Scanner Reader = new Scanner(System.in);
         while (Reader.hasNextLine()) {
	    String data = Reader.nextLine();
	   System.out.println(data);
	}
	Reader.close();
		
}


private static void append_infile() throws IOException {        // this is use for append 
	  Scanner sc = new Scanner (System.in);
	 System.out.println("Enter Text for append ");
	   String appenddata  = sc.nextLine();
	
	List<String> lines = Arrays.asList(" ",appenddata);
	
	Files.write(Paths.get("D://myfile.txt"), lines,StandardCharsets.UTF_8 ,StandardOpenOption.APPEND);
	
	System.out.println("Append Successful");
}
}