package demo02;

/**
 * @author 王艺博
 * @date 2021/5/19 9:31
 */
public class DiGuiDemo02 {
    public static void main(String[] args) {
        // 递归求阶乘
        // 5! = 5*4*3*2*1
        System.out.println("5的阶乘是： " + jc(5));
    }

    public static int jc(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}
