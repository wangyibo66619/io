package myCharStream.demo04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author 王艺博
 * @date 2021/5/21 18:11
 */
// 点名器
public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        // 创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("d:/java文件操作/demo02/2.txt"));
        // 创建结合对象
        ArrayList<String> array = new ArrayList<>();
        // 读数据
        String line;
        while ( (line = br.readLine()) != null ) {
            // 把数据添加到集合中
            array.add(line);
        }

        // 关闭资源
        br.close();
        // 创建一个随机数，范围在[0,集合的长度)
        Random r = new Random();
        int index = r.nextInt(array.size());
        // 将随机数作为索引取ArrayList中取值
        String name = array.get(index);
        // 打印所取到的值
        System.out.println(name);
    }
}
