package myCharStream.demo03;

import java.io.*;

/**
 * @author 王艺博
 * @date 2021/5/21 16:20
 */
// 将C:\Users\王艺博\IdeaProjects\1\io\src\myCharStream\demo02\Demo04.java 文件复制到d:/java文件操作/demo02/1.txt中
public class demo01 {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("d:/java文件操作/demo02/1.txt");
//        FileReader fr = new FileReader("C:\\Users\\王艺博\\IdeaProjects\\1\\io\\src\\myCharStream\\demo02\\Demo04.java");

        BufferedWriter bd = new BufferedWriter(new FileWriter("d:/java文件操作/demo02/1.txt"));
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\王艺博\\IdeaProjects\\1\\io\\src\\myCharStream\\demo02\\Demo04.java"));

        String line;
        while ( (line = br.readLine()) != null ) {
            bd.write(line);
            bd.newLine();
        }


        // 关闭资源
        bd.close();
        br.close();
    }
}
