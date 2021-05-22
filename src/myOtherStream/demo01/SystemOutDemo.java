package myOtherStream.demo01;

import java.io.PrintStream;

/**
 * @author 王艺博
 * @date 2021/5/22 17:02
 */
/*
public static final PrintStream out“标准”输出流。 此流已经打开并准备好接受输出数据。 通常，此流对应于显示输出或由主机环境或用户指定的另一个输出目标。
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        // public static final PrintStream out“标准”输出流。
        PrintStream ps = System.out;
        // 能够方法打印各种值
        ps.println("aa");
        ps.println(19);

        // System.out本质是一个字节输出流
        System.out.println("hello");
        System.out.println(18);

    }
}
