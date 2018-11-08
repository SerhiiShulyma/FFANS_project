import java.io.*;

public class ReadFile {
	int i;
	FileInputStream fin = null;
  {
	try {
		fin = new FileInputStream ("D:\\Workspace\\FFANS_Project\\ffans_project\\File_Ini\\text.ini");
		do {
			i=fin.read();
			if (i!=-1)
				System.out.println((char) i);
		}
		while(i!=-1);
	} catch (IOException e) {
		System.out.println ("Input-Output Exception" + e);
	} finally {
		try {
			if (fin != null) fin.close();
		}catch (IOException e2) {
			System.out.println("Output file closing Exception"+ e2);
		}
	}
  }
}
