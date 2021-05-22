package myOtherStream.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/5/22 16:11
 */
/*
    public static final InputStream in:标准输入流。 该流已经打开，准备提供输入数据。 通常，该流对应于键盘输入或由主机环境或用户指定的另一个输入源。
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
//      public static final InputStream in:标准输入流。
        InputStream is = System.in;

//        int by;
//        while ( (by = is.read()) != -1 ) {
//            System.out.println((char) by);
//        }

        // 把字截留转换为字符流
//        InputStreamReader isr = new InputStreamReader(is);
//        // 使用一次读取一行的方法读取，但这个方法使字符缓冲流特有的
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串：");
        String s = br.readLine();
        System.out.println("你输入的字符串是" + s);

        System.out.println("请输入一个数字：");
        int i = Integer.parseInt(br.readLine());
        System.out.println("您输入的数字的66倍是：" + (i*66) );

        // 自己实现键盘录入数据太麻烦，所以java就提供了一个类供我们使用
        Scanner sc = new Scanner(System.in);
    }
}
