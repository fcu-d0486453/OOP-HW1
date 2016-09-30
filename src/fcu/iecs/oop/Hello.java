package fcu.iecs.oop;

public class Hello 
{

	public static void main(String[] args)
	{
		//將 lyrics 字串中的 it 換成"her"
		//將 lyrics 字串中的 Cannot 換成"Can't"
		//將轉換字串後的字串印出
		
		//String lyrics="Let it go! Let it go! Cannot hlod it back anymore";
		//這個寫法其實等同於以下的寫法，而且這樣有建立物件的明確語義
		String lyrics=new String("Let it go! Let it go! Cannot hold it back anymore");
		
		String del_1=new String("it");
		String del_2=new String("Cannot");
		
		String rpl_1=new String("her");
		String rpl_2=new String("Can't");
		
		
		
		StringBuffer a=new StringBuffer(lyrics);
		
		System.out.println("Before: "+a+"\n將it、Cannot替換掉");
		
		while(a.indexOf(del_1) != -1)
	//當找到"del_1" 將他從 a字串中刪除 並替換成"rpl_1"
		{
			a.replace(a.indexOf(del_1)          /*字頭*/,
			   del_1.length()+a.indexOf(del_1)/*字尾*/,rpl_1);
		}
		while(a.indexOf(del_2) != -1)
		{
			a.replace(a.indexOf(del_2)          /*字頭*/,
			    del_2.length()+a.indexOf(del_2)/*字尾*/,rpl_2);
		}
		  System.out.println("After: "+a);
	}

}
