package demo01;

import java.io.File;

/**
 * @author 王艺博
 * @date 2021/5/18 20:21
 */
public class demo02 {
    public static void main(String[] args) {
        File file1 = new File("D:/java文件操作/1.txt");
        // 测试此抽象路径名表示的File是否为目录
        System.out.println(file1.isDirectory());
        // 测试此抽象路径名表示的File是否存在
        System.out.println(file1.exists());
        // 测试此抽象路径名表示的File是否为文件
        System.out.println(file1.isFile());

        // 将此抽象路径名转换为路径名字符串
        System.out.println(file1.getPath());
        // 返回此抽象路径名的绝对路径名字符串
        System.out.println(file1.getAbsoluteFile());
        // 返回此抽象路径名表示的文件或目录的名称
        System.out.println(file1.getName());

        //list() 返回此抽象路径名的表示的目录中的文件和目录的名称字符串数组
        System.out.println("--------------------");
        File file2 = new File("D:/java文件操作");
        String[] strArray = file2.list(); // 字符串类型
        for ( String str : strArray ) {
            System.out.println(str);
        }
        // listFiles() 返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File file3 = new File("D:/java文件操作");
        File[] fileArray = file3.listFiles();   // 对象类型
        for ( File str : fileArray ) {
            System.out.println(str);
        }
    }
}
