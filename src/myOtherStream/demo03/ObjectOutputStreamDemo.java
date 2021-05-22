package myOtherStream.demo03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author 王艺博
 * @date 2021/5/22 19:46
 */
/*
    对象序列化流：
        构造方法：
             ObjectOutputStream(OutputStream out) 创建一个写入指定的OutputStream的ObjectOutputStream。
        序列化对象方法：
            void writeObject(Object obj) 将指定的对象写入ObjectOutputStream。
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
//        ObjectOutputStream(OutputStream out) 创建一个写入指定的OutputStream的ObjectOutputStream。
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/java文件操作/demo02/6.txt"));

        Student student = new Student("王艺博",18);
        oos.writeObject(student);

        oos.close();
    }
}
