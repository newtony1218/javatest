// λ�߼��������Ӧ���뷶��
public class WORK02_02 {
  public static void main (String args[]) {
    int bit_test=12;/* ������������������ֵ (00001100) */
    int bit_test1=7;/* ������������������ֵ (00000111)*/
    System.out.println("bit_test= "+bit_test+"  bit_test1= "+bit_test1);
    System.out.println("-----------------------------------------");
    /* ִ�� AND,OR,XOR λ�߼����� */ 
    System.out.println("ִ�� AND ����Ľ��:"+(bit_test & bit_test1));
    System.out.println("ִ�� OR  ����Ľ��:"+(bit_test | bit_test1));
    System.out.println("ִ�� XOR ����Ľ��:"+(bit_test ^ bit_test1));
  }
}
