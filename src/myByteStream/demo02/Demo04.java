package myByteStream.demo02;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 王艺博
 * @date 2021/5/19 14:43
 */
/*
    字节流写入数据加入异常处理
 */
public class Demo04 {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("d:/java文件操作/demo01/4.txt");
//            fos.write("hello".getBytes());
//            fos.close();
//        }catch (IOException i) {
//            i.printStackTrace();
//        }
        // 假如finally来实现资源释放
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("d:/java文件操作/demo01/4.txt");
            fos.write("hello".getBytes());
        }catch (IOException i) {
            i.printStackTrace();
        }finally{
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
