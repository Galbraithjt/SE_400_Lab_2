/**
 * Created by Josh on 4/18/2017.
 */
public class GravitationalPullSensor extends LocationSensor
{
    private double gravitationalConstant = 0;

    @Override
    public void powerOn()
    {
        getGravitationalConstant();
    }

    public double getGravitationalConstant()
    {
        return gravitationalConstant;
    }
}
