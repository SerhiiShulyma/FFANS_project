import java.util.*;

public class Parameters {
	ReadFile rf =new ReadFile();
	
	LinkedHashMap <String, String> ModAndConst =rf.getModAndConst();
	LinkedHashMap <String, Double> ConstAndValue =rf.getConstAndValue();

	private double pi= RegularExpresion.Parse("[MathConst]", "pi ", ModAndConst, ConstAndValue);
	
	private double mu0= RegularExpresion.Parse("[PhysConst]", "mu0 ", ModAndConst, ConstAndValue);
	private double muB= RegularExpresion.Parse("[PhysConst]", "muB ", ModAndConst, ConstAndValue);
	private double R= RegularExpresion.Parse("[PhysConst]", "R ", ModAndConst, ConstAndValue);
	private double Na= RegularExpresion.Parse("[PhysConst]", "Na ", ModAndConst, ConstAndValue);
	private double g= RegularExpresion.Parse("[PhysConst]", "g ", ModAndConst, ConstAndValue);
	private double kb= RegularExpresion.Parse("[PhysConst]", "kb ", ModAndConst, ConstAndValue);
	private double ta0= RegularExpresion.Parse("[PhysConst]", "ta0 ", ModAndConst, ConstAndValue);
	private double gamma_e= RegularExpresion.Parse("[PhysConst]", "gamma_e ", ModAndConst, ConstAndValue);
	
	private double gl_scale= RegularExpresion.Parse("[Space]", "gl_scale ", ModAndConst, ConstAndValue);
	private double nano_size= RegularExpresion.Parse("[Space]", "nano_size ", ModAndConst, ConstAndValue);
	private double delta_r_init= RegularExpresion.Parse("[Space]", "delta_r_init ", ModAndConst, ConstAndValue);
	private double is_periodic= RegularExpresion.Parse("[Space]", "is_periodic ", ModAndConst, ConstAndValue);
	
	private double a0= RegularExpresion.Parse("[ExperimentalMaterial]", "a0 ", ModAndConst, ConstAndValue);
	private double dt_neel= RegularExpresion.Parse("[ExperimentalMaterial]", "dt_neel ", ModAndConst, ConstAndValue);
	private double d_neel= RegularExpresion.Parse("[ExperimentalMaterial]", "d_neel ", ModAndConst, ConstAndValue);
	private double d_min= RegularExpresion.Parse("[ExperimentalMaterial]", "d_min ", ModAndConst, ConstAndValue);
	private double delta= RegularExpresion.Parse("[ExperimentalMaterial]", "delta ", ModAndConst, ConstAndValue);
	private double eta_oleic= RegularExpresion.Parse("[ExperimentalMaterial]", "eta_oleic ", ModAndConst, ConstAndValue);
	private double a3_eta_oleic= RegularExpresion.Parse("[ExperimentalMaterial]", "a3_eta_oleic ", ModAndConst, ConstAndValue);
	private double a2_eta_oleic= RegularExpresion.Parse("[ExperimentalMaterial]", "a2_eta_oleic ", ModAndConst, ConstAndValue);
	private double a1_eta_oleic= RegularExpresion.Parse("[ExperimentalMaterial]", "a1_eta_oleic ", ModAndConst, ConstAndValue);
	private double a0_eta_oleic= RegularExpresion.Parse("[ExperimentalMaterial]", "a0_eta_oleic ", ModAndConst, ConstAndValue);
	private double ro_oleic= RegularExpresion.Parse("[ExperimentalMaterial]", "ro_oleic ", ModAndConst, ConstAndValue);
	private double mol_mass_oleic= RegularExpresion.Parse("[ExperimentalMaterial]", "mol_mass_oleic ", ModAndConst, ConstAndValue);
	private double A_H= RegularExpresion.Parse("[ExperimentalMaterial]", "A_H ", ModAndConst, ConstAndValue);
	private double N_oa= RegularExpresion.Parse("[ExperimentalMaterial]", "N_oa ", ModAndConst, ConstAndValue);
	private double k_o= RegularExpresion.Parse("[ExperimentalMaterial]", "k_o ", ModAndConst, ConstAndValue);
	private double K1= RegularExpresion.Parse("[ExperimentalMaterial]", "K1 ", ModAndConst, ConstAndValue);
	private double Ms= RegularExpresion.Parse("[ExperimentalMaterial]", "Ms ", ModAndConst, ConstAndValue);
	private double ro0= RegularExpresion.Parse("[ExperimentalMaterial]", "ro0 ", ModAndConst, ConstAndValue);
	private double eta_car0= RegularExpresion.Parse("[ExperimentalMaterial]", "eta_car0 ", ModAndConst, ConstAndValue);
	private double eta_car= RegularExpresion.Parse("[ExperimentalMaterial]", "eta_car ", ModAndConst, ConstAndValue);
	private double mol_mass_car= RegularExpresion.Parse("[ExperimentalMaterial]", "mol_mass_car ", ModAndConst, ConstAndValue);
	private double alpha_damp= RegularExpresion.Parse("[ExperimentalMaterial]", "alpha_damp ", ModAndConst, ConstAndValue);
	
