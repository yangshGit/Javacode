public class SecretArray
{ public static void main(String args[])
   {   //����һά����
	   int a[]={100,200,300};
       int b[]={10,11,12,13,14,15,16};
       System.out.println("����a:"+a[0]+","+a[1]+","+a[2]);
       System.out.println("����b:"+b[0]+","+b[1]+","+b[2]+","+b[3]);
       b=a;
       b[0]=123456;
      System.out.println("����a:"+a[0]+","+a[1]+","+a[2]);
      System.out.println("����b:"+b[0]+","+b[1]+","+b[2]);
      System.out.println("����b�ĳ���:"+b.length);
      int x=1;
		++x;
		--x;
		System.out.println(x);
		double y=4.0/3;
		System.out.println(y);
	//ͨ��^�����ʵ�ּ��ܽ���
	char a1='ʮ',a2='��',a3='��',a4='��';
     char secret='��';
     a1=(char)(a1^secret);   
     a2=(char)(a2^secret);
     a3=(char)(a3^secret);   
     a4=(char)(a4^secret);
     System.out.println("����:"+a1+a2+a3+a4);
     a1=(char)(a1^secret);   
     a2=(char)(a2^secret);
     a3=(char)(a3^secret);  
     a4=(char)(a4^secret);
     System.out.println("ԭ��:"+a1+a2+a3+a4);
     //����ѭ����� switch for while break continue.
	 int aa=0,bb=10,cc=99;
	 --cc;
	 cc++;
	 switch(bb)
	   {
		 case 10:
		 System.out.println(bb+" "+cc);
		// break;
	   }
	   for (int ax=0;ax<10 ; ++ax)
	   {
		   if (ax==3)
		   {
			   continue;
		   }
		   System.out.println(ax);
		   if (ax==3)
		   {
			   break;
		   }
	   }
	   while (cc>=90)
	   {
		    System.out.println(cc);
		cc--;
	   }
   }
} 

