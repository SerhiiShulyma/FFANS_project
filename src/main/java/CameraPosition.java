public class CameraPosition extends FF_Coordinate_Vector_3D{
	int pts;
	public CameraPosition (double x, double y, double z, int pts) {
		super (x, y, z);
		this.pts=pts;
	}
}
