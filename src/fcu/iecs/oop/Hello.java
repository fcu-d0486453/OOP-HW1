package fcu.iecs.oop;

public class Hello 
{

	public static void main(String[] args)
	{
		//�N lyrics �r�ꤤ�� it ����"her"
		//�N lyrics �r�ꤤ�� Cannot ����"Can't"
		//�N�ഫ�r��᪺�r��L�X
		
		//String lyrics="Let it go! Let it go! Cannot hlod it back anymore";
		//�o�Ӽg�k��굥�P��H�U���g�k�A�ӥB�o�˦��إߪ��󪺩��T�y�q
		String lyrics=new String("Let it go! Let it go! Cannot hold it back anymore");
		
		String del_1=new String("it");
		String del_2=new String("Cannot");
		
		String rpl_1=new String("her");
		String rpl_2=new String("Can't");
		
		
		
		StringBuffer a=new StringBuffer(lyrics);
		
		System.out.println("Before: "+a+"\n�Nit�BCannot������");
		
		while(a.indexOf(del_1) != -1)
	//����"del_1" �N�L�q a�r�ꤤ�R�� �ô�����"rpl_1"
		{
			a.replace(a.indexOf(del_1)          /*�r�Y*/,
			   del_1.length()+a.indexOf(del_1)/*�r��*/,rpl_1);
		}
		while(a.indexOf(del_2) != -1)
		{
			a.replace(a.indexOf(del_2)          /*�r�Y*/,
			    del_2.length()+a.indexOf(del_2)/*�r��*/,rpl_2);
		}
		  System.out.println("After: "+a);
	}

}
