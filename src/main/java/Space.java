

public class Space {
	Parameters param_space=new Parameters("D:\\Workspace\\FFANS_Project\\ffans_project\\File_Ini\\ff_model_parameters.ini");	
	//Initiation of dispersed particles
	Model_Size_Dispersion_Init model_size_dispers = new Model_Size_Dispersion_Init();

    //Space Dimension
	public double Lx;
	public double Ly;
	public double Lz;
	int p, tp, p_prev;
	double theta, phi;
	FF_Coordinate_Vector_3D dr;
	double dR;
	double dr_min;
	int cont_flag;
	long i_attempt;
	FF_Coordinate_Vector_3D 	m_tot_glob;
	FF_Coordinate_Vector_3D  []   r;
	FF_Coordinate_Vector_3D  []   v;
	FF_Coordinate_Vector_3D  []   Rp;
	FF_Coordinate_Vector_3D  []   w;
	FF_Coordinate_Vector_3D  []   drt_r;
	FF_Coordinate_Vector_3D  []   dw_r;
	FF_Coordinate_Vector_3D  []   dvt_r;
	FF_Coordinate_Vector_3D  []   dphi_r;
	double			         []   Rp_to_c;
	double gradL;
	boolean		             []   exist_p;
	int                      []   m_sat;
	int 	                 []   is_temp_sat;
	double					 []	  G_dd;
	
	//
	Space (double a_x, double a_y, double a_z){
	   Lx = param_space.nano_size*1E-9*a_x;
	   Ly = param_space.nano_size*1E-9*a_y;
	   Lz = param_space.nano_size*1E-9*a_z;
		
	   gradL				=Lx/2.0;
	   m_tot_glob			=new FF_Coordinate_Vector_3D(0, 0, 0);
	   r				    =new FF_Coordinate_Vector_3D[param_space.pN+1];//particles position
	   v				    =new FF_Coordinate_Vector_3D[param_space.pN+1];//particles velocity
	   Rp				    =new FF_Coordinate_Vector_3D[param_space.pN+1];//particles radius
	   w				    =new FF_Coordinate_Vector_3D[param_space.pN+1];//angular velocity vector
	   drt_r				=new FF_Coordinate_Vector_3D[param_space.pN+1];//
	   dw_r				    =new FF_Coordinate_Vector_3D[param_space.pN+1];//
	   dvt_r			    =new FF_Coordinate_Vector_3D[param_space.pN+1];//
	   dphi_r				=new FF_Coordinate_Vector_3D[param_space.pN+1];//
	   Rp_to_c			    =new double  [param_space.pN+1];//
	   exist_p              =new boolean [param_space.pN+1];//particle existence; number of primary aggregate inside
	   m_sat		        =new int     [param_space.pN+1];//
	   is_temp_sat          =new int     [param_space.pN+1];//temperature saturation flag
	   G_dd         		=new double  [param_space.pN+1];//dipole-dipole energy
	   
	   p=1;
       //random coordinate generation of particles 	   
	   do {	
		   boolean particles_overlap =false;
		   //Ideal Superparamagnetic Gas Distribution of Particles
		   if(param_space.start_ideal) {
			     //random generation of particles position WITHOUT their overlapping 
            	 do {
            		 particles_overlap=false;
            		 //uniform distribution of particles in space Lx*Ly*Lz
	            	 r[p] = new FF_Coordinate_Vector_3D(param_space.start_scale*(model_size_dispers.Rp[p]-0.49*Lx+((2*0.49*Lx-model_size_dispers.Rp[p])*RandomVariable.uniform_rand())), 
	            									    param_space.start_scale*(model_size_dispers.Rp[p]-0.49*Ly+((2*0.49*Ly-model_size_dispers.Rp[p])*RandomVariable.uniform_rand())),
	            									    param_space.start_scale*(model_size_dispers.Rp[p]-0.49*Lz+((2*0.49*Lz-model_size_dispers.Rp[p])*RandomVariable.uniform_rand())));  
		            //particles' radius-vector scalar multiplication 
	            	 Rp_to_c[p] = Math.sqrt(FF_Coordinate_Vector_3D.MUL(r[p], r[p]));
		
	            	 for (tp = 1; tp < p && !particles_overlap; tp++) {	            		 
	            		 dr = new FF_Coordinate_Vector_3D(r[p].x - r[tp].x, r[p].y - r[tp].y, r[p].z - r[tp].z);
			             //distance between two particles
	            		 dR = Math.sqrt(FF_Coordinate_Vector_3D.MUL( dr, dr ));
	            		 //particles' overlapping condition 
	            		 particles_overlap = (dR <= model_size_dispers.Rp0[p] + model_size_dispers.Rp0[tp] + param_space.delta_r_init);
	            		 }
	            	 } while (particles_overlap);		    
		    }
		   //
		   else {
			   p_prev=1;
			   if (p==1){
				   r[p]    =   new FF_Coordinate_Vector_3D(0, 0, 0);   
			   }
			   else {
				   
			   }
			   
		   }
	         // initiation of base particles' condition
		   	v[p]      =     new FF_Coordinate_Vector_3D(0, 0, 0);
		   	w[p]      =     new FF_Coordinate_Vector_3D(0, 0, 0);
		   	drt_r[p]  =	    new FF_Coordinate_Vector_3D(0, 0, 0);
		   	dphi_r[p] =	 	new FF_Coordinate_Vector_3D(0, 0, 0);
		   	dvt_r[p]  =	 	new FF_Coordinate_Vector_3D(0, 0, 0);
		   	dw_r[p]   =	 	new FF_Coordinate_Vector_3D(0, 0, 0);
		   	w[p]      =	 	new FF_Coordinate_Vector_3D(0, 0, 0);	    
      	
		   	exist_p[p]     =true;
		   	m_sat[p]       =0;
		   	is_temp_sat[p] =0;
		   	G_dd[p]        =0;
		   	p++;
		   } while (p<=param_space.pN);

	}
}
