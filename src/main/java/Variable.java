public class Variable {
	
	Parameters par= new Parameters ("D:\\Workspace\\FFANS_Project\\ffans_project\\File_Ini\\ff_model_parameters.ini"); 
	int                       pN = par.pN;//number of particles
	
	FF_Coordinate_Vector_3D r[]				    =new FF_Coordinate_Vector_3D[pN+1];//particles position
	double					  Rp_to_c[]			=new double[pN+1];//
	FF_Coordinate_Vector_3D m[]				    =new FF_Coordinate_Vector_3D[pN+1];//particles magnetic moment direction
	FF_Coordinate_Vector_3D mt[]				=new FF_Coordinate_Vector_3D[pN+1];//
	FF_Coordinate_Vector_3D m_prev[]			=new FF_Coordinate_Vector_3D[pN+1];//
	FF_Coordinate_Vector_3D m_prev_before_r[]   =new FF_Coordinate_Vector_3D[pN+1];//magnetic moment direction before random motion
	int                       m_sat[]		    =new int[pN+1];//
	
	FF_Coordinate_Vector_3D F[]				    =new FF_Coordinate_Vector_3D[pN+1];//mean force 
	FF_Coordinate_Vector_3D F1[]			  	=new FF_Coordinate_Vector_3D[pN+1];//force at the t=t
	FF_Coordinate_Vector_3D F2[]			    =new FF_Coordinate_Vector_3D[pN+1];//force at the t=t+dt
	FF_Coordinate_Vector_3D tau[]			    =new FF_Coordinate_Vector_3D[pN+1];//mean torque 
	FF_Coordinate_Vector_3D tau1[]		        =new FF_Coordinate_Vector_3D[pN+1];//torque at the t=t
	FF_Coordinate_Vector_3D tau2[]              =new FF_Coordinate_Vector_3D[pN+1];//torque at the t=t+dt
	
	FF_Coordinate_Vector_3D v[]				    =new FF_Coordinate_Vector_3D[pN+1];//velocity vector
	FF_Coordinate_Vector_3D w[]				    =new FF_Coordinate_Vector_3D[pN+1];//angular velocity vector
	
	FF_Coordinate_Vector_3D drt[]				=new FF_Coordinate_Vector_3D[pN+1];//
	FF_Coordinate_Vector_3D drt_r[]			    =new FF_Coordinate_Vector_3D[pN+1];//instantiated random translation
	FF_Coordinate_Vector_3D dvt[]				=new FF_Coordinate_Vector_3D[pN+1];//
	FF_Coordinate_Vector_3D dvt_r[]			    =new FF_Coordinate_Vector_3D[pN+1];//
	FF_Coordinate_Vector_3D dphi[]			    =new FF_Coordinate_Vector_3D[pN+1];//
	FF_Coordinate_Vector_3D dphi_r[]			=new FF_Coordinate_Vector_3D[pN+1];//instantiated random rotation
	FF_Coordinate_Vector_3D dw[]				=new FF_Coordinate_Vector_3D[pN+1];//
	FF_Coordinate_Vector_3D dw_r[]			    =new FF_Coordinate_Vector_3D[pN+1];//
	
	long     i_min          =1;
	double   V0_tot         =0;//total volume of the dispersed phase
	double   V0_large_EV    =0;//mathematical expected value of largest particles total volume// see is_large_mode variable
	double   V0_tot_EV      =0;//mathematical expected value of particles total volume
	double   I_glob         =0;//
	double   phi_vol_fract  =0;//
	
	int		 exist_p[]      =new int [pN+1];//particle existence; number of primary aggregate inside
	int 	 is_neel[]      =new int [pN+1];//Neel relaxation
	int 	 is_temp_sat[]  =new int [pN+1];//temperature saturation flag
	double	 Rp0[]          =new double [pN+1];//
	double 	 Rp[]           =new double [pN+1];//
	double   Vp0[]          =new double [pN+1];//
	double   Vpfull[]       =new double [pN+1];//including steric layer
	double   m0p[]          =new double [pN+1];//
	double   M0p[]          =new double [pN+1];//
	double   I0p[]          =new double [pN+1];//particle moment of inertia
	double   r0modp[]       =new double [pN+1];//
	double   C2[]           =new double [pN+1];//
	double   gamma_rot[]    =new double [pN+1];//
	
	int 	 time_go        =0;
	
	double 	 dt             =0;
	double   t              =0; // time
	double   t_temp         =0; // temperature, [C]
	double   T_basic        =0; // 
	double   T_mean       	=0; // 
	long     Ek				=0; // 
	long     Ek_rot			=0; // 
	long     Ek_tr			=0; // 
 
	FF_Coordinate_Vector_3D 	Ekp[] 		= new FF_Coordinate_Vector_3D[pN+1];//
	FF_Coordinate_Vector_3D 	Ekp_rot[] 	= new FF_Coordinate_Vector_3D[pN+1];//
	
	double	 G_dd[]		=new double [pN+1];
	double   g_Bz_prev;
	long     step       =0;
	
	double   kB 		=0;
	int      hyst_mode  =1;
	double   mz_tot;
	double   mz_glob	=0; //global mean average start from the hyst. point switch
	
	FF_Coordinate_Vector_3D 	m_tot_glob;//
	
	double   BmanX=0;//
	double	 BmanY=0;//
	double 	 BmanZ=0;//
	
	boolean  isEtaCarSet =false;//
	
	FF_Coordinate_Vector_3D m_tot; //
	FF_Coordinate_Vector_3D dir110[]            =new FF_Coordinate_Vector_3D[13]; //
	FF_Coordinate_Vector_3D r_brown_valid_0; //
	
	double   d[]        =new double [14+1];
	double   dt_red     =0;//reducing time indicator for the random translation
	long     pN0        =pN;
	double   R0_min;
	
	
	

}
