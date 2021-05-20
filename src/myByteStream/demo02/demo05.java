package myByteStream.demo02;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 王艺博
 * @date 2021/5/20 12:21
 */
// 复制图片
public class demo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\王艺博\\Desktop\\img\\wallhaven-6k6roq.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\王艺博\\Desktop\\wallhaven-6k6roq.jpg");

        byte[] by = new byte[1024];
        int aa;
        while ((aa = fis.read(by)) != -1 ) {
            fos.write(by,0,aa);
        }


    }
}
