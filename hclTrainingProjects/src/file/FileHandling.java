package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandling {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = new Employee("admin", "admin@mail.com", "Sacramento");
		System.out.println(employee);
		
		FileOutputStream fout = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
	
		oos.writeObject(employee);
		
		fout.close();
		oos.close();
		
		FileInputStream fis = new FileInputStream("data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee em = (Employee) ois.readObject();
		System.out.println(em);
		
		fis.close();
		ois.close();
		
		/*BufferedReader buffrd = new BufferedReader(new FileReader(args[0]));
		String s;
		//buffrd.readLine();
		
		while(((s=buffrd.readLine()) != null)) {
			String str[] = s.split(",");
			Employee emp = new Employee(str[0], str[1], str[2]);
			System.out.println(emp);
		}
		
		buffrd.close();*/
	}
}

