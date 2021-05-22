package myCharStream.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 王艺博
 * @date 2021/5/21 15:27
 */
/*
    构造方法:
        InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
    读数据的两种方式：
        int read() 读一个字符
        int read(char[] cbuf, int offset, int length) 将字符读入数组的一部分。

 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/java文件操作/demo01/3.txt"));
/*

//        int read() 读一个字符
        int ch;
        while ( (ch = isr.read()) != -1 ) {
            System.out.print((char) ch);
        }
*/
//        int read(char[] cbuf, int offset, int length) 将字符读入数组的一部分。

        char[] chs = new char[1024];
        int len;
        while ( (len = isr.read(chs)) != -1 ) {
            System.out.println(new String(chs,0,len));
        }
        // 释放资源
        isr.close();
    }
}
