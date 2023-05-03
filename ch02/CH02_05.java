// CH02_05.java, 变量与常数的声明
public class CH02_05 {  //声明常数C（光速）
    final static double C = 2997924581.2;
    public static void main(String args[]) {
        //声明变量e与m
        int m;
        double e;
        //给变量赋值
        m = 10;
        e = m * C * C;
        //输出到屏幕上
        System.out.println("当质量为：" + m);
        System.out.println("所释放出的能量为：" + e);
    }
}