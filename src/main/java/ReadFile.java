import java.io.*;

public class ReadFile {
	int i;
	
  {
	try (FileInputStream fin =new FileInputStream("D:\\Workspace\\FFANS_Project\\ffans_project\\File_Ini\\text.ini")){
		do {
			i=fin.read();
			if (i!=-1)
				System.out.print((char) i);
		}
		while(i!=-1);
	} catch (IOException e) {
		System.out.println ("Input-Output Exception" + e);
	} 
	
  }
}
