package myCharStream.demo04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 王艺博
 * @date 2021/5/21 18:01
 */
public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        // 创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("d:/java文件操作/demo01/5.txt"));
        // 常见集合对象
        ArrayList<String> str = new ArrayList<>();

        // 把文件的内容打印到集合中
        String line;
        while ( (line = br.readLine()) != null ) {
            str.add(line);

        }
        // 遍历集合
        for (String s : str) {
            System.out.println(s);
        }
    }
}
