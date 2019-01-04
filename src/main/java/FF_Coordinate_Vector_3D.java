public class FF_Coordinate_Vector_3D extends Vector_2D{
		public double z; 
		public FF_Coordinate_Vector_3D(double x, double y, double z) {
			super(x, y);
			this.z=z;
		}
		
		public static double MUL (FF_Coordinate_Vector_3D A, FF_Coordinate_Vector_3D B) {
			double Multiplication=((A.x)*(B.x)+(A.y)*(B.y)+(A.z)*(B.z));
			return Multiplication;
		}
}
