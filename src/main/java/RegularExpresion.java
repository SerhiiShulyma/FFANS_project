
import java.util.regex.*;


public class RegularExpresion {
	//Symbol replacement in String 
	public static String SymbolReplacement (String s, String pattern, String newPattern) {
	    String newString;
		Pattern p = Pattern.compile(pattern);
	    Matcher mat =p.matcher(s);
	    newString=mat.replaceAll(newPattern);
	    return newString;
	}
	//String splitter
	public static String[] StringSpliter (String s, String pattern) {
		//The pattern must be written as "[tokens]" where tokens are separating signs. 
		Pattern p =Pattern.compile(pattern);
    	String strs[]=p.split(s);
    	return strs;
	}
	//Symbol finding in string 
	public static boolean FindSymbol (String s, String pattern) {
		boolean b;
		if(s.indexOf(pattern)==-1)
			b=false;
		else 
			b=true;
		return b;
	}	
}
