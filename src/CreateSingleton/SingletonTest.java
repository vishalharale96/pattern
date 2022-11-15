package CreateSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest {
	

	public static void main(String[] args) {
		
		try {
			
			Singleton instance1= Singleton.getSingletonObject();
			
			FileOutputStream fos=new FileOutputStream("C:/Users/Vishal Harale/Desktop/t.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(instance1);
			oos.close();
			
			FileInputStream fis=new FileInputStream("C:/Users/Vishal Harale/Desktop/t.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Singleton instance2=(Singleton) ois.readObject();
			ois.close();
			
			System.out.println(instance1.hashCode());
			System.out.println(instance2.hashCode());
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
			
	}
	
}
