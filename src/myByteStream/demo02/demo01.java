package myByteStream.demo02;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 王艺博
 * @date 2021/5/19 12:55
 */
/*
    FileOutputStream:文件输出流用于将数据写入File
        FileOutputStream(String name):创建文件输出流以指定的名称写入文件
 */
public class demo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\java文件操作\\demo01\\1.txt");
        /*
            上面代码做了三件事情：
                1:调用系统功能创建了文件
                2:创建了字节输出流对象
                3:让字节输出流指向创建好的文件
         */
        // void write(int b) 将指定的字节写入此文件输出流
        fos.write(97);
        // 使用io流最后都要释放资源
        // void close():关闭文件输出流并释放与此流相关联的任何资源
        fos.close();

    }
}
