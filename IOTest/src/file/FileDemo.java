package file;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;

public class FileDemo {

	static {
		System.out.println("静态代码块");
	}

	private static Log logger = LogFactory.getLog(FileDemo.class);

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Class<?> class1 = Class.forName("file.FileDemo");
		class1.getClass();
		String path = "D:\\IO\\io.txt";
		File file = new File(path);
		System.out.println(file);

		File dir = new File("D:\\IO");
		File file2 = new File(dir, "hello.java");
		File file34 = new File(dir, "11.dd");
		System.out.println("父文件" + file34.getAbsolutePath());

		/*
		 * File f=new File("IOTest/src/file/FileDemo.jav"); f.createNewFile();
		 */

		File dir2 = new File("D:\\IO\\IO2\\IO3\\IO4");
		// 创建单个目录
		// dir2.mkdir();
		// 创建多级目录
		boolean mkdirs = dir2.mkdirs();
		logger.info("mkdirs: " + mkdirs);
		System.out.println(file2);

		System.out.println("文件长度: " + file.length() + "\n文件路径: " + file.getPath() + "\n文件父路径: " + file.getParent()
				+ "\n文件绝对路径: " + file.getAbsolutePath());
		System.out.println("文件是否存在: " + file.exists());
		logger.info("创建文件: " + file.createNewFile());
		logger.info("是否是一个标准文件: " + file.isFile());
		logger.info("是否是一个目录: " + file.isDirectory());

		String[] names = dir2.list();
		for (String name : names) {
			// logger.info("文件夹下所有匹配文件名: " + name);
			System.out.println("list():" + name);
		}

		File[] listFiles = dir2.listFiles();
		for (File file3 : listFiles) {
			// logger.info("listFiles() " + file3);
			System.out.println("listFiles() " + file3);
		}

		File[] listFiles2 = dir2.listFiles(new MyFileFilter());
		for (File file3 : listFiles2) {
			// logger.info("FiltenameFilter文件过滤: " + file3);
			System.out.println("FiltenameFilter文件过滤: " + file3);
		}

		File[] listFiles3 = dir2.listFiles(new FilefilterByDir());
		for (File file3 : listFiles3) {
			// logger.info("FileFilter过滤文件或者文件夹: "+file3);
			System.out.println("FileFilter过滤文件或者文件夹: " + file3);
		}

	}

	@Test
	public void fffff() throws FileNotFoundException {
		File f=new File("11.rr");
		f.getName();
		//FileInputStream in=new FileInputStream("11.rr");
		FileOutputStream out=new FileOutputStream("22.r");
	}
}

class MyFileFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub

		return name.endsWith(".rtf");
	}
}

class FilefilterByDir implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		// return pathname.isDirectory();
		return pathname.isFile();
	}

}
