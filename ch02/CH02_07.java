//����CH02_07.java����������
import java.io.*;
public class CH02_07 {
    private static char myData;
    public static void main(String args[]) throws IOException {
        System.out.print("[����������ϰ]\n");
        System.out.print("�������ַ���");
        //�����ַ�
        myData = (char)System.in.read();
		System.out.println("������ַ�Ϊ��" + myData);
    } 
}