	private double T= RegularExpresion.Parse("[ExperimentalConditions]", "T ", ModAndConst, ConstAndValue);
	private double v_oleic= RegularExpresion.Parse("[ExperimentalConditions]", "v_oleic ", ModAndConst, ConstAndValue);
	private double v_car= RegularExpresion.Parse("[ExperimentalConditions]", "v_car ", ModAndConst, ConstAndValue);
	private double gradPerc= RegularExpresion.Parse("[ExperimentalConditions]", "gradPerc ", ModAndConst, ConstAndValue);
	private double BmanX= RegularExpresion.Parse("[ExperimentalConditions]", "BmanX ", ModAndConst, ConstAndValue);
	private double BmanY= RegularExpresion.Parse("[ExperimentalConditions]", "BmanY ", ModAndConst, ConstAndValue);
	private double BmanZ= RegularExpresion.Parse("[ExperimentalConditions]", "BmanZ ", ModAndConst, ConstAndValue);
	
	private double isAutoSetPosition= RegularExpresion.Parse("[SimulationSetup]", "isAutoSetPosition ", ModAndConst, ConstAndValue);
	private double distances= RegularExpresion.Parse("[SimulationSetup]", "distances ", ModAndConst, ConstAndValue);
	private double isShowInfo= RegularExpresion.Parse("[SimulationSetup]", "isShowInfo ", ModAndConst, ConstAndValue);
	private double dt0= RegularExpresion.Parse("[SimulationSetup]", "dt0 ", ModAndConst, ConstAndValue);
	private double slow_steps= RegularExpresion.Parse("[SimulationSetup]", "slow_steps ", ModAndConst, ConstAndValue);
	private double smooth_r= RegularExpresion.Parse("[SimulationSetup]", "smooth_r ", ModAndConst, ConstAndValue);
	private double is_large_mode= RegularExpresion.Parse("[SimulationSetup]", "is_large_mode ", ModAndConst, ConstAndValue);
	private double large_fraction= RegularExpresion.Parse("[SimulationSetup]", "large_fraction ", ModAndConst, ConstAndValue);
	private double k_large= RegularExpresion.Parse("[SimulationSetup]", "k_large ", ModAndConst, ConstAndValue);
	private double load_at_start= RegularExpresion.Parse("[SimulationSetup]", "load_at_start ", ModAndConst, ConstAndValue);
	private double auto_save= RegularExpresion.Parse("[SimulationSetup]", "auto_save ", ModAndConst, ConstAndValue);
	private double manual_field_control= RegularExpresion.Parse("[SimulationSetup]", "manual_field_control ", ModAndConst, ConstAndValue);
	private double ext_field_is_homo= RegularExpresion.Parse("[SimulationSetup]", "ext_field_is_homo ", ModAndConst, ConstAndValue);
	private double auto_reversal= RegularExpresion.Parse("[SimulationSetup]", "auto_reversal ", ModAndConst, ConstAndValue);
	private double setting_plot= RegularExpresion.Parse("[SimulationSetup]", "setting_plot ", ModAndConst, ConstAndValue);
	private double start_ideal= RegularExpresion.Parse("[SimulationSetup]", "start_ideal ", ModAndConst, ConstAndValue);
	private double ScreenCaptureStep= RegularExpresion.Parse("[SimulationSetup]", "ScreenCaptureStep ", ModAndConst, ConstAndValue);
	private double AnalysisStep= RegularExpresion.Parse("[SimulationSetup]", "AnalysisStep ", ModAndConst, ConstAndValue);
	
