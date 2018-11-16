import java.io.*;
import java.util.*;


public class ReadFile {
  {
	String adress="D:\\Workspace\\FFANS_Project\\ffans_project\\File_Ini\\ff_model_parameters.ini";
	
	try (FileInputStream fin =new FileInputStream(adress)){
		BufferedReader br =new BufferedReader (new InputStreamReader(fin));
		
		String  strLine ;
		String Modules=null;
		
//		ArrayList <String> comments =new ArrayList<String>();	
		LinkedHashMap<String, String> ModAndConst =new LinkedHashMap<String, String>(); 
		LinkedHashMap<String, Double> ConstAndValue =new LinkedHashMap<String, Double>(); 
		
		while((strLine=br.readLine())!=null) {
			
//exception of empty lines!!
            if(strLine.length()==0)
            	continue;
            
//comment reading!!
//            else if (strLine.charAt(0)==';') {
//            	String newString = RegularExpresion.SymbolReplacement (strLine, ";", "//");
//            	comments.add(newString);
//            }
            
//module definition 
            else if (strLine.charAt(0)=='[') {
            	Modules=strLine;
            }
            
//ModAndConst consist of constants' name and modules' name where they situated 
//ConstAndValue consist of constants' name and their's value which is represented in Double form                       
              
            else if ((RegularExpresion.FindSymbol(strLine, "="))&& (Modules!=null)){
            	  
            	    String Mass[]=RegularExpresion.StringSpliter(strLine, "[=]");   	    
            	    ModAndConst.put (Mass[0], Modules);
            	    ConstAndValue.put(Mass[0], Double.parseDouble(Mass[1]));        	 
            	}
		}
		
	
		Set<Map.Entry<String, String>> mac = ModAndConst.entrySet();
		for( Map.Entry<String, String> x : mac)
			System.out.println (x.getKey() + x.getValue());
		
		Set<Map.Entry<String, Double>> cav = ConstAndValue.entrySet();
		for( Map.Entry<String, Double> x: cav)
			System.out.println (x.getKey() + x.getValue());
		
	} catch (IOException e) {
		System.out.println ("Input-Output Exception" + e);
	} 
  }
}
