package myCharStream.demo06;

import java.io.*;

/**
 * @author 王艺博
 * @date 2021/5/22 11:16
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        // 创建数据源目录File对象
        File srcFolder = new File("D:\\java文件操作\\demo02");
        // 获取源目录的名字
        String srcFolderName = srcFolder.getName();

        // 创建目的地目录File对象   路径名是  目的地路径加上源目录的名字
        File destFolder = new File("C:\\Users\\王艺博\\Desktop",srcFolderName);

        // 判断目的地对应的目录名是否存在，如果不存在就创建
        if ( !destFolder.exists() ) {
            destFolder.mkdir();
        }

        // 获取源目录下所有文件的File数组
        File[] files = srcFolder.listFiles();
        // 遍历File数组，得到每一个File对象，该File对象其实就是源目录下的文件
        for ( File srcFile : files ) {
            String srcFileName = srcFile.getName();
            File destFile = new File(destFolder,srcFileName);
            // 调用方法复制文件
            copyFile(srcFile,destFile);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ( (len = bis.read(bys)) != -1 ) {
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }


}