	private double d1= RegularExpresion.Parse("[ModelSizeDispersion]", "d1 ", ModAndConst, ConstAndValue);
	private double F1= RegularExpresion.Parse("[ModelSizeDispersion]", "F1 ", ModAndConst, ConstAndValue);
	private double d2= RegularExpresion.Parse("[ModelSizeDispersion]", "d2 ", ModAndConst, ConstAndValue);
	private double F2= RegularExpresion.Parse("[ModelSizeDispersion]", "F2 ", ModAndConst, ConstAndValue);
	private double d3= RegularExpresion.Parse("[ModelSizeDispersion]", "d3 ", ModAndConst, ConstAndValue);
	private double F3= RegularExpresion.Parse("[ModelSizeDispersion]", "F3 ", ModAndConst, ConstAndValue);
	private double d4= RegularExpresion.Parse("[ModelSizeDispersion]", "d4 ", ModAndConst, ConstAndValue);
	private double F4= RegularExpresion.Parse("[ModelSizeDispersion]", "F4 ", ModAndConst, ConstAndValue);
	private double d5= RegularExpresion.Parse("[ModelSizeDispersion]", "d5 ", ModAndConst, ConstAndValue);
	private double F5= RegularExpresion.Parse("[ModelSizeDispersion]", "F5 ", ModAndConst, ConstAndValue);
	private double d6= RegularExpresion.Parse("[ModelSizeDispersion]", "d6 ", ModAndConst, ConstAndValue);
	private double F6= RegularExpresion.Parse("[ModelSizeDispersion]", "F6 ", ModAndConst, ConstAndValue);
	private double d7= RegularExpresion.Parse("[ModelSizeDispersion]", "d7 ", ModAndConst, ConstAndValue);
	private double F7= RegularExpresion.Parse("[ModelSizeDispersion]", "F7 ", ModAndConst, ConstAndValue);
	private double d8= RegularExpresion.Parse("[ModelSizeDispersion]", "d8 ", ModAndConst, ConstAndValue);
	private double F8= RegularExpresion.Parse("[ModelSizeDispersion]", "F8 ", ModAndConst, ConstAndValue);
	private double d9= RegularExpresion.Parse("[ModelSizeDispersion]", "d9 ", ModAndConst, ConstAndValue);
	private double F9= RegularExpresion.Parse("[ModelSizeDispersion]", "F9 ", ModAndConst, ConstAndValue);
	private double d10= RegularExpresion.Parse("[ModelSizeDispersion]", "d10 ", ModAndConst, ConstAndValue);
	private double F10= RegularExpresion.Parse("[ModelSizeDispersion]", "F10 ", ModAndConst, ConstAndValue);
	private double d11= RegularExpresion.Parse("[ModelSizeDispersion]", "d11 ", ModAndConst, ConstAndValue);
	private double F11= RegularExpresion.Parse("[ModelSizeDispersion]", "F11 ", ModAndConst, ConstAndValue);
	private double d12= RegularExpresion.Parse("[ModelSizeDispersion]", "d12 ", ModAndConst, ConstAndValue);
	private double F12= RegularExpresion.Parse("[ModelSizeDispersion]", "F12 ", ModAndConst, ConstAndValue);
	private double d13= RegularExpresion.Parse("[ModelSizeDispersion]", "d13 ", ModAndConst, ConstAndValue);
	private double F13= RegularExpresion.Parse("[ModelSizeDispersion]", "F13 ", ModAndConst, ConstAndValue);
	private double d14= RegularExpresion.Parse("[ModelSizeDispersion]", "d14 ", ModAndConst, ConstAndValue);
	private double F14= RegularExpresion.Parse("[ModelSizeDispersion]", "F14 ", ModAndConst, ConstAndValue);

