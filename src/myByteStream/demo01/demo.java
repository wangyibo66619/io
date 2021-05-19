package myByteStream.demo01;

import java.io.*;

/**
 * @author 王艺博
 * @date 2021/5/19 18:28
 */
public class demo {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/java文件操作/demo01/5.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());

    }
}
