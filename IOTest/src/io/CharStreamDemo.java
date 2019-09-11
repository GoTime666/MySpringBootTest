package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Properties;

import org.junit.Test;

import bean.User;

public class CharStreamDemo {

	/*
	 * public static void readCNText() throws IOException { FileReader fr = new
	 * FileReader("D:\\IO\\readerTest.txt"); int ch = 0; while ((ch = fr.read()) !=
	 * -1) { System.out.println(ch); System.out.println((char) ch);
	 * 
	 * } fr.close(); }
	 * 
	 * public static void writeCNText() throws IOException { FileOutputStream fos =
	 * new FileOutputStream("D:\\IO\\readerTest.txt");
	 * fos.write("北京欢迎你".getBytes()); fos.close(); }
	 */

	@Test
	public void fun3() throws IOException {
		writeCNText();
		readCNText();
	}

	public static void readCNText() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\IO\\io-read.txt");
		int ch = 0;
		while ((ch = fis.read()) != -1) {
			System.out.print(ch + " ");
		}
		fis.close();
	}

	public static void writeCNText() throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\IO\\io-read.txt");
		fos.write("北京欢迎你!!".getBytes());
		fos.close();
	}

	@Test
	public void fun1() throws IOException {
		writeCNText();
		readCNText();
	}

	@Test
	public void fun2() throws IOException {
		File file = new File("D:\\IO\\User.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] buffer = new byte[1024];
		int len = 0;
		String str = "";
		while ((len = fis.read(buffer)) != -1) {
			str = new String(buffer, 0, len);
		}
		System.out.println(str);
		String[] strings = str.split("\n");
		for (String string : strings) {
			System.out.print("数组" + string);
		}
		ArrayList<String> list = new ArrayList<String>();
		for (String string : strings) {
			System.out.println(string);
			int index = string.indexOf(":");
			String string2 = string.substring(index + 1);
			list.add(string2.trim());
		}
		for (String string : list) {
			System.out.println("list " + string);
		}
		User u = new User(list.get(0), Integer.parseInt(list.get(1)), list.get(2), list.get(3));
		System.out.println(strings.length);
		System.out.println(u);
		fis.close();
	}

	@Test
	public void fun4() throws IOException {
		FileWriter fw = new FileWriter("d:\\io\\readerTest.txt");
		fw.write("你好啊");
		fw.flush();
		fw.close();
	}

	@Test
	public void copyTextFile() throws IOException {
		FileReader reader = new FileReader("D:\\io\\json2.js");
		FileWriter writer = new FileWriter("D:\\io\\json2(copy).js");
		char[] buffer = new char[1024];
		int len = 0;
		while ((len = reader.read(buffer)) != -1) {
			writer.write(buffer, 0, len);
			System.out.println(new String(buffer, 0, len));
		}
		reader.close();
		writer.close();
	}

	@Test
	public void writeCN() throws IOException {
		FileOutputStream fos = new FileOutputStream("d:\\io\\cn8.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
		osw.write("你好!!");
		fos.close();
	}

	@Test
	public void readCN() throws IOException {
		InputStream in = new FileInputStream("d:\\io\\cn8.txt");
		InputStreamReader reader = new InputStreamReader(in, "gbk");
		int ch = 0;
		while ((ch = reader.read()) != -1) {
			System.out.print((char) ch);
		}
		reader.close();
	}

	// 缓冲复制文件
	@Test
	public void bufferedStreamTest() throws IOException {
		BufferedInputStream in = new BufferedInputStream(
				new FileInputStream("D:\\电影\\spring-tool-suite-3.9.9.RELEASE-e4.12.0-win32-x86_64.zip"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\电影\\copy.zip"));
		long start = System.currentTimeMillis();
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
		long end = System.currentTimeMillis();
		long passed = end - start;
		System.out.println("使用的时间: " + passed);
	}

	// 单个字节复制文件
	@Test
	public void singleCharStreamTest() throws IOException {
		BufferedInputStream in = new BufferedInputStream(
				new FileInputStream("D:\\电影\\spring-tool-suite-3.9.9.RELEASE-e4.12.0-win32-x86_64.zip"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\电影\\copy.zip"));
		long start = System.currentTimeMillis();

		int len = -1;
		while ((len = in.read()) != -1) {
			out.write(len);
		}
		in.close();
		out.close();
		long end = System.currentTimeMillis();
		long passed = end - start;
		System.out.println("使用的时间: " + passed);
	}

	// 缓冲流fileWriter
	@Test
	public void bufferWriterTest() throws IOException {
		FileWriter write = new FileWriter("d:\\io\\bufferWriterTest.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(write);
		for (int i = 0; i < 5; i++) {
			bufferedWriter.write("hello");
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
		write.close();
	}

	
	
	//bufferedReader读文件
	@Test
	public void bufferReaderTest() throws IOException {
		//InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("d:\\io\\bufferWriterTest.txt"),"utf-8");
		
		
		FileReader read = new FileReader("d:\\io\\bufferWriterTest.txt");
		BufferedReader bufferedReader = new BufferedReader(read);
		 
		//BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int ch = 0;
		while ((ch = bufferedReader.read()) != -1) {
			System.out.print((char)ch);
		}

		bufferedReader.close();
		read.close();
		//inputStreamReader.close();
		
		
	}
	
	
	//获取系统编码
	@Test
	public void getSystemEncoding() {
		Properties initProp = new Properties(System.getProperties());
		System.out.println("当前系统编码:" + initProp.getProperty("file.encoding"));
		System.out.println("当前系统语言:" + initProp.getProperty("user.language"));
	}

}
