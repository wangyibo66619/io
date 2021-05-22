package myCharStream.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author 王艺博
 * @date 2021/5/21 14:05
 */
/*
    构造方法：
        OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
    写数据的5种方式：
        void write(int c) 写一个字符
        void write(char[] cbuf):写入一个字符数组
        void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        void write(String str):写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。

 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:/java文件操作/demo01/3.txt"));
/*
        // void write(int c) 写一个字符
        osw.write(97);
        osw.write(98);
        // void flush() 刷新流。
        osw.flush();
*/

/*      char[] chs = {'a','b','c','d','e','f'};
//        void write(char[] cbuf):写入一个字符数组
//        osw.write(chs);

//        void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
//        osw.write(chs,0,chs.length);
        osw.write(chs,1, 3);
        osw.flush();
*/


        String s = "大根哥哥很善良";
//        void write(String str):写一个字符串
        //osw.write(s);

//        void write(String str, int off, int len) 写一个字符串的一部分。
        //osw.write(s,0,s.length());
        osw.write(s,1,4);
        osw.flush();




    }
}
