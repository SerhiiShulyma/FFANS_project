import java.io.*;
import java.util.*;


public class ReadFile {
	
	private LinkedHashMap<String, String> ModAndConst =new LinkedHashMap<String, String>(); 
	private LinkedHashMap<String, Double> ConstAndValue =new LinkedHashMap<String, Double>();
	
	public LinkedHashMap<String, String> getModAndConst(){
		return ModAndConst;
	  }
	
	public LinkedHashMap<String, Double> getConstAndValue(){
		return ConstAndValue;
	  }
	String adress = "D:\\Workspace\\FFANS_Project\\ffans_project\\File_Ini\\ff_model_parameters.ini";
	
	{
		try (FileInputStream fin =new FileInputStream(adress)){
			BufferedReader br =new BufferedReader (new InputStreamReader(fin));
			
			String  strLine;
			String Modules=null;
			
			
			
			while((strLine=br.readLine())!=null) {
				
	            //exception of empty lines!!
	            if(strLine.length()==0) {
	            	continue;
	            }
	            
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
		} catch (IOException e) {
			System.out.println ("Input-Output Exception" + e);
		}
	}	
}
