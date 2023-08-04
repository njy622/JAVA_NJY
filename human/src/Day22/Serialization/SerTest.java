package Day22.Serialization;

import java.util.*;
import java.io.*;

public class SerTest {
	public static void main(String[] args) {
		Employee p = new Employee("남지영", "청주", "111111-1111111", "123-4567");
		Employee p2 = new Employee("송민우", "진천", "333333-3333333", "984-6532");
		
		ArrayList list = new ArrayList();
		list.add(p);
		list.add(p2);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream (new File("d:\\temp\\serial.ser")));
			oos.writeObject(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
