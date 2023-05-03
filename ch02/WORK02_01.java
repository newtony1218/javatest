// 多重逻辑运算符的应用与范例
public class WORK02_01 {
    public static void main (String args[] ) {
        int a=7,b=8,c=9; /*声明a、b和c三个整数变量，并赋初值*/
        System.out.println("a<b && b<c || c<a = "+(a<b && b<c || c<a)); 
        /* 先计算“a<b && b<c”，然后再将结果与“c<a”进行OR的运算 */  
        System.out.println("!(a<b) && b<c || c<a = "+(!(a<b) && b<c || c<a));
    }
}