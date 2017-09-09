public class SecretArray
{ public static void main(String args[])
   {   //测试一维数组
	   int a[]={100,200,300};
       int b[]={10,11,12,13,14,15,16};
       System.out.println("数组a:"+a[0]+","+a[1]+","+a[2]);
       System.out.println("数组b:"+b[0]+","+b[1]+","+b[2]+","+b[3]);
       b=a;
       b[0]=123456;
      System.out.println("数组a:"+a[0]+","+a[1]+","+a[2]);
      System.out.println("数组b:"+b[0]+","+b[1]+","+b[2]);
      System.out.println("数组b的长度:"+b.length);
      int x=1;
		++x;
		--x;
		System.out.println(x);
		double y=4.0/3;
		System.out.println(y);
	//通过^运算符实现加密解密
	char a1='十',a2='点',a3='进',a4='攻';
     char secret='点';
     a1=(char)(a1^secret);   
     a2=(char)(a2^secret);
     a3=(char)(a3^secret);   
     a4=(char)(a4^secret);
     System.out.println("密文:"+a1+a2+a3+a4);
     a1=(char)(a1^secret);   
     a2=(char)(a2^secret);
     a3=(char)(a3^secret);  
     a4=(char)(a4^secret);
     System.out.println("原文:"+a1+a2+a3+a4);
     //测试循环语句 switch for while break continue.
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

