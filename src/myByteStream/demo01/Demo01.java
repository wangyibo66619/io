package myByteStream.demo01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 王艺博
 * @date 2021/5/19 15:04
 */
/*
    读取文件并在控制台输出
        FileInputStream:从文件系统中的文件获取输入字节
        FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream，改文件由文件系统中的路径名name命名
    使用字节输入流读数据方法:
        1 创建字节输入流对象
        2 调用字节输入流对象的读数据方法
        3 释放资源
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("d:/java文件操作/demo01/4.txt");// 文件内容是hello

        // 调用字节输入流对象的读数据方法
        // int read():从该输入流读取一个字节的数据  如果到文件末尾就会返回-1

        /*// 第一次读数据
        int by = fis.read();
        System.out.println(by);
        System.out.println( (char)by );
        // 第二次读数据
        by = fis.read();
        System.out.println(by);
        System.out.println( (char)by );
        // 多读取几次
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);*/
        // 如果达到文件末尾， 则返回-1

        /*
        int by = fis.read();
        while (by != -1) {
            System.out.print( (char)by );
            by = fis.read();
        }
        */

        // 优化上面的循环程序
        int by;
        /*
            fis.read() ： 读数据
            by = fis.read()：把读到的数据赋值给by
            by != -1 :判断读取到的数据是否是-1
         */
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }
        // 释放资源
        fis.close();


    }
}
