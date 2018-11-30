import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.*;


public class RegularExpresion {
	public static String SymbolReplacement (String s, String pattern, String newPattern) {
	    Pattern p = Pattern.compile(pattern);
	    Matcher mat =p.matcher(s);
	    s=mat.replaceAll(newPattern);
	    return s;
	}
	public static String[] StringSpliter (String s, String pattern) {
		//The pattern must be written as "[tokens]" where tokens are separating signs. 
		Pattern p =Pattern.compile(pattern);
    	String strs[]=p.split(s);
    	return strs;
	}
	public static boolean FindSymbol (String s, String pattern) {
		boolean b;
		if(s.indexOf(pattern)==-1)
			b=false;
		else 
			b=true;
		return b;
	}
	
	
	public static double Parse (String module, String constant, LinkedHashMap<String, String> MAC, LinkedHashMap<String, Double> CAV) {
		double c=0;
		Set<Map.Entry<String, String>> mac =MAC.entrySet();
		Set<Map.Entry<String, Double>> cav =CAV.entrySet();
		for (Map.Entry<String, String> x: mac) {
			if (constant.equals(x.getKey())&& module.equals(x.getValue())){
				for (Map.Entry<String, Double> y: cav) {
					if (constant.equals(y.getKey())){
						c=y.getValue();
						break;
					}
				}
			}  
		}
		return c;
	}
			
	
}
