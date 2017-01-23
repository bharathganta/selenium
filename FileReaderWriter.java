package CoreJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	
	public  static void main(String args[]) throws IOException{
		
		
		String file="E:\\test\\file.txt";
		
	/* Reading Text From File */
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		boolean c;
		String a="";
		
		if((c=br.readLine()!=null)){
			a=br.readLine();
			System.out.println(a);
		}
		
	/* Reading perticular text from String */
		int b=a.indexOf("number");
		System.out.println(b+5);
		System.out.println(a.substring(b+6, b+16));
		
	/* Writing text onto File */
		
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(a.substring(b+6, b+16).trim());
		bw.close();
		
		
	}

}