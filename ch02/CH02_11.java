/*文件名：CH02_11.java	
*说明：逻辑运算
*/
public class CH02_11 {
    public static void main(String args[]) {
        int a=15,b=3;
        System.out.println("(a>10)&&(b>5)的返回值为 "+(a>10&&b>5));
        System.out.println("(a>10)||(b>5)的返回值为 "+(a>10||b>5));
        System.out.println("(a>10)&(b>5)的返回值为 "+(a>10&b>5));
        System.out.println("(a>10)|(b>5)的返回值为 "+(a>10|b>5));
        System.out.println("(a>10)^(b>5)的返回值为 "+(a>10^b>5));
        System.out.println(" 15 & 3 的返回值为 "+(a&b));
        System.out.println(" 15 | 3 的返回值为 "+(a|b));
        System.out.println(" 15 ^ 3 的返回值为 "+(a^b));
        System.out.println(" ~3 的返回值为"+(~b));
    }
}