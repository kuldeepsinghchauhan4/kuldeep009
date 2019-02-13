package com.cg.pak8.bean;
import java.io.*;
public class FileProg {
	public static void main(String[] args) {
		
		CopyDataThread s=null;
     try {
		 s=new CopyDataThread(new FileReader("C:\\Users\\KSINGHCH\\Documents\\input.txt"),new FileWriter("C:\\Users\\KSINGHCH\\Documents\\output.txt"));
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
     s.start();
}
}
