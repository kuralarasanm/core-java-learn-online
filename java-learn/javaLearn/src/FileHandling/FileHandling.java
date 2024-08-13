package FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File obj=new File("demo.txt");
		
//		1.creation of a file
		if(obj.createNewFile()) {
			System.out.println("file created "+obj.getName());
		}else {
			System.out.println("Already present "+obj.getName());
		}
		
		//2.writing
		String ip[]= {
				"hi",
				"hello",
				"bye"
		};
		FileOutputStream fos=new FileOutputStream(obj);
		DataOutputStream dos=new DataOutputStream(fos);
//		dos.writeUTF("Hello world");
		for(String str:ip) {
			dos.writeUTF(str);
		}
		//3.append
		dos.writeUTF("Hello world");
		
		//4.readUTF
		FileInputStream fis=new FileInputStream(obj);
		DataInputStream dis=new DataInputStream(fis);
		while(dis.available()>0) {
			String line=dis.readUTF();
			System.out.println(line);
		}
		
		if(obj.exists()) {
			System.out.println("file name = "+obj.getName());
			System.out.println("path = "+obj.getAbsolutePath());
			System.out.println("Read? "+obj.canRead());
			System.out.println("write? "+obj.canWrite());
			System.out.println("size "+obj.length());
		}else {
			System.out.println("no file exists");
		}
		System.out.println("message written successfully");
		
		//delete
//		obj.delete();
		
		dos.close();
		dis.close();
	}
}
