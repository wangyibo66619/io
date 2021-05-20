package myByteStream.demo03;

import java.io.*;

/**
 * @author 王艺博
 * @date 2021/5/20 12:54
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 字节缓冲流：BufferedOutputStream(OutputStream out)
//        FileOutputStream fos = new FileOutputStream("d:/java文件操作/demo01/4.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        /*BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/java文件操作/demo01/6.txt"));
        // 写数据
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());

        bos.close();*/
        // 字节缓冲流：BufferedInputStream(InputStream in)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/java文件操作/demo01/6.txt"));
        // 一次读取一个字节数据
        /*int by;
        while ( (by = bis.read()) != -1 ) {
            System.out.print((char)by);
        }*/
        // 一次读取一个字节数组的数据
        byte[] bys = new byte[1024];
        int len;
        while ( (len = bis.read(bys)) != -1 ) {
            System.out.println(new String(bys,0,len));
        }

        bis.close();
    }
}
