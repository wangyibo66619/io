package myByteStream.demo02;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 王艺博
 * @date 2021/5/19 13:16
 */
/*
    构造方法：
        FileOutputStream（String name）：创建文件输出流以指定的名称写入文件
        FileOutputStream（File file）：创建文件输出流以写入指定的 File对象表示文件
    写数据的三种方式：
        void write（int b）：将指定的字节写入此文件输出流
        一次写一个字节数据
        void write（byte[] b）：将b.length字节从指定的字节数组写入此文件输出流
        一次写一个字节数组的部分数据
        void write(byte[] b,int off,int len)：将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
        一次写一个字节数组的部分数据
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        // FileOutputStream（String name）：创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("D:\\java文件操作\\demo01\\2.txt");
        // FileOutputStream（File file）：创建文件输出流以写入指定的 File对象表示文件
        // FileOutputStream fos = new FileOutputStream(new File("D:\\java文件操作\\demo01\\2.txt"));


        // void write（int b）：将指定的字节写入此文件输出流
//        fos.write(97);
//        fos.write(94);
//        fos.write(95);
//        fos.write(94);
        // void write（byte[] b）：将b.length字节从指定的字节数组写入此文件输出流
        byte[] bys = {98,99,100,101,102};
        //fos.write(bys);
        // byte[] getBytes(）： 返回字符串对应的字节数组
        byte[] bytes = "abcde".getBytes();
        //fos.write(bytes);

        // oid write(byte[] b,int off,int len)：将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流

        fos.write(bytes,2,3);// 从索引2开始写三个长度的字符
        fos.close();
    }
}
