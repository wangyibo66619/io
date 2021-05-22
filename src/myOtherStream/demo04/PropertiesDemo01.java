package myOtherStream.demo04;

import java.util.Properties;
import java.util.Set;

/**
 * @author 王艺博
 * @date 2021/5/22 21:08
 */
/*
    Properties 作为Map集合的使用
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {

//        Properties<String,String> prop = new Properties<String,String>();// 错误写法
        Properties prop = new Properties();

        // 存储元素
        prop.put("01","武松");
        prop.put("02","鲁智深");
        prop.put("03","杨志");

        Set<Object> keySet = prop.keySet();
        for ( Object key : keySet ) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
