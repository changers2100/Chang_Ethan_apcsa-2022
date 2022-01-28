//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String list = "aeiouAEIOU";
		if (list.indexOf(a.charAt(0)) == -1 && list.indexOf(a.charAt(a.length()-1))==-1){  //if at position 0 there is no index in the list--return no;
			return "no";
		}
		else {
			return "yes";
		}
		
	}
}