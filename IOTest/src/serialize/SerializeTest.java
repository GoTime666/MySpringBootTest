package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.Test;

import bean.User;

public class SerializeTest {
	
	//对象序列化存到文件
		@Test
		public void writeObj() throws IOException {
			FileOutputStream fos = new FileOutputStream("src\\tempfile\\obj.object");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new User("杨会君", 9, "男", "123445566"));
			oos.close();
		}

		
		//对象反序列化读对象
		@Test
		public void fun4() throws IOException, ClassNotFoundException {
			FileInputStream fis = new FileInputStream("src\\\\tempfile\\\\obj.object");
			ObjectInputStream ois = new ObjectInputStream(fis);
			User user = (User) ois.readObject();
			System.out.println(user.toString());
		}
}
