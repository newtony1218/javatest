// �Զ�����ת����ǿ������ת���ıȽ�
public class WORK02_03 {
  public static void main (String args[]) {
    int i=100, j=3; /* ������������ i �� j��������ֵ */
    float Result;    /* �������������� Result */
    System.out.println("�Զ�����ת����ִ�н��Ϊ��");
    Result=i/j;       /* �Զ�����ת�� */
    System.out.println("Result=i/j="+i+"/"+j+"="+Result);
    System.out.println("--------------------------------------");    
    System.out.println("ǿ������ת����ִ�н��Ϊ��");
    Result=(float) i / j;  /* ǿ������ת�� */
    System.out.println("Result=(float)i/(float)j="+i+"/"+j+
                       "="+Result);
    System.out.println("--------------------------------------");   
  }
}
