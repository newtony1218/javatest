//程序：CH02_07.java，基本输入
import java.io.*;
public class CH02_07 {
    private static char myData;
    public static void main(String args[]) throws IOException {
        System.out.print("[基本输入练习]\n");
        System.out.print("请输入字符：");
        //输入字符
        myData = (char)System.in.read();
		System.out.println("输入的字符为：" + myData);
    } 
}