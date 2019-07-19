package com.yun.sample;
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;
      //test
      try {
         //in = new FileInputStream(".\\input.txt");
         
         in = new FileInputStream("C:\\Student\\Programs\\input.txt");
         
         out = new FileOutputStream("C:\\Student\\Programs\\output.txt");
         
         int c;
         System.out.println("input loaded");
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }
      catch(IOException ex){
    	  ex.printStackTrace();
      }
      finally {
    	  try{
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
    	  }
    	  catch(Exception ex){}
      }
   
   System.out.println("output loaded");
   }
}