/*
   ���ʵ���������͵�ʹ�ã�byte��short��int��long����
*/
public class TestInt{

   public static void main(String[] args){
    
       byte b1 = 100;
       //byte b1 = 1000; error ������ʧ����
       System.out.println("b1 = " + b1); //b1 = 100

       System.out.println("---------------------------");
       short s1 = 10000;
       //short s1 = 100000; error ������ʧ����
       System.out.println("s1 = " + s1); //s1 = 10000

       System.out.println("---------------------------");
       int i1 = 100000;
       //int i1 = 10000000000; //error ��������� ֱ����������int���͵ķ�Χ
       //int i1 = 10000000000L;  // error ������ʧ����
       System.out.println("i1 = " + i1); //i1 = 100000;

       System.out.println("---------------------------");
       long l1 = 10000000000L;  
       System.out.println("l1 = " + l1); //l1 = 10000000000;
   }
}