/*
   ���ʵ�ֱ�������������
*/

//����javaĿ¼�е�utilĿ¼�е�Scanner��
import java.util.Scanner;

public class TestVarInput{

   public static void main(String[] args){

       //1.���������������ֱ��¼����������  
       //String/*�ַ�������*/ name;
       //int age;	

       //2.��ʾ�û��������������䣬�����浽������
       System.out.println("���������������䣺");
       //����һ��ɨ����������ɨ����̵�����
       Scanner sc = new Scanner(System.in);
       //�Ӽ��������ж�ȡһ���ַ������ݷ���name������Ӧ���ڴ�ռ���
       String name = sc.next();
       //�Ӽ��������ж�ȡһ����������age������Ӧ���ڴ�ռ���
       int age = sc.nextInt();  

       //3.��ӡ�û����������������
       System.out.println("name = " + name); 
       System.out.println("age = " + age); 
   }
}