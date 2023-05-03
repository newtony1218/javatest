// 自动类型转换与强制类型转换的比较
public class WORK02_03 {
  public static void main (String args[]) {
    int i=100, j=3; /* 声明整数变量 i 与 j，并赋初值 */
    float Result;    /* 声明浮点数变量 Result */
    System.out.println("自动类型转换的执行结果为：");
    Result=i/j;       /* 自动类型转换 */
    System.out.println("Result=i/j="+i+"/"+j+"="+Result);
    System.out.println("--------------------------------------");    
    System.out.println("强制类型转换的执行结果为：");
    Result=(float) i / j;  /* 强制类型转换 */
    System.out.println("Result=(float)i/(float)j="+i+"/"+j+
                       "="+Result);
    System.out.println("--------------------------------------");   
  }
}
