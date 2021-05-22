package myCharStream.demo04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 王艺博
 * @date 2021/5/21 17:55
 */
// 把集合中的数据写入到txt文件中
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        list.add("你好");
        list.add("你好");
        list.add("你好");

        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/java文件操作/demo01/5.txt"));

        for ( String s : list ) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
    }
}
