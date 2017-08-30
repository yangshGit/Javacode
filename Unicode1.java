public class  Unicode1 
{   public static void main (String args[ ])
    { char chinaWord='你',japanWord='ぁ';int  p1=20320,p2=12353;
      System.out.println("汉字\'你\'在unicode表中的顺序位置:"+(int)chinaWord);
      System.out.println("日语\'ぁ\'在unicode表中的顺序位置:"+(int)japanWord); 
      System.out.println("unicode表中第20320位置上的字符是:"+(char)p1);
      System.out.println("unicode表中第12353位置上的字符是:"+(char)p2); 
    }
}
