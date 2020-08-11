package com.mti.demo;

import org.junit.Test;

import java.io.*;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月28日
 */
public class DirList {


	public static void main(String args[]) {
		char c;
		// 使用 System.in 创建 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符, 按下 'q' 键退出。");
		// 读取字符
		try {
			do {
				c = (char) br.read();
				System.out.println(c);
			} while (c != 'q');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fileStreamTest(){
		try {
			byte bWrite[] = { 11, 21, 3, 40, 5 };
			OutputStream os = new FileOutputStream("test.txt");
			for (int x = 0; x < bWrite.length; x++) {
				os.write(bWrite[x]); // writes the bytes
			}
			os.close();

			InputStream is = new FileInputStream("test.txt");
			int size = is.available();

			for (int i = 0; i < size; i++) {
				System.out.print((char) is.read() + "  ");
			}
			is.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}




}
