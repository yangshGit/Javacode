/* window中文件存储编码使用ansi 即可显示中文
1.中文操作系统默认ansi编码，生成的txt文件默认为ansi编码，所以，可以搜索出来。
2.unicode是国际通用编码，所以，可以搜索出来。
3.utf-8编码是unicode编码在网络之间（主要是网页）传输时的一种“变通”和“桥梁”编码。utf-8在网络之间传输时可以节约数据量。所以，使用操作系统无法搜索出txt文本。
按照utf-8创始人的愿望：
端（unicode）——传输（utf-8）——端（unicode）
但是，后来，许多网站开发者在开发网页时直接使用utf-8编码。
端（utf-8）——传输（utf-8）——端（utf-8）
*/

public class  Unicode1 
{   public static void main (String args[ ])
    { char chinaWord='你',japanWord='ぁ';int  p1=20320,p2=12353;
      System.out.println("汉字\'你\'在unicode表中的顺序位置:"+(int)chinaWord);
      System.out.println("日语\'ぁ\'在unicode表中的顺序位置:"+(int)japanWord); 
      System.out.println("unicode表中第20320位置上的字符是:"+(char)p1);
      System.out.println("unicode表中第12353位置上的字符是:"+(char)p2); 
    }
}
