package myCharStream.demo01;


import java.io.IOException;
import java.util.Arrays;

/**
 * @author 王艺博
 * @date 2021/5/20 17:42
 */
/*
    编码：
        byte[] getBytes():使用平台的默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
        byte[] getBytes(String charsetName)：适用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
    解码：
        String(byte[] bytes):通过平台的默认字符集解码指定的字节数组来构造新的 String
        String(byte[] bytes，String charsetName)：通过指定的字符集解码指定的字节数组来构造新的 String
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        // 定义一个字符串
        String s = "你好";
        //byte[] getBytes():使用平台的默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
        byte[] bys = s.getBytes();
//        System.out.println(Arrays.toString(bys));//[-28, -67, -96, -27, -91, -67]
//        byte[] getBytes(String charsetName)：适用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中

//        byte[] bytes = s.getBytes("UTF-8");//[-28, -67, -96, -27, -91, -67]
        byte[] bytes = s.getBytes("GBK");//[-60, -29, -70, -61]

        System.out.println(Arrays.toString(bytes));

        // String(byte[] bytes):通过平台的默认字符集解码指定的字节数组来构造新的 String
        String s1 = new String(bys);
        System.out.println(s1);
        // String(byte[] bytes，String charsetName)：通过指定的字符集解码指定的字节数组来构造新的 String
        String s2 = new String(bytes,"GBK");
        System.out.println(s2);

    }
}
