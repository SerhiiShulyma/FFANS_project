
public class Parameters {
	ReadFile rf;
	public double pi;
	public double mu0;
	public double muB;
	public double R;
	public double Na;
	public double g;
	public double kb;
	public double ta0;
	public double gamma_e;
	public double gl_scale;
	public double nano_size;
	public double delta_r_init;
	public double is_periodic;
	public double a0;
	public double dt_neel;
	public double d_neel;
	public double d_min;
	public double delta;
	public double eta_oleic;
	public double a3_eta_oleic;
	public double a2_eta_oleic;
	public double a1_eta_oleic;
	public double a0_eta_oleic;
	public int    ro_oleic;
	public double mol_mass_oleic;
	public int    rop;
	public double A_H ;
	public double N_oa;
	public double k_o;
	public double K1;
	public double Ms;
	public int    ro0;
	public double eta_car0;
	public double eta_car;
	public double mol_mass_car;
	public double alpha_damp;
	public int    T; 	 	           
	public double v_oleic;
	public double v_car;
	public double gradPerc;
	public int    BmanX;
	public int    BmanY;
	public int    BmanZ;
	public int    pN;
	public int    isAutoSetPosition;
	public double distances;
	public int    isShowInfo;
	public double dt0;
	public int    slow_steps;
	public double smooth_r;
	public boolean    is_large_mode;
	public double large_fraction;
	public double k_large;
	public int    load_at_start;
	public int    auto_save;
	public int    manual_field_control;
	public int    ext_field_is_homo;
	public int    auto_reversal;
	public int    setting_plot;
	public boolean    start_ideal;
	public int    ScreenCaptureStep;
	public int    AnalysisStep;
	Vector_2D []  Diameter_And_Concentration;
	int           N_points;
	public int    PositionMax;
	public double x1;
	public double y1;
	public double z1;
	public int    pts1;
	public double x2;
	public double y2;
	public double z2;
	public int    pts2;
	public double x3;
	public double y3;
	public double z3;
	public int    pts3;
	public double x4;
	public double y4;
	public double z4;
	public int    pts4;
	public double x5;
	public double y5;
	public double z5;
	public int    pts5;
	public double x6;
	public double y6;
	public double z6;
	public int    pts6;
	public int    n;
	Vector_2D []  Temperature_And_Viscosity; 
	CameraPosition []  SetPosition;
	public int    FileType;
	//Constants
	double kr; 
	double delta_r;
	double mass_oleic;
	double B0;
	double C1;
	double C5;
	double mass_car;
	double start_scale;
	double dt;
	double N_o;
	double t_temp;
	
	
	public Parameters (String path) {
		rf=new ReadFile(path);
	
	                            //Mathematical Constants
	pi                   = rf.get("MathConst", "pi",      1.0);
								//Physics Constants
	mu0                  = rf.get("PhysConst", "mu0",     1.0); 
	muB			 	     = rf.get("PhysConst", "muB", 	  1.0);
	R 		     	     = rf.get("PhysConst", "R", 	  1.0);
	Na 		     	     = rf.get("PhysConst", "Na",      1.0);
	g 		     	     = rf.get("PhysConst", "g",       1.0);
	kb 		     	     = rf.get("PhysConst", "kb",      1.0);
	ta0 		         = rf.get("PhysConst", "ta0",     1.0);
	gamma_e        	     = rf.get("PhysConst", "gamma_e", 1.0);
	 							//Space Parameters
	gl_scale       	     = rf.get("Space", "gl_scale",     1.0);
	nano_size      	     = rf.get("Space", "nano_size",    1.0);
	delta_r_init    	 = rf.get("Space", "delta_r_init", 1.0);
	is_periodic     	 = rf.get("Space", "is_periodic",  1.0);
	 						 	//Experimental Parameters of Materials
	a0 	 	     	     = rf.get("ExperimentalMaterial", "a0",             1.0);
	dt_neel 	 	     = rf.get("ExperimentalMaterial", "dt_neel",        1.0);
	d_neel 	 	 	     = rf.get("ExperimentalMaterial", "d_neel",         1.0);
	d_min 	 	 	     = rf.get("ExperimentalMaterial", "d_min",          1.0);
	delta 	 	 	     = rf.get("ExperimentalMaterial", "delta",          1.0);
	eta_oleic 	 	     = rf.get("ExperimentalMaterial", "eta_oleic",      1.0);
	a3_eta_oleic 	 	 = rf.get("ExperimentalMaterial", "a3_eta_oleic",   1.0);
	a2_eta_oleic 	 	 = rf.get("ExperimentalMaterial", "a2_eta_oleic",   1.0);
	a1_eta_oleic 		 = rf.get("ExperimentalMaterial", "a1_eta_oleic",   1.0);
	a0_eta_oleic 	     = rf.get("ExperimentalMaterial", "a0_eta_oleic",   1.0);
    ro_oleic 	 	     = rf.get("ExperimentalMaterial", "ro_oleic",       -5);
	mol_mass_oleic       = rf.get("ExperimentalMaterial", "mol_mass_oleic", 1.0);
	rop 	 	     	 = rf.get("ExperimentalMaterial", "rop",            -5);
	A_H 			 	 = rf.get("ExperimentalMaterial", "A_H",            1.0);
	N_oa 	 		 	 = rf.get("ExperimentalMaterial", "N_oa",           1.0);
	k_o 	 		 	 = rf.get("ExperimentalMaterial", "k_o",            1.0);
	K1 	 		 	     = rf.get("ExperimentalMaterial", "K1",             1.0);
	Ms 	 		 	     = rf.get("ExperimentalMaterial", "Ms",             1.0);
	ro0 	 	     	 = rf.get("ExperimentalMaterial", "ro0",            -5);
	eta_car0 			 = rf.get("ExperimentalMaterial", "eta_car0",       1.0);
	eta_car 	         = rf.get("ExperimentalMaterial", "eta_car",        1.0);
	mol_mass_car 	     = rf.get("ExperimentalMaterial", "mol_mass_car",   1.0);
	alpha_damp 	         = rf.get("ExperimentalMaterial", "alpha_damp",     1.0);
	 					      //Experimental Conditions 
	T 	 	             = rf.get("ExperimentalConditions", "T",        -5);
	v_oleic 		     = rf.get("ExperimentalConditions", "v_oleic",  1.0);
	v_car 	             = rf.get("ExperimentalConditions", "v_car",    1.0);
	gradPerc 	 	     = rf.get("ExperimentalConditions", "gradPerc", 1.0);
	BmanX 	 	         = rf.get("ExperimentalConditions", "BmanX",    -5);
	BmanY 	 	         = rf.get("ExperimentalConditions", "BmanY",    -5);
	BmanZ 	 	         = rf.get("ExperimentalConditions", "BmanZ",    -5);
	pN  	 	         = rf.get("ExperimentalConditions", "pN",    -5);
	                          //Simulation Setup
	isAutoSetPosition    = rf.get("SimulationSetup", "isAutoSetPosition",     -5);
	distances 	         = rf.get("SimulationSetup", "distances", 			  1.0);
	isShowInfo           = rf.get("SimulationSetup", "isShowInfo",		      -5);
	dt0        	         = rf.get("SimulationSetup", "dt0",                   1.0);
	slow_steps           = rf.get("SimulationSetup", "slow_steps",            -5);
	smooth_r  	         = rf.get("SimulationSetup", "smooth_r", 		      1.0);
	is_large_mode        = rf.get("SimulationSetup", "is_large_mode",         true);
	large_fraction       = rf.get("SimulationSetup", "large_fraction",        1.0);
	k_large  	         = rf.get("SimulationSetup", "k_large",               1.0);
	load_at_start        = rf.get("SimulationSetup", "load_at_start",         -5);
	auto_save 		     = rf.get("SimulationSetup", "auto_save", 			  -5);
	manual_field_control = rf.get("SimulationSetup", "manual_field_control",  -5);
	ext_field_is_homo    = rf.get("SimulationSetup", "ext_field_is_homo", 	  -5);
	auto_reversal  	     = rf.get("SimulationSetup", "auto_reversal",	      -5);
	setting_plot         = rf.get("SimulationSetup", "setting_plot",		  -5);
	start_ideal  	     = rf.get("SimulationSetup", "start_ideal",           true);
	ScreenCaptureStep    = rf.get("SimulationSetup", "ScreenCaptureStep",     -5);
	AnalysisStep   	     = rf.get("SimulationSetup", "AnalysisStep",          -5);
	
						        //Model Size Dispersion
	N_points 			=rf.get("ModelSizeDispersion", "N_points", -5);
	Diameter_And_Concentration= new Vector_2D[15];
	for (int i=1; i<=N_points; i++) {
		String d="d"+i;
		String F="F"+i;
		Diameter_And_Concentration[i]=new Vector_2D(rf.get("ModelSizeDispersion", d,  1.0), rf.get("ModelSizeDispersion", F,  1.0));
	}
	
								 // Set Position
	PositionMax          = rf.get("SetPosition", "PositionMax", -5);
	SetPosition =new CameraPosition [PositionMax+1];
	for (int i=1; i<=PositionMax; i++) {
		String x="x"+i;
		String y="y"+i;
		String z="z"+i;
		String pts="pts"+i;
		SetPosition[i]=new CameraPosition(rf.get("SetPosition", x, 1.0), rf.get("SetPosition", y, 1.0), rf.get("SetPosition", z, 1.0), rf.get("SetPosition", pts, -5));
	}
	
		                        //EtaCarPoints
	n                    = rf.get("EtaCarPoints", "n",   -5);
	
	Temperature_And_Viscosity = new Vector_2D [n];
	for (int i=0; i<n; i++)
	{
		String T="T"+i;
		String eta="eta"+i;		
		Temperature_And_Viscosity[i]=new Vector_2D (rf.get("EtaCarPoints", T,  1.0), rf.get("EtaCarPoints", eta,  1.0));
	}

									//Image   Settings
	FileType             = rf.get("ImageSettings", "FileType", -5);
	
	// Constants
	kr					=gl_scale; 
	delta_r				=0.5*a0;
	mass_oleic			=ro_oleic*v_oleic;
	B0					=2500*79.577*mu0;
	C1					=3*mu0/(4*pi);
	C5					=mu0/(4*pi);
	mass_car			=ro0*v_car;
	start_scale			=0.99;
	dt					=dt0;
    N_o					=(N_oa*k_o)/0.5;
    t_temp				=T+ta0;
    
   
    
	}
	public double ViscosityOfOleicAcids () {
		 if(t_temp>90) t_temp=90;
		    if(t_temp<20) t_temp=20;
		return eta_oleic=(a3_eta_oleic*Math.pow(t_temp, 3))+
		   (a2_eta_oleic*Math.pow(t_temp, 2))+
		   (a1_eta_oleic*Math.pow(t_temp, 1))+ a0_eta_oleic;
	}
	
}
