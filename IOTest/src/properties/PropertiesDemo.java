package properties;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

import org.junit.jupiter.api.Test;


public class PropertiesDemo {
	@Test
	public void fun1() {
		Properties prop = new Properties();
		prop.setProperty("周迅", "张学友");
		prop.setProperty("李小璐", "贾乃亮");
		prop.setProperty("杨幂", "刘恺威");

		System.out.println(prop);

		Set<String> keys = prop.stringPropertyNames();
		for (String key : keys) {
			String value = prop.getProperty(key);
			System.out.println(key + "==" + value);
		}
	}

	@Test
	public void fun2() throws IOException {
		Properties prop = new Properties();
		prop.setProperty("周迅", "张学友");
		prop.setProperty("李小璐", "贾乃亮");
		prop.setProperty("杨幂", "刘恺威");

		FileWriter fileWriter = new FileWriter("src\\prop.properties");
		prop.store(fileWriter, "save data");
		fileWriter.close();
	}

	@Test
	public void fun3() throws IOException {
		InputStreamReader in = new InputStreamReader(new FileInputStream("src\\prop.properties"), "utf-8");
		Properties prop = new Properties();
		prop.load(in);
		in.close();
		System.out.println(prop);
	}

	
	
	

}
