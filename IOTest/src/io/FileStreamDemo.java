package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class FileStreamDemo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Log logger = LogFactory.getLog(FileStreamDemo.class);

	public static void main(String[] args) throws IOException {

		String path = "D:\\IO\\io.txt";
		File file = new File(path);
		// 会覆盖内容
		// FileOutputStream fos = new FileOutputStream(file);

		FileOutputStream fos = new FileOutputStream(file, true);
		byte[] data = "\n文件abcde".getBytes();
		// byte[] data1 = { 10, -26, -106, -121, -28, -69, -74, 96, 11 };

		System.out.println(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		fos.write(data);
		fos.close();

	}

	@Test
	public void fun1() {
		String path = "D:\\IO\\io.txt";
		File file = new File(path);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file, true);
			fos.write("\nabcde".getBytes());
		} catch (Exception e) {
			logger.info(e.toString() + "---------");
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("error");
				}
			}
		}

	}

	@Test
	public void fun2() throws IOException {
		String path = "D:\\IO\\io.txt";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		int ch = 0;
		while ((ch = fis.read()) != -1) {
			System.out.println("ch= " + (char) ch);
			fis.close();
		}
	}

	@Test
	public void fun3() throws IOException {
		File file = new File("D:\\IO\\io.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) != -1) {
			System.out.println(new String(buffer, 0, len));
		}
		fis.close();
	}
	
	
	@Test
	public void copyFileReadChar() throws IOException {
		System.out.println(System.currentTimeMillis());
		long start = System.currentTimeMillis();
		File file1 = new File("D:\\IO\\io.txt");
		FileInputStream fis = new FileInputStream(file1);
		File file2 = new File("D:\\IO\\io(copy).txt");
		// file2.createNewFile();
		FileOutputStream fos = new FileOutputStream(file2);
		int ch = 0;
		while ((ch = fis.read()) != -1) {
			fos.write(ch);
		}
		fis.close();
		fos.close();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(System.currentTimeMillis());
	}

	@Test
	public void copyfileReadBuffer() throws IOException {
		System.out.println(System.currentTimeMillis());
		File file1 = new File("D:\\IO\\io.txt");
		FileInputStream fis = new FileInputStream(file1);
		File file2 = new File("D:\\IO\\io(copy).txt");
		// file2.createNewFile();
		FileOutputStream fos = new FileOutputStream(file2);
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, len);
		}
		fis.close();
		fos.close();
		System.out.println(System.currentTimeMillis());
	}

	@Test
	public void testReadBuffer() throws IOException {
		FileInputStream inputStream = new FileInputStream(new File("D:\\IO\\json2.js"));
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = inputStream.read(buffer)) != -1) {
			System.out.println(new String(buffer, 0, len));
		}
		inputStream.close();
	}

	@Test
	public void testBufferedReaderCopyFile() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("D:\\IO\\io.txt"));
		BufferedWriter write = new BufferedWriter(new FileWriter("D:\\IO\\io(copy)2.txt"));
		String line=null;
		while((line=read.readLine())!=null) {
			write.write(line);
			//write.newLine();
		}
		read.close();
		write.close();
	}

}
