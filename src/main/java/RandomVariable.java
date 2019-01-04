import org.apache.commons.math3.random.MersenneTwister;

public class RandomVariable {
	/** Initialize Mersenne Twister generator. */
	  private static MersenneTwister rnd  = new MersenneTwister();
	  
//Random Gauss distribution (normal distribution)
	  public static double normal_rand(){
	      return rnd.nextGaussian();	
	  }
//Random uniform distribution	  
	  public static double uniform_rand() {
		  return rnd.nextDouble();
	  }
}
