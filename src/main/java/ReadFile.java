import java.io.*;
import java.util.*;



public class ReadFile {
	
	private LinkedHashMap<String, LinkedHashMap<String, String>> modulesConstantsAndValues= new LinkedHashMap<String, LinkedHashMap<String,String>>();
	private LinkedHashMap<String, String> constantsAndValues =new LinkedHashMap<String, String>();
	
	public ReadFile(String path)
    {
		try (FileInputStream fin =new FileInputStream(path)){
			BufferedReader br =new BufferedReader (new InputStreamReader(fin));
			
			String  strLine;
			String Modules=null;
	
			while((strLine=br.readLine())!=null) {
	            //exception of empty lines!!
	            if(strLine.length()==0) {continue;}
	            
	            //module definition and writing modules name in HashMap 
	            else if (strLine.charAt(0)=='[') {
	            	if(Modules!=null) {
	            		modulesConstantsAndValues.put(Modules, constantsAndValues);
	            		constantsAndValues=new LinkedHashMap<String, String>();
	            	}
	            	Modules=RegularExpresion.SymbolReplacement(strLine, "[\\[\\]]", "");
	            }
	            //String dividing on two parts( constants and its values) and writing in HashMap                       
	            else if ((RegularExpresion.FindSymbol(strLine, "="))){
	            	//delete spaces from string
	            	strLine=RegularExpresion.SymbolReplacement(strLine, "\\s+", "");
	            	String constantsValue[]=RegularExpresion.StringSpliter(strLine, "[=]");  
	            	constantsAndValues.put(constantsValue[0], constantsValue[1]);            	
	            	}
			}
		//last module writing in HashMap 
		modulesConstantsAndValues.put(Modules, constantsAndValues);		
		} catch (IOException e) {
			System.out.println ("Input-Output Exception" + e);
		}
	};
	//Output value from LinkedHashMap as String
	String get (String module, String variable) {
		return modulesConstantsAndValues.get(module).get(variable);
	}
	//Output value from LinkedHashMap as Integer
	int get (String module, String variable, int a) {
		return Integer.parseInt(modulesConstantsAndValues.get(module).get(variable));
	}
	//Output value from LinkedHashMap as Double 
	double get (String module, String variable, double a) {
		return Double.parseDouble(modulesConstantsAndValues.get(module).get(variable));
	}	
}
