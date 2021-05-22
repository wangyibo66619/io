package myOtherStream.demo04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 王艺博
 * @date 2021/5/22 21:41
 */
/*
    Properties和IO流结合的方法：
        void load(Reader reader):
            以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
        void store(Writer writer, String comments):
            将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式输出到输出字符流。


 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        // 把集合中的的数据保存到文件
            myStore();
        // 把文件中的数据加载到集合
            myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("d:/java文件操作/demo02/7.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.put("01","武松");
        prop.put("02","鲁智深");
        prop.put("03","杨志");

        FileWriter fw = new FileWriter("d:/java文件操作/demo02/7.txt");
//        void store(Writer writer, String comments):
//              将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式输出到输出字符流。
        prop.store(fw,null);
        fw.close();
    }
}
