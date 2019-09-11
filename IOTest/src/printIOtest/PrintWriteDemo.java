package printIOtest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

public class PrintWriteDemo {
	
	
	//打印流写入文件
	@Test
	public void fun1() throws IOException {
		PrintWriter out=new PrintWriter("printFile.txt");
		for(int i=0;i<5;i++) {
			out.println("你好,");
		}
		out.close();
	}
	
	
	//打印流数据自动刷新
	@Test
	public void fun2() throws IOException {
		PrintWriter out=new PrintWriter(new FileWriter("file\\printFile.txt"), true);
		for(int i=0;i<5;i++) {
			out.println("傻逼");
		}
		out.close();
	}
	
	
	@Test
	public void fun3() throws IOException {
		BufferedInputStream in=new BufferedInputStream(new FileInputStream("D:\\IO\\spring-tool-suite-3.9.9.RELEASE-e4.12.0-win32-x86_64.zip"));
		BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream("D:\\IO\\copy(rar).rar"));
		byte[] buffer=new byte[1024];
		int len=-1;
		while((len=in.read(buffer))!=-1) {
			out.write(buffer,0,len);
		}
		in.close();
		out.close();
	}
	
	
	
	//FileUtils
	@Test
	public void fun4() throws IOException {
		FileUtils.copyFile(new File("D:\\IO\\spring-tool-suite-3.9.9.RELEASE-e4.12.0-win32-x86_64.zip"), new File("D:\\IO\\copy(rar).rar"));
		
	}
}
