package myCharStream.demo07;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 王艺博
 * @date 2021/5/22 15:41
 */
// 异常处理
public class demo7 {
    public static void main(String[] args) {

    }
    // JDK7改进方案  自动释放资源
    public static void method03(){
        try(FileReader fr = new FileReader("d:/java文件操作/demo01/2.txt");
            FileWriter fw = new FileWriter("c:/User/王艺博/Desktop");) {

            char[] bys = new char[1024];
            int len;
            while ( (len = fr.read(bys)) != -1 ) {
                fw.write(bys,0,len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    // try...catch...finally
    public static void method02() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
             fr = new FileReader("d:/java文件操作/demo01/2.txt");
             fw = new FileWriter("c:/User/王艺博/Desktop");

            char[] bys = new char[1024];
            int len;
            while ( (len = fr.read(bys)) != -1 ) {
                fw.write(bys,0,len);
            }

        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    // 抛出处理
    public static void method01() throws IOException{

        FileReader fr = new FileReader("d:/java文件操作/demo01/2.txt");
        FileWriter fw = new FileWriter("c:/User/王艺博/Desktop");

        char[] bys = new char[1024];
        int len;
        while ( (len = fr.read(bys)) != -1 ) {
            fw.write(bys,0,len);
        }
        fr.close();
        fw.close();

    }
}
