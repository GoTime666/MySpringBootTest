package systemIn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



//键盘输入内容到文件
public class SystemInTest {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			fw = new FileWriter("src\\prop.proper");
			bw = new BufferedWriter(fw);
			System.out.println("输入你要输入到文件的内容，移over结束：");
			String s;
			while (true) {
				s = br.readLine();
				if ("over".equals(s))
					break;
				bw.write(s);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("操作的文件不存在");
		} catch (IOException e) {
			System.out.println("发生IO操作异常");
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
			}

			catch (Exception ex) {
			}

		}

	}
}

//释放资源的语句最好写在finally中，这样即使程序运行过程中抛出异常，对应的资源也可以得到及时释放
