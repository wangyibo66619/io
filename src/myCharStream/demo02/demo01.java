package myCharStream.demo02;

import java.io.*;

/**
 * @author 王艺博
 * @date 2021/5/20 19:06
 */
/*
    OutputStreamWriter:
        OutputStreamWriter是从字符流到字节流的桥梁：使用指定的charset将写入的字符编码为字节。
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。

    InputStreamReader:
     InputStreamReader是从字节流到字符流的桥梁：它读取字节，并使用指定的charset将其解码为字符。
     它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。

 */
public class demo01 {
    public static void main(String[] args) throws IOException {
//      OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
//      OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:/java文件操作/demo01/4.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:/java文件操作/demo01/4.txt"),"GBK");
        osw.write("你好");
        osw.close();

//        InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
//        InputStreamReader(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。

        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/java文件操作/demo01/4.txt"),"GBK");

        int ch;
        while ( (ch = isr.read()) != -1 ) {
            System.out.print((char)ch);
        }
        isr.close();
    }
}