	private double PositionMax= RegularExpresion.Parse("[SetPosition]", "PositionMax ", ModAndConst, ConstAndValue);
	private double x1= RegularExpresion.Parse("[SetPosition]", "x1 ", ModAndConst, ConstAndValue);
	private double y1= RegularExpresion.Parse("[SetPosition]", "y1 ", ModAndConst, ConstAndValue);
	private double z1= RegularExpresion.Parse("[SetPosition]", "z1 ", ModAndConst, ConstAndValue);
	private double pts1= RegularExpresion.Parse("[SetPosition]", "pts1 ", ModAndConst, ConstAndValue);
	private double x2= RegularExpresion.Parse("[SetPosition]", "x2 ", ModAndConst, ConstAndValue);
	private double y2= RegularExpresion.Parse("[SetPosition]", "y2 ", ModAndConst, ConstAndValue);
	private double z2= RegularExpresion.Parse("[SetPosition]", "z2 ", ModAndConst, ConstAndValue);
	private double pts2= RegularExpresion.Parse("[SetPosition]", "pts2 ", ModAndConst, ConstAndValue);
	private double x3= RegularExpresion.Parse("[SetPosition]", "x3 ", ModAndConst, ConstAndValue);
	private double y3= RegularExpresion.Parse("[SetPosition]", "y3 ", ModAndConst, ConstAndValue);
	private double z3= RegularExpresion.Parse("[SetPosition]", "z3 ", ModAndConst, ConstAndValue);
	private double pts3= RegularExpresion.Parse("[SetPosition]", "pts3 ", ModAndConst, ConstAndValue);
	private double x4= RegularExpresion.Parse("[SetPosition]", "x4 ", ModAndConst, ConstAndValue);
	private double y4= RegularExpresion.Parse("[SetPosition]", "y4 ", ModAndConst, ConstAndValue);
	private double z4= RegularExpresion.Parse("[SetPosition]", "z4 ", ModAndConst, ConstAndValue);
	private double pts4= RegularExpresion.Parse("[SetPosition]", "pts4 ", ModAndConst, ConstAndValue);
	private double x5= RegularExpresion.Parse("[SetPosition]", "x5 ", ModAndConst, ConstAndValue);
	private double y5= RegularExpresion.Parse("[SetPosition]", "y5 ", ModAndConst, ConstAndValue);
	private double z5= RegularExpresion.Parse("[SetPosition]", "z5 ", ModAndConst, ConstAndValue);
	private double pts5= RegularExpresion.Parse("[SetPosition]", "pts5 ", ModAndConst, ConstAndValue);
	private double x6= RegularExpresion.Parse("[SetPosition]", "x6 ", ModAndConst, ConstAndValue);
	private double y6= RegularExpresion.Parse("[SetPosition]", "y6 ", ModAndConst, ConstAndValue);
	private double z6= RegularExpresion.Parse("[SetPosition]", "z6 ", ModAndConst, ConstAndValue);
	private double pts6= RegularExpresion.Parse("[SetPosition]", "pts6 ", ModAndConst, ConstAndValue);
	
	private double n= RegularExpresion.Parse("[EtaCarPoints]", "n ", ModAndConst, ConstAndValue);
	private double T0= RegularExpresion.Parse("[EtaCarPoints]", "T0 ", ModAndConst, ConstAndValue);
	private double T1= RegularExpresion.Parse("[EtaCarPoints]", "T1 ", ModAndConst, ConstAndValue);
	private double T2= RegularExpresion.Parse("[EtaCarPoints]", "T2 ", ModAndConst, ConstAndValue);
	private double T3= RegularExpresion.Parse("[EtaCarPoints]", "T3 ", ModAndConst, ConstAndValue);
	private double T4= RegularExpresion.Parse("[EtaCarPoints]", "T4 ", ModAndConst, ConstAndValue);
	private double T5= RegularExpresion.Parse("[EtaCarPoints]", "T5 ", ModAndConst, ConstAndValue);
	private double T6= RegularExpresion.Parse("[EtaCarPoints]", "T6 ", ModAndConst, ConstAndValue);
	private double T7= RegularExpresion.Parse("[EtaCarPoints]", "T7 ", ModAndConst, ConstAndValue);
	private double T8= RegularExpresion.Parse("[EtaCarPoints]", "T8 ", ModAndConst, ConstAndValue);
	private double T9= RegularExpresion.Parse("[EtaCarPoints]", "T9 ", ModAndConst, ConstAndValue);
	private double T10= RegularExpresion.Parse("[EtaCarPoints]", "T10 ", ModAndConst, ConstAndValue);
	private double T11= RegularExpresion.Parse("[EtaCarPoints]", "T11 ", ModAndConst, ConstAndValue);
	private double T12= RegularExpresion.Parse("[EtaCarPoints]", "T12 ", ModAndConst, ConstAndValue);
	private double T13= RegularExpresion.Parse("[EtaCarPoints]", "T13 ", ModAndConst, ConstAndValue);
	private double T14= RegularExpresion.Parse("[EtaCarPoints]", "T14 ", ModAndConst, ConstAndValue);
	private double T15= RegularExpresion.Parse("[EtaCarPoints]", "T15 ", ModAndConst, ConstAndValue);
	private double T16= RegularExpresion.Parse("[EtaCarPoints]", "T16 ", ModAndConst, ConstAndValue);
	private double T17= RegularExpresion.Parse("[EtaCarPoints]", "T17 ", ModAndConst, ConstAndValue);
	private double T18= RegularExpresion.Parse("[EtaCarPoints]", "T18 ", ModAndConst, ConstAndValue);
	private double T19= RegularExpresion.Parse("[EtaCarPoints]", "T19 ", ModAndConst, ConstAndValue);
	private double T20= RegularExpresion.Parse("[EtaCarPoints]", "T20 ", ModAndConst, ConstAndValue);
	private double T21= RegularExpresion.Parse("[EtaCarPoints]", "T21 ", ModAndConst, ConstAndValue);
	private double T22= RegularExpresion.Parse("[EtaCarPoints]", "T22 ", ModAndConst, ConstAndValue);
	private double T23= RegularExpresion.Parse("[EtaCarPoints]", "T23 ", ModAndConst, ConstAndValue);
	private double T24= RegularExpresion.Parse("[EtaCarPoints]", "T24 ", ModAndConst, ConstAndValue);
	private double T25= RegularExpresion.Parse("[EtaCarPoints]", "T25 ", ModAndConst, ConstAndValue);
	private double T26= RegularExpresion.Parse("[EtaCarPoints]", "T26 ", ModAndConst, ConstAndValue);
	private double T27= RegularExpresion.Parse("[EtaCarPoints]", "T27 ", ModAndConst, ConstAndValue);
		
