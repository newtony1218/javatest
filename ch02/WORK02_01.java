// �����߼��������Ӧ���뷶��
public class WORK02_01 {
    public static void main (String args[] ) {
        int a=7,b=8,c=9; /*����a��b��c��������������������ֵ*/
        System.out.println("a<b && b<c || c<a = "+(a<b && b<c || c<a)); 
        /* �ȼ��㡰a<b && b<c����Ȼ���ٽ�����롰c<a������OR������ */  
        System.out.println("!(a<b) && b<c || c<a = "+(!(a<b) && b<c || c<a));
    }
}