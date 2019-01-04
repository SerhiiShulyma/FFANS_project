public class Main_Class {

	public static void main(String[] args) {
		Parameters param=new Parameters("D:\\Workspace\\FFANS_Project\\ffans_project\\File_Ini\\ff_model_parameters.ini");
//		double Ftot=param.F1+param.F2+param.F3+param.F4+param.F5+param.F6+param.F7+param.F8+param.F9+param.F10+param.F11+param.F12+param.F13+param.F14;
//		
//		System.out.println((param.F11+param.F12+param.F13+param.F14)/Ftot);
//		Random rn = new Random();
//		
//		for(int i=0; i<=5000; i++){
//			System.out.println(i+ "  " + RandomVariable.normal_rand());
//		}
		
		
//		Parameters param =new Parameters("D:\\Workspace\\FFANS_Project\\ffans_project\\File_Ini\\ff_model_parameters.ini");
        		
//		
//		for (int i=1; i<15; i++) {
//			System.out.println(param.ModelSizeDispersion[i].d);
//		}	
	//	new Model_Size_Dispersion_Init();
		Space s =new Space(0.3, 1, 3);
		for(int i=1; i<=param.pN; i++) {
		System.out.println("X"+i+"= "+ s.r[i].x +"   "+"Y"+i+"= "+ s.r[i].y+"   "+"Z"+i+"= "+ s.r[i].z);
		}

		
	}
}
