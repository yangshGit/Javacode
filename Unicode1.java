/* window���ļ��洢����ʹ��ansi ������ʾ����
1.���Ĳ���ϵͳĬ��ansi���룬���ɵ�txt�ļ�Ĭ��Ϊansi���룬���ԣ���������������
2.unicode�ǹ���ͨ�ñ��룬���ԣ���������������
3.utf-8������unicode����������֮�䣨��Ҫ����ҳ������ʱ��һ�֡���ͨ���͡����������롣utf-8������֮�䴫��ʱ���Խ�Լ�����������ԣ�ʹ�ò���ϵͳ�޷�������txt�ı���
����utf-8��ʼ�˵�Ը����
�ˣ�unicode���������䣨utf-8�������ˣ�unicode��
���ǣ������������վ�������ڿ�����ҳʱֱ��ʹ��utf-8���롣
�ˣ�utf-8���������䣨utf-8�������ˣ�utf-8��
*/

public class  Unicode1 
{   public static void main (String args[ ])
    { char chinaWord='��',japanWord='��';int  p1=20320,p2=12353;
      System.out.println("����\'��\'��unicode���е�˳��λ��:"+(int)chinaWord);
      System.out.println("����\'��\'��unicode���е�˳��λ��:"+(int)japanWord); 
      System.out.println("unicode���е�20320λ���ϵ��ַ���:"+(char)p1);
      System.out.println("unicode���е�12353λ���ϵ��ַ���:"+(char)p2); 
    }
}