	private double eta0= RegularExpresion.Parse("[EtaCarPoints]", "eta0 ", ModAndConst, ConstAndValue);
	private double eta1= RegularExpresion.Parse("[EtaCarPoints]", "eta1 ", ModAndConst, ConstAndValue);
	private double eta2= RegularExpresion.Parse("[EtaCarPoints]", "eta2 ", ModAndConst, ConstAndValue);
	private double eta3= RegularExpresion.Parse("[EtaCarPoints]", "eta3 ", ModAndConst, ConstAndValue);
	private double eta4= RegularExpresion.Parse("[EtaCarPoints]", "eta4 ", ModAndConst, ConstAndValue);
	private double eta5= RegularExpresion.Parse("[EtaCarPoints]", "eta5 ", ModAndConst, ConstAndValue);
	private double eta6= RegularExpresion.Parse("[EtaCarPoints]", "eta6 ", ModAndConst, ConstAndValue);
	private double eta7= RegularExpresion.Parse("[EtaCarPoints]", "eta7 ", ModAndConst, ConstAndValue);
	private double eta8= RegularExpresion.Parse("[EtaCarPoints]", "eta8 ", ModAndConst, ConstAndValue);
	private double eta9= RegularExpresion.Parse("[EtaCarPoints]", "eta9 ", ModAndConst, ConstAndValue);
	private double eta10= RegularExpresion.Parse("[EtaCarPoints]", "eta10 ", ModAndConst, ConstAndValue);
	private double eta11= RegularExpresion.Parse("[EtaCarPoints]", "eta11 ", ModAndConst, ConstAndValue);
	private double eta12= RegularExpresion.Parse("[EtaCarPoints]", "eta12 ", ModAndConst, ConstAndValue);
	private double eta13= RegularExpresion.Parse("[EtaCarPoints]", "eta13 ", ModAndConst, ConstAndValue);
	private double eta14= RegularExpresion.Parse("[EtaCarPoints]", "eta14 ", ModAndConst, ConstAndValue);
	private double eta15= RegularExpresion.Parse("[EtaCarPoints]", "eta15 ", ModAndConst, ConstAndValue);
	private double eta16= RegularExpresion.Parse("[EtaCarPoints]", "eta16 ", ModAndConst, ConstAndValue);
	private double eta17= RegularExpresion.Parse("[EtaCarPoints]", "eta17 ", ModAndConst, ConstAndValue);
	private double eta18= RegularExpresion.Parse("[EtaCarPoints]", "eta18 ", ModAndConst, ConstAndValue);
	private double eta19= RegularExpresion.Parse("[EtaCarPoints]", "eta19 ", ModAndConst, ConstAndValue);
	private double eta20= RegularExpresion.Parse("[EtaCarPoints]", "eta20 ", ModAndConst, ConstAndValue);
	private double eta21= RegularExpresion.Parse("[EtaCarPoints]", "eta21 ", ModAndConst, ConstAndValue);
	private double eta22= RegularExpresion.Parse("[EtaCarPoints]", "eta22 ", ModAndConst, ConstAndValue);
	private double eta23= RegularExpresion.Parse("[EtaCarPoints]", "eta23 ", ModAndConst, ConstAndValue);
	private double eta24= RegularExpresion.Parse("[EtaCarPoints]", "eta24 ", ModAndConst, ConstAndValue);
	private double eta25= RegularExpresion.Parse("[EtaCarPoints]", "eta25 ", ModAndConst, ConstAndValue);
	private double eta26= RegularExpresion.Parse("[EtaCarPoints]", "eta26 ", ModAndConst, ConstAndValue);
	private double eta27= RegularExpresion.Parse("[EtaCarPoints]", "eta27 ", ModAndConst, ConstAndValue);
	
	private double FileType= RegularExpresion.Parse("[ImageSettings]", "FileType ", ModAndConst, ConstAndValue);
	

//	double meth() {
//		return pi;
//	}
}
