public class Model_Size_Dispersion_Init {
	Parameters param=new Parameters("D:\\Workspace\\FFANS_Project\\ffans_project\\File_Ini\\ff_model_parameters.ini");
	int i,p;
	double Ftot=0;
	double random_points[]=new double [param.pN+1];
	double random_value;
	double large_fraction_tmp=0;
	int is_set=0;
	int i_min;
	double   V0_large_EV    =0;//mathematical expected value of largest particles total volume// see is_large_mode variable
	double   V0_tot_EV      =0;//mathematical expected value of particles total volume
	double	 Rp0[];         // particles' radius WITHOUT oleic acid
	double	 Rp[] ;         // particles' radius WITH oleic acid
	public Model_Size_Dispersion_Init(){
		Rp0          =new double [param.pN+1];
		Rp           =new double [param.pN+1];
//		for (int i=1; i<=param.N_points; i++) {
//			param.Diameter_And_Concentration[i].x *=1E-10;
//			Ftot +=param.Diameter_And_Concentration[i].y;
//		}
//		
//		if (param.is_large_mode) {
//			int i=param.N_points;
//			while ((i>=1) &&(large_fraction_tmp < param.large_fraction)) {
//				large_fraction_tmp += param.Diameter_And_Concentration[i].y/Ftot;
//				i--;
//			}
//			i_min=i+1;
//		}
//		
//		for(int i=1; i<=param.N_points; i++) {
//			Rp0[1]=0.5*param.Diameter_And_Concentration[i].x;
//			//ff_model_dispersion_param_calc....
//			V0_tot_EV +=Vp0[1]*param.Diameter_And_Concentration[i].y/Ftot;
//		}
		for (int j=1; j<=param.pN; j++) {
			Rp0[j]=15*1E-9;
			Rp[j]=Rp0[j]+param.delta;
			
		}
	}
}
