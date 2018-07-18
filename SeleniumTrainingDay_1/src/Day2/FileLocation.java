package Day2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileLocation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file= new File("C://Users//bhavay.pant//Downloads//shortcuts.txt");
		
		file.createNewFile();
		
		FileInputStream inputstream= new FileInputStream(file);
		
		FileWriter flwrite= new FileWriter(file);
		
		BufferedWriter bufferwrite= new BufferedWriter(flwrite);
		
		bufferwrite.write("Hello!! All");
		
		String path= file.getAbsolutePath();
		
		String path1= file.getCanonicalPath();
		
		System.out.println(path);
		
		System.out.println(path1);
		
		bufferwrite.close();
		
		flwrite.close();

	}

}
