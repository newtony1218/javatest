/*文件名： CH02_13.java	
*说明：赋值运算
*/
public class CH02_13 {
    public static void main(String args[]) {
        int A=5;
        System.out.println("A=5 ");
        A+=3+2;
        System.out.println("A+= 3+2 的值为 "+(A));
        A=5;
        A-=5-4;
        System.out.println("A-= 5-4 的值为 "+(A));
        A=5;
        A*=2*3;
        System.out.println("A*= 2*3 的值为 "+(A));
        A=5;
        A/=10/5+3;
        System.out.println("A/= 10/5+3 的值为 "+(A));
        A=5;
        A%=15%4;
        System.out.println("A%= 15%4 的值为 "+(A));
        A=5;
        A &=5-3;
        System.out.println("A&= 5-3 的值为 "+(A));
        A=5;
        A|=2;
        System.out.println("A|= 2 的值为 "+(A));
        A=5;
        A^=2+1;
        System.out.println("A^= 2+1 的值为 "+(A));
    }
}