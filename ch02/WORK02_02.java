// 位逻辑运算符的应用与范例
public class WORK02_02 {
  public static void main (String args[]) {
    int bit_test=12;/* 声明整数变量并赋初值 (00001100) */
    int bit_test1=7;/* 声明整数变量并赋初值 (00000111)*/
    System.out.println("bit_test= "+bit_test+"  bit_test1= "+bit_test1);
    System.out.println("-----------------------------------------");
    /* 执行 AND,OR,XOR 位逻辑运算 */ 
    System.out.println("执行 AND 运算的结果:"+(bit_test & bit_test1));
    System.out.println("执行 OR  运算的结果:"+(bit_test | bit_test1));
    System.out.println("执行 XOR 运算的结果:"+(bit_test ^ bit_test1));
  }
}
