package demo01;

import java.io.File;
import java.io.IOException;

/**
 * @author 王艺博
 * @date 2021/5/18 9:41
 */
public class demo01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d:/demo01/demo01.txt");
        // 如果文件不存在，就创建文件，并返回true
        System.out.println(f1.createNewFile());
        System.out.println("---------------------");
        File f2 = new File("d:/demo01/demo02/demo02");
        System.out.println(f2.mkdirs());

    }
}
