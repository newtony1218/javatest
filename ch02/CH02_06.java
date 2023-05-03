//程序：CH02_06.java，基本输出
public class CH02_06 {
    public static void main(String args[]) { //声明变量
        String myStringA = "第一个字符串";
        String myStringB = "第二个字符串";
        String myStringC = "会串接在一起";
        int myIntA = 3;
        boolean myBoolean = true;
        //在屏幕上输出
        System.out.print("[JAVA基本输出练习]\n");
        System.out.println("“真”的英文是" + myBoolean);
        System.out.println(myStringA + myStringB);
        System.out.println(myStringC);
        System.out.println("1 + 2 = " + myIntA);
        System.out.println("5 - 3 = " + (5 - myIntA));
    } 
}