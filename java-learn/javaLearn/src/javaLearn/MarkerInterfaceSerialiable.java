package javaLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//serializable
class save implements Serializable{
	int i;
}
public class MarkerInterfaceSerialiable {
	public static void main(String[] args) throws Exception {
		save obj1=new save();
		obj1.i=10;
		System.out.println(obj1.i);
		
		File f=new File("myfile.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		save obj2=(save) ois.readObject();
		
		System.out.println(obj2.i);
	}
}
