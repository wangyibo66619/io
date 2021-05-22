package myOtherStream.demo02;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author 王艺博
 * @date 2021/5/22 17:09
 */
/*
    打印流的特点：
        只负责输出数据，不负责读数据
        有自己的特有方法
    字节打印流：
        PrintStream(String fileName):使用指定的文件名创建新的打印流
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("d:/java文件操作/demo02/4.txt");

        // 字节输出流的方法，
        ps.write(97);
        // 特有方法,写的什么就打印什么，不用转码
        ps.println(97);
        ps.println(98);

        ps.close();
    }
}
