/*�ļ�����CH02_11.java	
*˵�����߼�����
*/
public class CH02_11 {
    public static void main(String args[]) {
        int a=15,b=3;
        System.out.println("(a>10)&&(b>5)�ķ���ֵΪ "+(a>10&&b>5));
        System.out.println("(a>10)||(b>5)�ķ���ֵΪ "+(a>10||b>5));
        System.out.println("(a>10)&(b>5)�ķ���ֵΪ "+(a>10&b>5));
        System.out.println("(a>10)|(b>5)�ķ���ֵΪ "+(a>10|b>5));
        System.out.println("(a>10)^(b>5)�ķ���ֵΪ "+(a>10^b>5));
        System.out.println(" 15 & 3 �ķ���ֵΪ "+(a&b));
        System.out.println(" 15 | 3 �ķ���ֵΪ "+(a|b));
        System.out.println(" 15 ^ 3 �ķ���ֵΪ "+(a^b));
        System.out.println(" ~3 �ķ���ֵΪ"+(~b));
    }
}