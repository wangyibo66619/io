package myOtherStream.demo02;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 王艺博
 * @date 2021/5/22 17:24
 */
/*
    字符打印流构造方法：
        PrintWriter(String fileName) 使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新。
        PrintWriter(Writer out, boolean autoFlush) 创建一个新的PrintWriter。
                        参数
                        out - 字符输出流
                        autoFlush - 一个布尔值 如果为真，则println ， printf ，或format方法将刷新输出缓冲区

 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter("d:/java文件操作/demo02/5.txt");
//
////        pw.write(97);
////        pw.write("\r\n");
////        pw.flush();
////        pw.write(98);
////        pw.write("\r\n");
//
//        pw.println("你好");
//        pw.flush();
//        pw.println("11");
//        pw.flush();

        PrintWriter pw = new PrintWriter(new FileWriter("d:/java文件操作/demo02/5.txt"),true);
        // 不用手动刷新
        pw.println("你好");
        pw.println("世界");

        pw.close();
    }
}
