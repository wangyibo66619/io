package demo01;

import java.io.File;

/**
 * @author 王艺博
 * @date 2021/5/18 21:41
 */
public class demo03 {
    public static void main(String[] args) {
        File file = new File("d:/java文件操作/1.txt");
        // delete()删除文件
        System.out.println(file.delete());
        System.out.println("---------------");

    }
}
