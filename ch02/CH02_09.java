/*文件名：CH02_09.java	
*说明：水果礼盒
*/
public class CH02_09 {
    public static void main(String args[]) {
        int apple=15,banana=20;//声明变量
        System.out.print("(1).小明买了苹果15个，香蕉20根，水果总共买了");
        System.out.println((apple+banana)+"个");
        System.out.print("(2).苹果每个3元，香蕉每根1元，总共花费了");
        System.out.println((apple*3+banana*1)+"元");
        System.out.print("(3).将苹果4个和香蕉3根装成一盒，共可装");
        System.out.println((apple/4)+"盒");
        System.out.println("(4).装盒后苹果剩下"+(apple%4)+"个，"+"香蕉剩下"+(20-apple/4*3)+"根");
    }
}