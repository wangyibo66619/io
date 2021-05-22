package myOtherStream.demo03;

import java.io.*;

/**
 * @author 王艺博
 * @date 2021/5/22 20:23
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }
    // 反序列化
    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/java文件操作/demo02/6.txt"));

        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());

        ois.close();
    }
    // 序列化
    public static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/java文件操作/demo02/6.txt"));
        Student student = new Student("武松",25);
        oos.writeObject(student);
        oos.close();
    }
}
