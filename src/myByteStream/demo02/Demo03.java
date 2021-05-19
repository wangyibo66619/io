package myByteStream.demo02;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 王艺博
 * @date 2021/5/19 14:11
 */
/*
    追加写入：
        public FileOutputStream(String name,boolean append)
            创建文件输出流以指定的名称写入文件。
            如果第二个参数为true，则字节写入文件的末尾而不是开头
            就是说如果加了true、每执行一次就会追加写入
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:/java文件操作/demo01/3.txt",true);
        /*
            换行
            windows:    \r\n
            linux:      \n
            mac:        \r
         */
        // 写数据
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        // 释放资源
        fos.close();
    }
}
